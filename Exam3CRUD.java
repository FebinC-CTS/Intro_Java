import java.util.*;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nProduct ID: " + id +
               "\nName: " + name +
               "\nPrice: " + price +
               "\nQuantity: " + quantity;
    }
}

public class Exam3CRUD {
    static ArrayList<Product> productList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Product
    public static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = sc.nextInt();

        productList.add(new Product(id, name, price, quantity));
        System.out.println("Product Added!");
    }

    // Read Products
    public static void viewProducts() {
        if (productList.isEmpty()) {
            System.out.println("No Products Available!");
        } 
        else {
            System.out.println("Available Products: ");
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }

    // Update Product
    public static void updateProduct() {
        System.out.print("Enter Product ID to Update: ");
        int id = sc.nextInt();
        for (Product p : productList) {
            if (p.id == id) {
                System.out.print("Enter New Name: ");
                sc.nextLine();
                p.name = sc.nextLine();
                System.out.print("Enter New Price: ");
                p.price = sc.nextDouble();
                System.out.print("Enter New Quantity: ");
                p.quantity = sc.nextInt();
                System.out.println("Product Updated Successfully!");
                return;
            }
        }
        System.out.println("Product Not Found!");
    }

    // Delete product
    public static void deleteProduct() {
        System.out.print("Enter Product ID to Delete: ");
        int id = sc.nextInt();
        for (Product p : productList) {
            if (p.id == id) {
                productList.remove(p);
                System.out.println("Product Deleted Successfully!");
                return;
            }
        }
        System.out.println("Product Not Found!");
    }

    // Search product
    public static void searchProduct() {
        System.out.print("Enter Product Name to Search: ");
        sc.nextLine();
        String name = sc.nextLine();
        for (Product p : productList) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("Product Found: " + p);
                return;
            }
        }
        System.out.println("Product Not Found!");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Online Shopping Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Search Product");
            System.out.println("6. Exit");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addProduct(); 
                break;
                case 2: viewProducts(); 
                break;
                case 3: updateProduct(); 
                break;
                case 4: deleteProduct(); 
                break;
                case 5: searchProduct(); 
                break;
                case 6: System.out.println("Exiting..."); 
                break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 6);
    }
}
