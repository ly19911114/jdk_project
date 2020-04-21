package chapter5;

/**
 * @author LiuYang
 * @date 2020/4/21
 */
public class UserDTO {
    private String userName;
    private Integer age;

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public UserDTO(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
    public UserDTO(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
