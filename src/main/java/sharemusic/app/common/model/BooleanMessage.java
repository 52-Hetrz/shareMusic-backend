package sharemusic.app.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName BooleanMessage
 * @Author Life
 * @Description 将boolean和String封装为一个对象，当既需要判断函数是否成功，又需要获取具体描述信息时可使用
 * @Date 2023/3/12 00:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BooleanMessage {
    boolean isSuccess;
    String message;

    /**
     * 封装处理成功的对象类，isSuccess为true
     * @param message 具体信息
     * @return tBooleanMessage
     */
    public static BooleanMessage failMessage(String message){
        return new BooleanMessage(false,message);
    }

    /**
     * 封装处理成功的对象类，isSuccess为false
     * @param message 具体信息
     * @return BooleanMessage
     */
    public static BooleanMessage successMessage(String message){
        return new BooleanMessage(true, message);
    }
}
