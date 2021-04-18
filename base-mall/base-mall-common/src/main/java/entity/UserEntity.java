package entity;

import lombok.Data;

/**
 * @author HT
 * @date 2021/4/4
 **/
@Data
public class UserEntity extends CommonEntity{

    private String userName;

    private String password;

    private Integer gender;

}
