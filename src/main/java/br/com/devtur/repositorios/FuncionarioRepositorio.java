package br.com.devtur.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;


import br.com.devtur.model.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {

    @EntityGraph(attributePaths = "endereco")
    List<Funcionario> findAll();

    Optional<Funcionario> findByEmail(String email);
    
}
