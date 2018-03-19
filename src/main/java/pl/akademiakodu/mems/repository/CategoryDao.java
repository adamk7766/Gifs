package pl.akademiakodu.mems.repository;

import pl.akademiakodu.mems.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll();
}
