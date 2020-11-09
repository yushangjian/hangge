package com.example.hanggedao.dao;

import com.example.hanggedao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:yushangjian
 * @Date:Created in 17:04 2020/11/3
 */
public interface BookDao extends JpaRepository<Book, Integer> {
}
