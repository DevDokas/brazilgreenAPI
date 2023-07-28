package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.Terpenes;
import com.igordokai.brazilgreen.services.TerpenesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/strain/terpenes")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class TerpenesController {
    private final TerpenesService service;

    @GetMapping
    public ResponseEntity<List<Terpenes>> getData() {
        return ResponseEntity.ok(service.getData());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Terpenes>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody Terpenes terpenes) {
        service.postData(terpenes);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> putData(@PathVariable Long id, @RequestBody Terpenes terpenes) {
        service.putData(id, terpenes);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
