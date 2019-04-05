package com.acordo.certo.controller;

import acordo.certo.domain.model.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import acordo.certo.service.UsuarioService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	List<Usuario> usuarios = new ArrayList<>();

	@Autowired UsuarioService usuarioService;

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listAllUsers() {
		return new ResponseEntity<List<Usuario>>(usuarioService.findAllUsuarios(), HttpStatus.OK);
	}

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody Usuario usuario, UriComponentsBuilder ucBuilder) {
		usuarioService.salvaUsuario(usuario);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/usuario/{id}").buildAndExpand(usuario.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting Usuario with id {}", id);

		usuarioService.removeUsuario(id);

		return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT);
	}
}