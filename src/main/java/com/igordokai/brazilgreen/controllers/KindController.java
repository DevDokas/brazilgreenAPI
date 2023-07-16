package com.igordokai.brazilgreen.controllers;

import com.igordokai.brazilgreen.entities.Kind;
import com.igordokai.brazilgreen.services.KindService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/strain/kind")
public class KindController {
    private final KindService service;

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Kind>> getData() { return ResponseEntity.ok(service.getData());}

    public ResponseEntity<Optional<Kind>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }
}
