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

    static {


        gifs.add(new Gif(1L, "android-explosion","Heniek" ));
        gifs.add(new Gif(2L, "ben-and-mike","Zenek"));
        gifs.add(new Gif(3L, "book-dominos", "Tadek"));
        gifs.add(new Gif(4L, "compiler-bot", "Władek"));
        gifs.add(new Gif(5L, "cowboy-coder","Ziuta"));
        gifs.add(new Gif(6L, "infinite-andrew","Krycha"));

    }

    public GifDaoImpl() {}

    @Override
    public List<Gif> findAll(){
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif(1L,"android-explosion",1, true));
        gifs.add(new Gif(2L,"ben-and-mike",2, false));
        gifs.add(new Gif(3L,"book-dominos",3, false));
        gifs.add(new Gif(4L,"compiler-bot",1, true));
        gifs.add(new Gif(5L,"cowboy-coder",2, true));
        gifs.add(new Gif(6L,"infinite-andrew",3, false));
        return gifs;
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
