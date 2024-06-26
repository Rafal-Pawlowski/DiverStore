package pl.ralph.diverstore.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.ralph.diverstore.product.domain.model.Product;
import pl.ralph.diverstore.product.service.ProductService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/producers/{producer-id}/products")
public class ProductApiController {


    private final ProductService productService;

    public ProductApiController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@PathVariable("producer-id") UUID id,
                              @RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Product> getProducts(@PathVariable("producer-id") UUID id) {
        return productService.findAllProducts();
    }

    @GetMapping("{product-id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Product getProduct(@PathVariable("producer-id") UUID producerId,
                              @PathVariable("product-id") UUID productId) {
        return productService.getSingleProduct(producerId, productId);
    }

    @PutMapping("{product-id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Product updateProduct(@PathVariable("producer-id") UUID producerId,
                                 @PathVariable("product-id") UUID productId,
                                 @RequestBody Product product) {
        return productService.updateProduct(producerId, productId, product);
    }

    @DeleteMapping("{product-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable("producer-id") UUID producerId,
                              @PathVariable("product-id") UUID productId) {
        productService.deleteProduct(productId);
    }


}
