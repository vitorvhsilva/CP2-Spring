package br.com.tranquilotech.toys.dto;

import br.com.tranquilotech.toys.domain.ClassificacaoBrinquedo;
import br.com.tranquilotech.toys.domain.TipoBrinquedo;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CadastroBrinquedoInputDTO {
    @Size()
    private String nome;
    private TipoBrinquedo tipo;
    private ClassificacaoBrinquedo classificacao;
    private Double tamanho;
    private BigDecimal preco;
}
