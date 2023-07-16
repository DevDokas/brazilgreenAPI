package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.HelpsWith;
import com.igordokai.brazilgreen.services.HelpsWithService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/strain/helps-with")
public class HelpsWithController {

    private final HelpsWithService service;

    @GetMapping
    private ResponseEntity<List<HelpsWith>>getData() { return ResponseEntity.ok(service.getData()); }

    @GetMapping(path = "/{id}")
    private ResponseEntity<Optional<HelpsWith>>getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }

    @PostMapping
    private ResponseEntity<?> postData(@RequestBody HelpsWith helpsWith) {
        service.postData(helpsWith);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    private ResponseEntity<?> putData(@PathVariable Long id, @RequestBody HelpsWith helpsWith) {
        service.putDat(id, helpsWith);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    private ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
