package com.igordokai.brazilgreen.repositories;

import com.igordokai.brazilgreen.entities.Strain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StrainRepository extends JpaRepository<Strain, Long> {
}
