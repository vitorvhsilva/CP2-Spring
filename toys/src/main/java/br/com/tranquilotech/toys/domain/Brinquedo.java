package br.com.tranquilotech.toys.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_BRINQUEDOS")
public class Brinquedo {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_brinquedo")
    private String id;
    @Column(name = "nome_brinquedo", nullable = false)
    private String nome;
    @Column(name = "tipo_brinquedo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoBrinquedo tipo;
    @Column(name = "classificacao_brinquedo", nullable = false)
    @Enumerated(EnumType.STRING)
    private ClassificacaoBrinquedo classificacao;
    @Column(name = "tamanho_brinquedo", nullable = false)
    private Double tamanho;
    @Column(name = "preco_brinquedo", nullable = false)
    private BigDecimal preco;
}
