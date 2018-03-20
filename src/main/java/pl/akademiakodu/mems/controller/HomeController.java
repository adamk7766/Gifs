package pl.akademiakodu.mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.mems.repository.GifDaoImpl;

@Controller
public class HomeController{


    @Autowired
    private GifDaoImpl gifDaoImpl;

    @GetMapping("/")
    public String main(ModelMap modelMap) {
        modelMap.put("gifs", gifDaoImpl.findAll());
        return "home";
    }

    @GetMapping("gif/{name}")
    public String edit(@PathVariable String name, ModelMap modelMap) {
        modelMap.put("gif", gifDaoImpl.findByName(name));
        return "gif-details";
    }
}
