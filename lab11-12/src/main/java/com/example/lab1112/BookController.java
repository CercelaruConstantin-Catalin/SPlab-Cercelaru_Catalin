package com.example.lab1112;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null; // Handle not found scenario appropriately
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookList;
    }

    @PutMapping("/{Title}")
    public Book setBook(@RequestBody String Title) {
        int newId = bookList.size() + 1;
        Book book = new Book();
        book.setId(newId);
        book.setTitle(Title);
        bookList.add(book);
        return book;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookList.removeIf(book -> book.getId() == id);
    }

    @PostMapping("/postBooks")
    public void postBooks() {
        for (Book book : bookList) {
            System.out.println(book.getId() + " = " + book.getTitle());
        }
    }

}
