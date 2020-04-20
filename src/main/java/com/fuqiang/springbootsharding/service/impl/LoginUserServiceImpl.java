package com.fuqiang.springbootsharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fuqiang.springbootsharding.mapper.LoginUserMapper;
import com.fuqiang.springbootsharding.model.param.LoginUserParam;
import com.fuqiang.springbootsharding.model.pojo.LoginUser;
import com.fuqiang.springbootsharding.service.LoginUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * <p>Title: LoginUserServiceImpl</p>
 * <p>Description: LoginUserServiceImpl</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/3 0003 14:23 Create by Fuqiang
 * </pre>
 */
@Service
@Slf4j
public class LoginUserServiceImpl extends ServiceImpl<LoginUserMapper, LoginUser> implements LoginUserService {

    @Autowired
    private LoginUserMapper loginUserMapper;

    @Override
    public void addLoginUser(LoginUserParam param) {
//        String id = PrimaryKeyUtil.getId().toString();
        String id = UUID.randomUUID().toString().replace("-", "");
        LoginUser loginUser = new LoginUser();
        BeanUtils.copyProperties(param, loginUser);
        loginUser.setId(id);
        loginUser.setCreateTime(new Date());
        loginUser.setUpdateTime(new Date());
        loginUserMapper.insert(loginUser);
    }
}
