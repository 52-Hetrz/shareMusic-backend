package sharemusic.app.user.restful;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sharemusic.app.user.service.UserService;
import sharemusic.db.dao.UserDao;
import sharemusic.db.mapper.UserMapper;

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

    @GetMapping("/getInfo/{id}")
    public String getInfo(@PathVariable("id") Integer id){
        UserDao userDao = userService.getUserById(id);
        return userDao.getName();
    }
}
