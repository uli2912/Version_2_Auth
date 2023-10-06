package com.example.booksservice.mapper;

import com.example.booksservice.models.Entities.Author;
import com.example.booksservice.models.dtos.AuthorDTO;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AuthorMapper {


    public Author authorDtoToAuthor(AuthorDTO authorDTO) {
        if (Objects.isNull(authorDTO)){
            return null;
        }
        Author author = new Author();
        if (Objects.nonNull(authorDTO.getId())) {
            author.setId(authorDTO.getId());
        }
        author.setName(authorDTO.getName());

        return author;
    }

    public AuthorDTO authorToAuthorDTO(Author author) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        return authorDTO;
    }
}
