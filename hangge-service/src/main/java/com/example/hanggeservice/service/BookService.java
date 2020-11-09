package com.example.hanggeservice.service;

import com.example.hanggedao.entity.Book;

import java.util.List;

/**
 * @Author:yushangjian
 * @Date:Created in 17:05 2020/11/3
 */
public interface BookService {
    public List<Book> allBooks();
    public Book findBookById(Integer id);
}
