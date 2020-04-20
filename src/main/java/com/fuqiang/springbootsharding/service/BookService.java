package com.fuqiang.springbootsharding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fuqiang.springbootsharding.model.pojo.Book;

import java.util.List;

/**
 * <p>Title: BookService</p>
 * <p>Description: BookService</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/7 0007 9:49 Create by Fuqiang
 * </pre>
 */
public interface BookService extends IService<Book> {

    /**
     * book表分库分表添加数据
     */
    void addBook(Book book);

    /**
     * book表全查
     */
    List<Book> queryBook();
}
