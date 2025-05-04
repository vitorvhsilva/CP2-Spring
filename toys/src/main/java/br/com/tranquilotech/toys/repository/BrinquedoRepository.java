package br.com.tranquilotech.toys.repository;

import br.com.tranquilotech.toys.domain.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, String> {
}
