package br.com.tranquilotech.toys.service;

import br.com.tranquilotech.toys.domain.Brinquedo;
import br.com.tranquilotech.toys.dto.CadastroBrinquedoInputDTO;
import br.com.tranquilotech.toys.repository.BrinquedoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrinquedoService {
    private BrinquedoRepository repository;
    private ModelMapper modelMapper;

    public Brinquedo cadastrarBrinquedo(CadastroBrinquedoInputDTO dto) {
        Brinquedo brinquedo = modelMapper.map(dto, Brinquedo.class);
        return repository.save(brinquedo);
    }
}
