package com.nisum.BookService.controller;

import com.nisum.BookService.entity.Book;
import com.nisum.BookService.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> fetchBooks() {
        List<Book> books = bookService.getAllBooks();
        if (books == null || books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
