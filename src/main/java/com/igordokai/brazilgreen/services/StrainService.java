package com.igordokai.brazilgreen.services;

import com.igordokai.brazilgreen.entities.Strain;
import com.igordokai.brazilgreen.repositories.StrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StrainService {
    private final StrainRepository strainRepository;

    public boolean existsById(Long id) { return strainRepository.existsById(id); }

    public List<Strain> getData() { return strainRepository.findAll(); }

    public Optional<Strain> getDataById(Long id) { return  strainRepository.findById(id); }

    public void postData(Strain strain) {
        strainRepository.save(strain);
    }

    public void putData(Long id, Strain strain) {
        if (existsById(id)) {
            strain.setId(id);
            strainRepository.save(strain);
        }
    }

    public void deleteData(Long id) {
        if (existsById(id)) {
            strainRepository.deleteById(id);
        }
    }
}
