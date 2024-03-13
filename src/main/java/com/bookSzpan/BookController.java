package com.bookSzpan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController
{
    
    @Autowired
    BookRepository bookRepository;

    @GetMapping("")
    public int returnTest()
    {
        return 420;
    }
}
