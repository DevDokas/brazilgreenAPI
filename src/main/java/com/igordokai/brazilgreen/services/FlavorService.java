package com.igordokai.brazilgreen.services;

import com.igordokai.brazilgreen.entities.Flavor;
import com.igordokai.brazilgreen.repositories.FlavorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlavorService {
    private final FlavorRepository flavorRepository;

    public boolean existsById(Long id) {
        return flavorRepository.existsById(id);
    }

    public List<Flavor> getData() {
        return flavorRepository.findAll();
    }

    public Optional<Flavor> getDataById(Long id) {
        return flavorRepository.findById(id);
    }

    public void postData(Flavor flavor) {
        flavorRepository.save(flavor);
    }

    public  void putData(Long id, Flavor flavor) {
        if (existsById(id)) {
            flavor.setId(id);
            flavorRepository.save(flavor);
        }
    }

    public void deleteData(Long id) {
        if (existsById(id)) {
            flavorRepository.deleteById(id);
        }
    }
}
