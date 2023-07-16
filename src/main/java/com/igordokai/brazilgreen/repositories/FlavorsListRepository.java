package com.igordokai.brazilgreen.repositories;

import com.igordokai.brazilgreen.entities.FlavorsList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlavorsListRepository extends JpaRepository<FlavorsList, Long> {
}
