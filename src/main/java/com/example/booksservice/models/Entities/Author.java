package com.example.booksservice.models.Entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "authors")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {

    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
            @SequenceGenerator(name = "author_seq",
                    sequenceName = "author_sequence")
    Long id;
    String name;


}
