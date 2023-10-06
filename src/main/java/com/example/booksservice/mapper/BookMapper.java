package com.example.booksservice.mapper;


import com.example.booksservice.models.Entities.Book;
import com.example.booksservice.models.dtos.BookDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Objects;

@Component
public class BookMapper {
    private AuthorMapper authorMapper;

    public BookMapper(AuthorMapper authorMapper) {
        this.authorMapper = authorMapper;
    }

    public Book bookDtoToBook(BookDTO bookDTO) {
        if (Objects.isNull(bookDTO)){
            return null;
        }
        Book book = new Book();
        if (Objects.nonNull(bookDTO.getId())) {
            book.setId(bookDTO.getId());
        }
        book.setName(bookDTO.getName());
        book.setAuthor(authorMapper.authorDtoToAuthor(bookDTO.getAuthorDTO()));
        return book;

    }

    public BookDTO bookToBookDTO(@RequestBody Book book) {
        if (Objects.isNull(book)){
            return null;
        }
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setName(book.getName());
        bookDTO.setAuthorDTO(authorMapper.authorToAuthorDTO(book.getAuthor()));
        return bookDTO;
    }
}
