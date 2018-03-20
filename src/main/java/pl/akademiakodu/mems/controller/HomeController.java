package pl.akademiakodu.mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import pl.akademiakodu.mems.model.Gif;
import pl.akademiakodu.mems.repository.GifDaoImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {


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

    @GetMapping("/search")
    public String search(@RequestParam String q, ModelMap modelMap) {
        List<Gif> gifList = new ArrayList<>();
        gifList.add(gifDaoImpl.searchByName(q));
        if (gifList.get(0) == null) {
            modelMap.put("message", "Nie znaleziono memu");
        } else {
            modelMap.put("gifs", gifList);
        }
        return "home";
    }
}
