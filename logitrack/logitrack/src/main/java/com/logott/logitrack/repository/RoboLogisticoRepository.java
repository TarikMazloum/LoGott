package com.logott.logitrack.repository;

import com.logott.logitrack.model.RoboLogistico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoboLogisticoRepository extends JpaRepository<RoboLogistico, Long> {
    // Você pode adicionar métodos customizados depois, se quiser.
}
