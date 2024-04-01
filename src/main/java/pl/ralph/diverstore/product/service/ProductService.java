package pl.ralph.diverstore.product.service;

import org.springframework.stereotype.Service;
import pl.ralph.diverstore.product.domain.model.Product;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    public Product createProduct(Product product) {
        product.setId(UUID.randomUUID());
        return product;
    }

    public List<Product> findAllProducts() {
        List<Product> products = List.of(new Product("Diving mask", 200.00),
                new Product("Wetsuit", 500.00),
                new Product("Breathing device", 2040.00));

        return products;
    }

    public Product getSingleProduct(UUID id) {
        return new Product("Swimming pants" + id, 15.09);

    }

    public Product updateProduct(UUID id, Product productRequest) {
        Product product = new Product("Before update", 100.00);
        product.setName(productRequest.getName());
        return product;
    }

    public void deleteProduct(UUID id) {
    }
}
