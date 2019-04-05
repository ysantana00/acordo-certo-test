package com.acordo.certo.controller;

import com.acordo.certo.model.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	List<Usuario> usuarios = new ArrayList<>();


	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listAllUsers() {
		if(usuarios.isEmpty()) {
			Usuario usuario = new Usuario();
			usuario.setEmail("teste@teste.com");
			usuario.setId(1l);
			usuario.setNome("ADRIANO");
			usuario.setEstado("SP");
			usuario.setIndAtivo(true);
			usuario.setTelefone(212121212);
			usuarios.add(usuario);
		}
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}

	// -------------------Create a Usuario-------------------------------------------

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody Usuario usuario, UriComponentsBuilder ucBuilder) {
		logger.info("Creating Usuario : {}", usuario);

		this.usuarios.add(usuario);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/usuario/{id}").buildAndExpand(usuario.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	// ------------------- Delete a Usuario-----------------------------------------

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting Usuario with id {}", id);

		//usuarios.remove()

		return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT);
	}
}