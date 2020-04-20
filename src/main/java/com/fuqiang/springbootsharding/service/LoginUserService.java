package com.fuqiang.springbootsharding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fuqiang.springbootsharding.model.param.LoginUserParam;
import com.fuqiang.springbootsharding.model.pojo.LoginUser;

/**
 * <p>Title: LoginUserService</p>
 * <p>Description: LoginUserService</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/3 0003 14:22 Create by Fuqiang
 * </pre>
 */
public interface LoginUserService extends IService<LoginUser> {

    void addLoginUser(LoginUserParam param);
}
