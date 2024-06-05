import java.sql.SQLException;
import java.util.List;

public class ProductService {

    ProductDB productDB = new ProductDB();

    public boolean addProduct(Product product) {
        try {
            return productDB.save(product);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAllProducts() {
        try {
            return productDB.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//
//    public Product getProduct(String name) {
//        for (Product product : products) {
//            if (product.getName().contains(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//
//    public List<Product> getProductsWithText(String searchedText) {
//        return products.stream()
//                .filter(product -> product.toString().toLowerCase()
//                        .contains(searchedText.toLowerCase()))
//                .collect(Collectors.toList());
//    }

}
