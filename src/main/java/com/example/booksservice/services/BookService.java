package com.example.booksservice.services;

import com.example.booksservice.models.dtos.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO save(BookDTO bookDTO);

    List<BookDTO> getBooks();

}
