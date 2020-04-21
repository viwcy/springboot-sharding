package com.fuqiang.springbootsharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fuqiang.basecommons.util.IDWorkerUtil;
import com.fuqiang.springbootsharding.mapper.BookMapper;
import com.fuqiang.springbootsharding.model.pojo.Book;
import com.fuqiang.springbootsharding.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>Title: BookServiceImpl</p>
 * <p>Description: BookServiceImpl</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/7 0007 9:49 Create by Fuqiang
 * </pre>
 */
@Service
@Slf4j
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private IDWorkerUtil idWorkerUtil;

    /**
     * book表分库分表添加数据
     */
    @Override
    public void addBook(Book book) {
        book.setBookId(idWorkerUtil.getIdStr());
        book.setAuthorId(book.getAuthorId());
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());
        bookMapper.insert(book);
        log.info("***** Book表数据添加完成 *****");
    }

    /**
     * book表全查
     */
    @Override
    public List<Book> queryBook() {
        List<Book> list = bookMapper.selectList(null);
        return list;
    }
}
