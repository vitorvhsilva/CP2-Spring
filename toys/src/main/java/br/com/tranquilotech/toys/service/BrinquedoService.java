package br.com.tranquilotech.toys.service;

import br.com.tranquilotech.toys.domain.Brinquedo;
import br.com.tranquilotech.toys.dto.CadastroBrinquedoInputDTO;
import br.com.tranquilotech.toys.exception.BrinquedoNaoEncontradoException;
import br.com.tranquilotech.toys.repository.BrinquedoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public Page<Brinquedo> obterBrinquedos(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Brinquedo obterBrinquedoPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new BrinquedoNaoEncontradoException("Brinquedo não encontrado!"));
    }
}
