package pl.ralph.diverstore.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.ralph.diverstore.product.model.Product;
import pl.ralph.diverstore.product.service.ProductService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductApiController {


    private final ProductService productService;

    public ProductApiController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Product addProduct(Product product) {
        return productService.createProduct(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Product> getProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Product getProduct(@PathVariable UUID id) {
        return productService.getSingleProduct(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Product updateProduct(@PathVariable UUID id, Product product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable UUID id){
        productService.deleteProduct(id);
    }




}
