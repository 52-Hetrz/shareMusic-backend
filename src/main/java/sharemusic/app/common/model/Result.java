package sharemusic.app.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Result
 * @Author Life
 * @Description
 * @Date 2023/3/11 23:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    T data;
    int code;
    String message;

    public Result<T> success(T data){
        return new Result<>(data, 200,"success");
    }

    public Result<T> fail(int code, String message){
        return new Result<>(null, code, message);
    }

}
