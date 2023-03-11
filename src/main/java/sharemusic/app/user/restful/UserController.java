package sharemusic.app.user.restful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sharemusic.app.common.model.BooleanMessage;
import sharemusic.app.common.model.Result;
import sharemusic.app.user.model.UserRegister;
import sharemusic.app.user.service.UserService;
import sharemusic.db.dao.UserDao;

/**
 * @ClassName UserController
 * @Author Life
 * @Description
 * @Date 2023/3/7 11:31
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public Result<String> register(@RequestBody UserRegister registerModel){
        BooleanMessage result = userService.register(registerModel);
        if(result.isSuccess()){
            return new Result<String>().success("注册成功");
        }else{
            return new Result<String>().fail(-100,"注册失败");
        }
    }
}
