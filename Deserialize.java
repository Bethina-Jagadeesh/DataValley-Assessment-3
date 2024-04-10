import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

public class Deserialize {
    public static void main(String[] args) {

        try {
            Product product = new Product(1, "Laptop", "Electronics", 999.99);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("product.ser"));
            out.writeObject(product);
            out.close();
            System.out.println("Serialized data is saved in product.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("product.ser"));
            Product product = (Product) in.readObject();
            in.close();

            System.out.println("Deserialized Product:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
