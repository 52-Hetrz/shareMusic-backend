package sharemusic.app.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserLogin
 * @Author Life
 * @Description
 * @Date 2023/3/11 23:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLogin {
    String name;
    String password;
}
