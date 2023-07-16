package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.Flavor;
import com.igordokai.brazilgreen.services.FlavorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/strain/flavor")
public class FlavorController {
    private final FlavorService service;

    @GetMapping
    public ResponseEntity<List<Flavor>> getData() {
        return ResponseEntity.ok(service.getData());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Flavor>> getDataById(@PathVariable Long id){
        return ResponseEntity.ok(service.getDataById(id));
    }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody Flavor flavor) {
        service.postData(flavor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> putData(@PathVariable Long id, @RequestBody Flavor flavor) {
        service.putData(id, flavor);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
