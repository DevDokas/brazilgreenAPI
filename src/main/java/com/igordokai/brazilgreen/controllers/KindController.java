package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.Kind;
import com.igordokai.brazilgreen.services.KindService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/strain/kind")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class KindController {
    private final KindService service;

    @GetMapping
    public ResponseEntity<List<Kind>> getData() { return ResponseEntity.ok(service.getData());}

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Kind>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody Kind kind) {
        service.postData(kind);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> putData(@PathVariable Long id, @RequestBody Kind kind) {
        service.putData(id, kind);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
