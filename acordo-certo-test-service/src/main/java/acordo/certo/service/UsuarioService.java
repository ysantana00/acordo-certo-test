package acordo.certo.service;

import acordo.certo.domain.model.Usuario;
import acordo.certo.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

  @Autowired UsuarioRepository usuarioRepository;

  public List<Usuario> findAllUsuarios(){
    return usuarioRepository.findByIndAtivo(true);
  }

  public void salvaUsuario(Usuario usuario){
    usuarioRepository.save(usuario);
  }

  public void removeUsuario(long id) {
    usuarioRepository.inativaUsuario(id);
  }
}
