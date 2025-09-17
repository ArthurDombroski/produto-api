package br.com.bentao.produto_api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bentao.produto_api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByNome (String nome);
    List<Usuario> findByNomeContaining (String parteDoNome);
    
}
