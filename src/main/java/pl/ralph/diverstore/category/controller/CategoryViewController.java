package pl.ralph.diverstore.category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoryViewController {



    @GetMapping
    public String indexView(){
        return "category/index";
    }


}