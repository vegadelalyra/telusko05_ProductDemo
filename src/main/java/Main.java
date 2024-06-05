import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // hey, service, add the products...
//        service.addProduct(new Product("Asus Vivabook", "Laptop", "Brown Table", 2022));
//        service.addProduct(new Product("Samsung Galaxy S20", "Smartphone", "Black", 2021));
//        service.addProduct(new Product("Sony PlayStation 5", "Gaming Console", "White", 2020));
//        service.addProduct(new Product("Apple AirPods Pro", "Wireless Earbuds", "White", 2019));
//        service.addProduct(new Product("Nike Air Max 270", "Running Shoes", "Black/Red", 2020));
//        service.addProduct(new Product("Canon EOS Rebel T7", "DSLR Camera", "Black", 2018));
//        service.addProduct(new Product("Amazon Echo Dot", "Smart Speaker", "Charcoal", 2019));
//        service.addProduct(new Product("Nintendo Switch", "Gaming Console", "Neon Blue/Neon Red", 2017));
//        service.addProduct(new Product("Fitbit Charge 4", "Fitness Tracker", "Black", 2020));
//        service.addProduct(new Product("Dell XPS 15", "Laptop", "Silver", 2021));
//        service.addProduct(new Product("LG OLED CX Series", "Smart TV", "Black", 2020));
//        service.addProduct(new Product("Bose QuietComfort 35 II", "Noise-Cancelling Headphones", "Black", 2017));
//        service.addProduct(new Product("Microsoft Surface Pro 7", "Tablet", "Platinum", 2019));
//        service.addProduct(new Product("GoPro HERO9 Black", "Action Camera", "Black", 2020));

        List<Product> products = service.getAllProducts();
        products.forEach(System.out::println);
        System.out.println("==================================================");

//        System.out.println("\nA particular product!");
//        Product aParticularProduct = service.getProduct("GoPro");
//        System.out.println(aParticularProduct);
//        System.out.println("==================================================");
//
//        System.out.println("\nBlack Products o.O");
//        List<Product> blackProducts = service.getProductsWithText("black");
//        blackProducts.forEach(System.out::println);

    }
}
