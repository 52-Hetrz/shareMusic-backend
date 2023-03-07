package sharemusic.app.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sharemusic.app.user.service.UserService;
import sharemusic.db.dao.UserDao;
import sharemusic.db.mapper.UserMapper;

/**
 * @ClassName UserServiceImpl
 * @Author Life
 * @Description
 * @Date 2023/3/7 11:51
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserDao getUserById(int id) {

        return userMapper.selectUserById(id);
    }
}
