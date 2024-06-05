import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection conn = null;

    public ProductDB() {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/telusko",
                    "postgres", "3335780");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean save(Product product) throws SQLException {

        String query = "insert into public.\"Product\" (name, type, place, warranty) values (?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, product.getName());
        st.setString(2, product.getType());
        st.setString(3, product.getPlace());
        st.setInt(4, product.getWarranty());
        return st.execute();
    }

    public List<Product> getAll() throws SQLException {

        List<Product> products = new ArrayList<>();

        String query = "select name, type, place, warranty from public.\"Product\"";
        PreparedStatement st = conn.prepareStatement(query);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Product p = new Product();
            p.setName(rs.getString(1));
            p.setType(rs.getString(2));
            p.setPlace(rs.getString(3));
            p.setWarranty(rs.getInt(4));
            products.add(p);
        }

        return products;
    }
}


