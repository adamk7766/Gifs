package pl.akademiakodu.mems.model;

import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Component;
import pl.akademiakodu.mems.repository.GifDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TomDom on 2018-03-19.
 */
@Component
public class GifDaoImpl implements GifDAO{


    @Override
    public List<Gif> findAll() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif((1L), "android-explosion"));
        gifs.add(new Gif((2L), "ben-and-mike"));
        gifs.add(new Gif((3L), "book-dominos"));
        gifs.add(new Gif((4L), "compiler-bot"));
        gifs.add(new Gif((5L), "cowboy-coder"));
        gifs.add(new Gif((6L), "infinite-andrew"));

        return gifs;
    }
}
