package com.igordokai.brazilgreen.services;

import com.igordokai.brazilgreen.entities.PositiveEffects;
import com.igordokai.brazilgreen.repositories.PositiveEffectsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PositiveEffectsService {
    private final PositiveEffectsRepository positiveEffectsRepository;

    public boolean existsById(Long id) {
        return positiveEffectsRepository.existsById(id);
    }

    public List<PositiveEffects> getData() {
        return positiveEffectsRepository.findAll();
    }

    public Optional<PositiveEffects> getDataById(Long id) {
        return positiveEffectsRepository.findById(id);
    }

    public void postData(PositiveEffects positiveEffects) {
        positiveEffectsRepository.save(positiveEffects);
    }

    public void putData(Long id, PositiveEffects positiveEffects) {
        if (existsById(id)) {
            positiveEffects.setId(id);
            positiveEffectsRepository.save(positiveEffects);
        }
    }

    public void deleteData(Long id) {
        if (existsById(id)) {
            positiveEffectsRepository.deleteById(id);
        }
    }
}
