package pl.akademiakodu.mems.repository;

import pl.akademiakodu.mems.model.Gif;

import java.util.List;

/**
 * Created by TomDom on 2018-03-19.
 */

public interface GifDAO {
    public default List<Gif> findAll(){
        return findAll();
    }
}
