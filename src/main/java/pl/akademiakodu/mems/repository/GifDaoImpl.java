package pl.akademiakodu.mems.repository;

import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Component;
import pl.akademiakodu.mems.model.Gif;
import pl.akademiakodu.mems.repository.GifDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TomDom on 2018-03-19.
 */
@Component
public class GifDaoImpl implements GifDAO{

    static List<Gif> gifs = new ArrayList<>();

    @Override
    public List<Gif> findAll() {
        return gifs;
    }



    static {
        gifs.add(new Gif(1L, "android-explosion","Heniek" ));
        gifs.add(new Gif(2L, "ben-and-mike","Zenek"));
        gifs.add(new Gif(3L, "book-dominos", "Tadek"));
        gifs.add(new Gif(4L, "compiler-bot", "Władek"));
        gifs.add(new Gif(5L, "cowboy-coder","Ziuta"));
        gifs.add(new Gif(6L, "infinite-andrew","Krycha"));

    }


    public Gif findByName(String name) {
        for ( Gif gif: gifs){
            if( gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }
}
