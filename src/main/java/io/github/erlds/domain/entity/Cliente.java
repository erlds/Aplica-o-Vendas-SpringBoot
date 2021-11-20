package io.github.erlds.domain.entity;

import javax.persistence.*;
import java.util.Set;

// A anotation @Table seria necessária caso fosse usado uma tabela com nome diferente da unidade

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
    private String nome;

    // Atributo necessário para o mapeamento
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
