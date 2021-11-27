package io.github.erlds.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "produto")
@NoArgsConstructor
@AllArgsConstructor
// Essa anotation elimina a necessidade de indicar @Getter,@Setter,
// @RequiredArgsConstructor, @ToString e @EqualsAndHashCode.
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String descricao;

    @Column(name = "preco_unitario")
    private BigDecimal preco;

}
