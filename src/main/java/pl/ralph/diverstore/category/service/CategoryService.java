package pl.ralph.diverstore.category.service;

import org.springframework.stereotype.Service;
import pl.ralph.diverstore.category.model.Category;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {


    public Category createCategory(Category category) {
        category = new Category("new Category");


        return category;
    }

    public List<Category> findAll() {
        List<Category> categories =List.of(new Category("Category1"), new Category("Category2"), new Category("Category3"));
        return categories;
    }

    public Category findById(UUID id) {
        Category category = new Category("SingleCategory");

        return category;
    }

    public Category updateCategory(UUID id, Category category) {
   category = new Category("updated Category");

        return category;

    }

    public void deleteCategory(UUID id) {
    }
}
