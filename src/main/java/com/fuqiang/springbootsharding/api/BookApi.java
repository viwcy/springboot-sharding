package com.fuqiang.springbootsharding.api;

import com.fuqiang.basecommons.common.BaseController;
import com.fuqiang.basecommons.common.ResultEntity;
import com.fuqiang.springbootsharding.model.pojo.Book;
import com.fuqiang.springbootsharding.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>Title: BookApi</p>
 * <p>Description: BookApi</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/7 0007 10:02 Create by Fuqiang
 * </pre>
 */
@RestController
@RequestMapping("/book")
public class BookApi extends BaseController {

    @Autowired
    private BookService bookService;

    /**
     * book表分库分表添加数据
     */
    @PostMapping("/add")
    private ResultEntity addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return success();
    }

    /**
     * book表全查
     */
    @GetMapping("/query")
    private ResultEntity queryBook() {
        return success(bookService.queryBook());
    }
}
