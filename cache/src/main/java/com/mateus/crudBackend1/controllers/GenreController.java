package com.mateus.crudBackend1.controllers;

import com.mateus.crudBackend1.services.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;
    private final CacheManager cacheManager;

    @GetMapping
    public ResponseEntity<List<String>> getGenres() {
        return ResponseEntity.ok(genreService.getAllGenres());
    }

    @DeleteMapping("/cache")
    public ResponseEntity<Void> clearCache() {
        cacheManager.getCache("genres").clear();
        return ResponseEntity.noContent().build();
    }
}