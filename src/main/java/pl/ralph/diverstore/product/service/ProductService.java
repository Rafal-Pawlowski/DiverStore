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
        return null;
    }

    public Product getSingleProduct(UUID id) {
        return null;

    }

    public Product updateProduct(UUID id, Product product) {
        return null;
    }

    public void deleteProduct(UUID id) {
    }
}
