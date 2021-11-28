package io.github.erlds.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

// A anotation @Table seria necessária caso fosse usado uma tabela com nome diferente da unidade

@Data
@AllArgsConstructor
@NoArgsConstructor
// Sinaliza essa classe como uma entidade (tabela)
@Entity
public class Cliente {

    //Define a primary key da entidade
    @Id
    // Gera a estratégia usada para geração dos IDs
    @GeneratedValue(strategy = GenerationType.AUTO)
    // A annotation @Column(name = "ID") seria necessária caso id tivesse um nome diferente na tabela
    private Integer id;

    @Column(name = "nome", length = 100)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @Column(name = "cpf", length = 11)
    @NotEmpty(message = "{campo.cpf.obrigatorio}")
    @CPF(message = "{campo.cpf.invalido}")
    private String cpf;

    @JsonIgnore
    // Atributo necessário para o mapeamento
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<Pedido> pedidos;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}
