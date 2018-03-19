package pl.akademiakodu.mems.model;

import pl.akademiakodu.mems.repository.GifDAO;

/**
 * Created by TomDom on 2018-03-19.
 */
public class Gif{

    private Long id;

    private String name;

    private int idCategory;

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public Gif(){}

    public Gif(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Gif(Long id, String name, int idCategory) {
        this.id = id;
        this.name = name;
        this.idCategory = idCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getGifPath() {
        return "gifs/" + getName() + ".gif";
    }

    @Override
    public String toString() {
        return getName();
    }
}
