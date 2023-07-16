package com.igordokai.brazilgreen.services;

import com.igordokai.brazilgreen.entities.NegativeEffects;
import com.igordokai.brazilgreen.repositories.NegativeEffectsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NegativeEffectsService {
    private final NegativeEffectsRepository negativeEffectsRepository;

    public boolean existsById(Long id) {
        return negativeEffectsRepository.existsById(id);
    }

    public List<NegativeEffects> getData() {
        return negativeEffectsRepository.findAll();
    }

    public Optional<NegativeEffects> getDataById(Long id) {
        return negativeEffectsRepository.findById(id);
    }

    public void postData(NegativeEffects negativeEffects) {
        negativeEffectsRepository.save(negativeEffects);
    }

    public void putData(Long id, NegativeEffects negativeEffects) {
        if (existsById(id)) {
            negativeEffects.setId(id);
            negativeEffectsRepository.save(negativeEffects);
        }
    }

    public void deleteData(Long id) {
        if (existsById(id)) {
            negativeEffectsRepository.deleteById(id);
        }
    }
}
