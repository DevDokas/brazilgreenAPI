package com.igordokai.brazilgreen.repositories;

import com.igordokai.brazilgreen.entities.Flavor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlavorRepository extends JpaRepository<Flavor, Long> {
}
