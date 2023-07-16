package com.igordokai.brazilgreen.services;

import com.igordokai.brazilgreen.entities.Kind;
import com.igordokai.brazilgreen.repositories.KindRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KindService {
    private final KindRepository kindRepository;


    public boolean existById (Long id) {
        return kindRepository.existsById(id);
    }

    public List<Kind> getData() {
        return kindRepository.findAll();
    }

    public Optional<Kind> getDataById(Long id) {
        return kindRepository.findById(id);
    }

    public void postData(Kind kind) {
        kindRepository.save(kind);
    }

    public void putData(Long id, Kind kind) {
        if (existById(id)) {
            kind.setId(id);
            kindRepository.save(kind);
        }
    }

    public void deleteData(Long id) {
        if (existById(id)) {
            kindRepository.deleteById(id);
        }
    }
}
