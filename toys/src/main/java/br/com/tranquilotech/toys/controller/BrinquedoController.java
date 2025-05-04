package br.com.tranquilotech.toys.controller;

import br.com.tranquilotech.toys.domain.Brinquedo;
import br.com.tranquilotech.toys.dto.CadastroBrinquedoInputDTO;
import br.com.tranquilotech.toys.dto.CadastroBrinquedoOutputDTO;
import br.com.tranquilotech.toys.service.BrinquedoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brinquedos")
@AllArgsConstructor
public class BrinquedoController {

    private BrinquedoService brinquedoService;
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<CadastroBrinquedoOutputDTO> cadastrarBrinquedo(@Valid @RequestBody CadastroBrinquedoInputDTO dto) {
        Brinquedo brinquedo = brinquedoService.cadastrarBrinquedo(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.map(brinquedo, CadastroBrinquedoOutputDTO.class));
    }
}
