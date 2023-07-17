package com.igordokai.brazilgreen.services;

import com.igordokai.brazilgreen.entities.Terpenes;
import com.igordokai.brazilgreen.repositories.TerpenesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TerpenesService {
    private final TerpenesRepository terpenesRepository;

    public boolean existsById(Long id) {
        return terpenesRepository.existsById(id);
    }

    public List<Terpenes> getData() {
        return terpenesRepository.findAll();
    }

    public Optional<Terpenes> getDataById(Long id) {
        return terpenesRepository.findById(id);
    }

    public void postData(Terpenes terpenes) {
        terpenesRepository.save(terpenes);
    }

    public void putData(Long id, Terpenes terpenes) {
        if (existsById(id)) {
            terpenes.setId(id);
            terpenesRepository.save(terpenes);
        }
    }

    public void deleteData(Long id) {
        if (existsById(id)) {
            terpenesRepository.deleteById(id);
        }
    }
}
