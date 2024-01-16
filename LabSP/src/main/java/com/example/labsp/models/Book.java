package com.example.labsp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Book extends Section implements Visitee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String title;
    @ManyToMany(targetEntity = Author.class, cascade = CascadeType.ALL)
    @JoinTable(name = "AUTHOR",
            joinColumns = @JoinColumn(name = "NAME"),
            inverseJoinColumns = @JoinColumn(name = "ID"))
    private final List<Author> authorList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }
}
