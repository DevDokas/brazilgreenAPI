package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.Strain;
import com.igordokai.brazilgreen.services.StrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/strain")
@RequiredArgsConstructor
public class StrainController {
    private final StrainService service;

    @GetMapping
    public ResponseEntity<List<Strain>> getData() { return ResponseEntity.ok(service.getData()); }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Strain>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id)); }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody Strain strain) {
        service.postData(strain);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
