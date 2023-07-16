package com.igordokai.brazilgreen.services;

import com.igordokai.brazilgreen.entities.HelpsWith;
import com.igordokai.brazilgreen.repositories.HelpsWithRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HelpsWithService {
    private final HelpsWithRepository helpsWithRepository;

    public boolean existsById(Long id) {
        return helpsWithRepository.existsById(id);
    }

    public List<HelpsWith>getData() {
        return helpsWithRepository.findAll();
    }

    public Optional<HelpsWith>getDataById(Long id) {
        return helpsWithRepository.findById(id);
    }

    public void postData(HelpsWith helpsWith) {
        helpsWithRepository.save(helpsWith);
    }

    public void putDat(Long id, HelpsWith helpsWith) {
        if (existsById(id)) {
            helpsWith.setId(id);
            helpsWithRepository.save(helpsWith);
        }
    }

    public void deleteData(Long id) {
        if (existsById(id)) {
            helpsWithRepository.deleteById(id);
        }
    }
}
