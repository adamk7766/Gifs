package pl.akademiakodu.mems.model;

/**
 * Created by TomDom on 2018-03-19.
 */
public class Gif {

    private Long id;

    private String name;

    public Gif() {

    }

    public Gif(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getGifPath() {
        return "gifs/" + name + ".gif";
    }

    @Override
    public String toString() {
        return getName();
    }
}
