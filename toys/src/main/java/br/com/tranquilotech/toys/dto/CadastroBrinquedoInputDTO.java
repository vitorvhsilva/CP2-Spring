package br.com.tranquilotech.toys.dto;

import br.com.tranquilotech.toys.domain.ClassificacaoBrinquedo;
import br.com.tranquilotech.toys.domain.TipoBrinquedo;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CadastroBrinquedoInputDTO {
    @Size(min = 3, message = "O nome deve ter no mínimo 3 letras")
    private String nome;
    @NotNull(message = "É necessário colocar o tipo do brinquedo")
    private TipoBrinquedo tipo;
    @NotNull(message = "É necessário colocar a classificação do brinquedo")
    private ClassificacaoBrinquedo classificacao;
    @NotNull(message = "É necessário colocar o tamanho do brinquedo")
    private Double tamanho;
    @NotNull(message = "É necessário colocar o preço do brinquedo")
    private BigDecimal preco;
}
