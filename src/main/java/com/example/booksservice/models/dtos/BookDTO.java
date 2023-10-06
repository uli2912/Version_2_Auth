package com.example.booksservice.models.dtos;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDTO {
    Long id;
    String name;
    AuthorDTO authorDTO;
}
