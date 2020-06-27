package ua.andrej.spring;

/**
 * Created by Марина on 21.06.2020.
 */
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
