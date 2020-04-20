package com.fuqiang.springbootsharding.api;

import com.fuqiang.basecommons.common.BaseController;
import com.fuqiang.basecommons.common.ResultEntity;
import com.fuqiang.springbootsharding.model.param.LoginUserParam;
import com.fuqiang.springbootsharding.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: LoginUserApi</p>
 * <p>Description: LoginUserApi</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/3 0003 14:27 Create by Fuqiang
 * </pre>
 */
@RestController
@RequestMapping("/loginuser")
public class LoginUserApi extends BaseController {

    @Autowired
    private LoginUserService loginUserService;

    @PostMapping("/add")
    public ResultEntity addLoginUser(@RequestBody LoginUserParam param) {
        loginUserService.addLoginUser(param);
        return success();
    }
}
