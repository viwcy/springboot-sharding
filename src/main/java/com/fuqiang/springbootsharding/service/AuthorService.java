package com.fuqiang.springbootsharding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fuqiang.springbootsharding.model.pojo.Author;

/**
 * <p>Title: AuthorService</p>
 * <p>Description: AuthorService</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/10 0010 9:43 Create by Fuqiang
 * </pre>
 */
public interface AuthorService extends IService<Author> {

    void addAuthor(Author author);
}
