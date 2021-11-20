package io.github.erlds.domain.repository;

import io.github.erlds.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente,Integer> {

    // Consulta pode ser JPQL ou SQL, para trocar para SQL, adiciona-se na annotation o valor nativeQuery
    @Query(value = "select c from Cliente as c where c.nome like :nome")
    List<Cliente> encontrarPorNome( @Param("nome") String nome);

    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);


}
