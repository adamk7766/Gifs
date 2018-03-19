package pl.akademiakodu.mems.repository;

import org.springframework.stereotype.Component;
import pl.akademiakodu.mems.model.Category;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDaoImplements implements CategoryDao{

    @Override
    public List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Android"));
        categoryList.add(new Category(2, "Funny"));
        categoryList.add(new Category(3, "Programming"));
        return categoryList;
    }


    public CategoryDaoImplements(){
    }

}
