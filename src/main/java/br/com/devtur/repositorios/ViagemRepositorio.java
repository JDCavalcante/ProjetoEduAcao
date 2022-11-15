package br.com.devtur.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devtur.model.Viagem;


public interface ViagemRepositorio extends JpaRepository<Viagem, Long> {

    @EntityGraph(attributePaths = {"cliente"})
    List<Viagem> findAll();
    
}
