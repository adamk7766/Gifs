package pl.akademiakodu.mems.model;

import org.springframework.stereotype.Component;
import pl.akademiakodu.mems.repository.GifDAO;

import java.util.ArrayList;
import java.util.List;


@Component
public class GifDaoImpl implements GifDAO{

    @Override
    public List<Gif> findAll() {
        return null;
    }
}
