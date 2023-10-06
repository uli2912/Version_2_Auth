package com.example.booksservice.controllers;

import com.example.booksservice.models.dtos.BookDTO;
import com.example.booksservice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public BookDTO save(@RequestBody BookDTO bookDTO){
    return bookService.save(bookDTO);
    }

    @GetMapping("/list")
    public List<BookDTO> getBooks() {
        return bookService.getBooks();
    }
}
