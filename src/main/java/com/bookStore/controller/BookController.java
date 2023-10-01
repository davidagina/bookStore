package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }

    @GetMapping("/available_book")
    public String availableBook(){
        return "availableBook";
    }

    @GetMapping("/my_books")
    public String myBooks(){
        return "myBooks";
    }

}
