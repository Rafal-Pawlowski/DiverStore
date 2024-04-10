package pl.ralph.diverstore.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ralph.diverstore.product.service.ProductService;

@Controller
@RequestMapping("admin/products")
public class ProductAdminViewController {


    public final ProductService productService;


    public ProductAdminViewController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String indexView(Model model){
        model.addAttribute("products", productService.findAllProducts());
        return "admin/product/index";
    }

}
