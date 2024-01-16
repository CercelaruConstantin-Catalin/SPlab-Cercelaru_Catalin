package com.example.labsp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

@Entity
@NoArgsConstructor(force = true)
public class Author {
    @Id
    private Integer id;
    private String name;

    public void print() {
        System.out.println(name);
    }

    public Author(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
