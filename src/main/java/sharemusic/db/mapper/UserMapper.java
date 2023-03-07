package sharemusic.db.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import sharemusic.db.dao.UserDao;

/**
 * @ClassName UserMapper
 * @Author Life
 * @Description
 * @Date 2023/3/7 11:19
 */
@Mapper
public interface UserMapper {

    UserDao selectUserById(int id);

}
