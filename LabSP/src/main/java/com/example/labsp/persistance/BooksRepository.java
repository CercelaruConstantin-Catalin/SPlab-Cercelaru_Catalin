package com.example.labsp.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.labsp.models.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}