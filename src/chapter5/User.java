package chapter5;

/**
 * @author LiuYang
 * @date 2020/4/21
 */
public class User {
    private String name;
    private String pwd;
    private Integer age;

    public User(){

    }

    public User(String name, String pwd, Integer age) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public User(Integer age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
