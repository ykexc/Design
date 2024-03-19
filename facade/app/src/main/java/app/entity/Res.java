package app.entity;

public class Res {
    String name;

    Integer age;


    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Res(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}