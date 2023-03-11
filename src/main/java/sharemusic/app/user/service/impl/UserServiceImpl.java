package sharemusic.app.user.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sharemusic.app.common.model.BooleanMessage;
import sharemusic.app.user.model.UserRegister;
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

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public BooleanMessage register(String userName, String password, String email, String number) {
        if(userMapper.selectByUserName(userName).size()>0){
            return BooleanMessage.failMessage("用户名已存在");
        }
        UserDao dao = new UserDao();



        return null;
    }

    @Override
    public BooleanMessage register(UserRegister registerModel) {
        if(userMapper.selectByUserName(registerModel.getName()).size()>0){
            return BooleanMessage.failMessage("用户名已存在");
        }
        UserDao dao = new UserDao();
        BeanUtils.copyProperties(registerModel, dao);
        int id = 0;
        dao.setId(id);
        userMapper.insert(dao);
        return BooleanMessage.successMessage("注册成功");
    }
}
