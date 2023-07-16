package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.NegativeEffects;
import com.igordokai.brazilgreen.services.NegativeEffectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/strain/negative-effects")
public class NegativeEffectsController {
    private final NegativeEffectsService service;

    @GetMapping
    public ResponseEntity<List<NegativeEffects>> getData() {
        return ResponseEntity.ok(service.getData());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<NegativeEffects>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody NegativeEffects negativeEffects) {
        service.postData(negativeEffects);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> putData(@PathVariable Long id, @RequestBody NegativeEffects negativeEffects) {
        service.putData(id, negativeEffects);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
