package com.example.labsp.services;

import org.springframework.stereotype.Service;
import com.example.labsp.models.Book;
import com.example.labsp.persistance.BooksRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BooksRepository booksRepository;
    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAllBooks(){
        return booksRepository.findAll();
    }

    public Optional<Book> getBookById(Integer id) {
        return booksRepository.findById(id);
    }

    public void addBook(Book book) {
        booksRepository.save(book);
    }

    public void editBook(Book book) {
        Optional<Book> bookToEdit = booksRepository.findById(book.getId());

        bookToEdit.ifPresent(b -> {
            b.setTitle(book.getTitle());
            booksRepository.save(b);
        });
    }

    public void deleteBook(Integer id) {
        booksRepository.deleteById(id);
    }
}
