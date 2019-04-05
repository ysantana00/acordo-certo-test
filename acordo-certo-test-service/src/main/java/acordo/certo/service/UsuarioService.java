package acordo.certo.service;

import acordo.certo.domain.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

  List<Usuario> usuarios = new ArrayList<>();

  public List<Usuario> findAllUsuarios(){
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
    return usuarios;
  }



}
