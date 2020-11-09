package com.example.controller;

import com.example.hanggedao.entity.Book;
import com.example.hanggeservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:yushangjian
 * @Date:Created in 17:14 2020/11/3
 */
@RestController
public class HelloController {
    @Autowired
    private BookService bookService;
    @GetMapping("test")
    public List<Book> test() {
        return bookService.allBooks();
    }
    @GetMapping("findBookById/{id}")
    public Book findBookById(@PathVariable("id") Integer id){
        return bookService.findBookById(id);
    }
    @GetMapping("test1")
    public String test1(){
        return "test1";
    }
    @GetMapping("test2")
    public String test2(){
        return "test2";
    }
}
