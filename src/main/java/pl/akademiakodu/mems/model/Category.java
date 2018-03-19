package pl.akademiakodu.mems.model;

public class Category {
    private int id;
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    public Category(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
