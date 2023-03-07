package sharemusic.db.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserDao
 * @Author Life
 * @Description
 * @Date 2023/3/7 11:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDao {
    int autoId;
    String name;
    int id;
}
