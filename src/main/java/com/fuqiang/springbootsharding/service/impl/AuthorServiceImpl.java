package com.fuqiang.springbootsharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fuqiang.basecommons.util.AddressUtil;
import com.fuqiang.basecommons.util.PrimaryKeyUtil;
import com.fuqiang.springbootsharding.mapper.AuthorMapper;
import com.fuqiang.springbootsharding.model.pojo.Author;
import com.fuqiang.springbootsharding.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title: AuthorServiceImpl</p>
 * <p>Description: AuthorServiceImpl</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/10 0010 9:43 Create by Fuqiang
 * </pre>
 */
@Service
@Slf4j
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private PrimaryKeyUtil primaryKeyUtil;

    @Override
    public void addAuthor(Author author) {
        String id = primaryKeyUtil.getId("db0", "author", "id", 6);
        author.setId(id);
        String addressName = AddressUtil.getAddressName(author.getLongitude(), author.getLatitude());
        author.setAddress(addressName);
        authorMapper.insert(author);
        log.info("***** Author数据添加完成 *****");
    }
}
