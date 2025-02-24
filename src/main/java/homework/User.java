package homework;

import com.fasterxml.jackson.annotation.JsonProperty;

class User {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    // Порожній конструктор для Jackson
    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Гетери і сетери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

