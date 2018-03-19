package pl.akademiakodu.mems.model;

import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TomDom on 2018-03-19.
 */
public class GifDaoImpl {

    private List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif((1L), "android-explosion"));
        gifs.add(new Gif((2L), "ben-and-mike"));
        gifs.add(new Gif((3L), "book-dominos.gif"));
        gifs.add(new Gif((4L), "compiler-bot.gifn"));
        gifs.add(new Gif((5L), "cowboy-coder.gif"));
        gifs.add(new Gif((6L), "infinite-andrew.gif"));

        return gifs;
    }
}
