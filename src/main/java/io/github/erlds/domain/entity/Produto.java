package io.github.erlds.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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

    @NotEmpty(message = "{campo.descricao.obrigatorio}")
    private String descricao;

    @Column(name = "preco_unitario")
    @NotNull(message = "{campo.preco.obrigatorio}")
    private BigDecimal preco;

}
