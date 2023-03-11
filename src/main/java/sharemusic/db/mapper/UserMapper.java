package sharemusic.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import sharemusic.db.dao.UserDao;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer autoId);

    int insert(UserDao record);

    UserDao selectByPrimaryKey(Integer autoId);

    List<UserDao> selectByUserName(String userName);

    List<UserDao> selectAll();

    int updateByPrimaryKey(UserDao record);
}