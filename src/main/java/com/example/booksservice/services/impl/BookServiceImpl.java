package com.example.booksservice.services.impl;

import com.example.booksservice.mapper.BookMapper;
import com.example.booksservice.models.Entities.Book;
import com.example.booksservice.models.dtos.BookDTO;
import com.example.booksservice.repository.BookRepo;
import com.example.booksservice.services.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;
    private BookMapper bookMapper;

    public BookServiceImpl(BookRepo bookRepo, BookMapper bookMapper) {
        this.bookRepo = bookRepo;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookDTO save(BookDTO bookDTO) {
        Book book = bookMapper.bookDtoToBook(bookDTO);

        book = bookRepo.save(book);

        bookDTO = bookMapper.bookToBookDTO(book);
        return bookDTO;
    }

    public List<BookDTO> getBooks() {
        List<Book> bookList = bookRepo.findAll();

        List<BookDTO> bookDTOList = bookList.stream()
                .map(x -> bookMapper.bookToBookDTO(x))
                .collect(Collectors.toList());
        return bookDTOList;
    }
}
