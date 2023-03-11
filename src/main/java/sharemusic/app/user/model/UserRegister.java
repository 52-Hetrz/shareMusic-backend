package sharemusic.app.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserRegister
 * @Author Life
 * @Description
 * @Date 2023/3/11 23:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegister {
    String name;
    String password;
    String email;
    String number;
}
