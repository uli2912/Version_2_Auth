package com.example.booksservice.controllers;

import com.example.booksservice.models.dtos.AuthorDTO;
import com.example.booksservice.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    private AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @PostMapping("/save")
    public AuthorDTO save(@RequestBody AuthorDTO authorDTO) {

        return authorService.save(authorDTO);
    }
    @GetMapping("/list")
    public List<AuthorDTO> getAuthors(){
        return null;
    }
}
