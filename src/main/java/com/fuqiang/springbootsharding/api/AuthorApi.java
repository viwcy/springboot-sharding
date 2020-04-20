package com.fuqiang.springbootsharding.api;

import com.fuqiang.basecommons.common.BaseController;
import com.fuqiang.basecommons.common.ResultEntity;
import com.fuqiang.springbootsharding.model.pojo.Author;
import com.fuqiang.springbootsharding.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: AuthorApi</p>
 * <p>Description: AuthorApi</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/10 0010 9:50 Create by Fuqiang
 * </pre>
 */
@RestController
@RequestMapping("/author")
public class AuthorApi extends BaseController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public ResultEntity addAuthor(@RequestBody Author author) {
        authorService.addAuthor(author);
        return success();
    }
}
