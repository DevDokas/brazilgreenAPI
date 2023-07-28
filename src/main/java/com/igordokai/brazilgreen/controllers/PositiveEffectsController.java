package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.PositiveEffects;
import com.igordokai.brazilgreen.services.PositiveEffectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/strain/positive-effects")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PositiveEffectsController {
    private final PositiveEffectsService service;

    @GetMapping
    public ResponseEntity<List<PositiveEffects>> getData() {
        return ResponseEntity.ok(service.getData());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<PositiveEffects>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody PositiveEffects positiveEffects) {
        service.postData(positiveEffects);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> putData(@PathVariable Long id, @RequestBody PositiveEffects positiveEffects) {
        service.putData(id, positiveEffects);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
