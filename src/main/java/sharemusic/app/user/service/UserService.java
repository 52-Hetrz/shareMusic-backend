package sharemusic.app.user.service;

import org.springframework.stereotype.Service;
import sharemusic.app.common.model.BooleanMessage;
import sharemusic.app.user.model.UserRegister;
import sharemusic.db.dao.UserDao;

/**
 * @ClassName UserService
 * @Author Life
 * @Description
 * @Date 2023/3/7 11:50
 */
@Service
public interface  UserService {

    UserDao getUserById(int id);

    /**
     * 用户注册
     * @param userName 用户名
     * @param password 用户密码
     * @param email 用户邮箱
     * @param number 用户手机号码
     * @return  是否注册成功以及结果信息
     */
    BooleanMessage register(String userName, String password, String email, String number);

    /**
     * 用户注册
     * @param registerModel 注册信息封装类
     * @return 知否注册成功以及结果信息
     */
    BooleanMessage register(UserRegister registerModel);

}
