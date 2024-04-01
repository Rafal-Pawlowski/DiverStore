package pl.ralph.diverstore.product.service;

import org.springframework.stereotype.Service;
import pl.ralph.diverstore.product.model.Product;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    public Product createProduct(Product product) {

        return new Product(product.getName(), product.getPrice());
    }

    public List<Product> findAllProducts() {
        List<Product>products = List.of(new Product("Maska", 200.00),
                new Product("Pianka neoprenowa", 500.00),
                new Product("Automat oddechowy", 2040.00));

        return products;
    }

    public Product getSingleProduct(UUID id) {
        Product product = new Product("Swimming pants", 15.09);
        return product;

    }

    public Product updateProduct(UUID id, Product productRequest) {
        Product product = new Product("Before update", 100.00);
        product.setName("product updated");
        return product;
    }

    public void deleteProduct(UUID id) {
    }
}
