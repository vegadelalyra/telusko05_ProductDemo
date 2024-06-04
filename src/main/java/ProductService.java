import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getProductsWithText(String searchedText) {
        return products.stream()
                .filter(product -> product.toString().toLowerCase()
                        .contains(searchedText.toLowerCase()))
                .collect(Collectors.toList());
    }

}
