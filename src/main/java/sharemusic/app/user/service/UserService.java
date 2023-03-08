package sharemusic.app.user.service;

import org.springframework.stereotype.Service;
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

}
