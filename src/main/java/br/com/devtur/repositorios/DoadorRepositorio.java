package br.com.devtur.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devtur.model.Doador;




public interface DoadorRepositorio extends JpaRepository<Doador, Long> {

    @EntityGraph(attributePaths = "endereco")
    List<Doador> findAll();

    Optional<Doador> findByEmail(String email);
    
}