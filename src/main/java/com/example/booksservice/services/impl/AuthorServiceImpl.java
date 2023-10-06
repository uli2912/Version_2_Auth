package com.example.booksservice.services.impl;

import com.example.booksservice.mapper.AuthorMapper;
import com.example.booksservice.models.Entities.Author;
import com.example.booksservice.models.dtos.AuthorDTO;
import com.example.booksservice.repository.AuthorRepo;
import com.example.booksservice.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepo authorRepo;
    private AuthorMapper authorMapper;

    @Autowired
    public AuthorServiceImpl(AuthorRepo authorRepo, AuthorMapper authorMapper) {

        this.authorRepo = authorRepo;
        this.authorMapper = authorMapper;
    }



    @Override
    public AuthorDTO save(AuthorDTO authorDTO) {

        Author author = authorMapper.authorDtoToAuthor(authorDTO);

        author= authorRepo.save(author);

        authorDTO = authorMapper.authorToAuthorDTO(author);
        return authorDTO;
    }
}
