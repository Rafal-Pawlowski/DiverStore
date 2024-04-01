package pl.ralph.diverstore.category.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.ralph.diverstore.category.domain.model.Category;
import pl.ralph.diverstore.category.service.CategoryService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("categories")
public class CategoryApiController {

    /*
    Create
    POST/ addCategory

    Read
    GET/getCategories
    GET/getCategory

    Update
    PUT/ updateCategory

    Delete
    DELETE/ deleteCategory

     */

    private final CategoryService categoryService;

    public CategoryApiController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category addCategory(Category category){
        return categoryService.createCategory(category);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Category getCategory(@PathVariable UUID id){
        return categoryService.getCategory(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Category updateCategory(@PathVariable UUID id, Category category){
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable UUID id){
        categoryService.deleteCategory(id);
    }









}
