package pl.ralph.diverstore.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ralph.diverstore.category.service.CategoryService;

@Controller
@RequestMapping("admin/categories")
public class CategoryAdminViewController {

public final CategoryService categoryService;

    public CategoryAdminViewController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String indexView(Model model) {
        model.addAttribute("categories", categoryService.getCategories());
        return "admin/category/index";
    }


}
