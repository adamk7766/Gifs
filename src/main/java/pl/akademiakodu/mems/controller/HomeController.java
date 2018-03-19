package pl.akademiakodu.mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.mems.model.Gif;
import pl.akademiakodu.mems.model.GifDaoImpl;
import pl.akademiakodu.mems.repository.GifDAO;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController{

    @Autowired
    private GifDaoImpl gifDaoImpl;

    @GetMapping("/")
    public String main(ModelMap modelMap) {
        modelMap.put("gifs", gifDaoImpl.findAll());
        return "home";
    }

}
