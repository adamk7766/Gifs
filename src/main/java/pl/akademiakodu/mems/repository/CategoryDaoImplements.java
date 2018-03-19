package pl.akademiakodu.mems.repository;

import org.springframework.stereotype.Component;
import pl.akademiakodu.mems.model.Category;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryDaoImplements implements CategoryDao{
    List<Category> categoryList = new ArrayList<>();
    @Override
    public List<Category> findAll() {
        categoryList.add(new Category(1, "Android"));
        categoryList.add(new Category(2, "Funny"));
        categoryList.add(new Category(3, "Programming"));
        return categoryList;
    }

    public CategoryDaoImplements(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public CategoryDaoImplements(){

    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
