package pl.akademiakodu.mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.mems.repository.CategoryDao;

@Controller
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/categories")
    public String findAll(ModelMap modelMap){
        modelMap.put("categories", categoryDao.findAll());
                return "categories";
    }


}
