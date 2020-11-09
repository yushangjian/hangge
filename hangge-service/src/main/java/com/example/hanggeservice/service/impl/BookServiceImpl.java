package com.example.hanggeservice.service.impl;

import com.example.hanggedao.dao.BookDao;
import com.example.hanggedao.entity.Book;
import com.example.hanggeservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:yushangjian
 * @Date:Created in 17:07 2020/11/3
 */
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;
    public List<Book> allBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book findBookById(Integer id) {
        return bookDao.findById(id).get();
    }
}
