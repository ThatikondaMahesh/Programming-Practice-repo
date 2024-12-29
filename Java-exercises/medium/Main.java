import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class to manage the database connection.
 */
 class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/banking";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    /**
     * Get the database connection.
     *
     * @return The connection object.
     * @throws SQLException If a database access error occurs.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}



/**
 * Data Access Object for customer operations.
 */
 class CustomerDAO {
    /**
     * Add a new customer to the database.
     *
     * @param customer The customer to be added.
     * @throws SQLException If a database access error occurs.
     */
    public void addCustomer(Customer customer) throws SQLException {
        String query = "INSERT INTO customers (customerId, name, balance) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, customer.getCustomerId());
            stmt.setString(2, customer.getName());
            stmt.setDouble(3, customer.getBalance());
            stmt.executeUpdate();
        }
    }

    /**
     * Remove a customer from the database by ID.
     *
     * @param customerId The ID of the customer to be removed.
     * @throws SQLException If a database access error occurs.
     */
    public void removeCustomer(String customerId) throws SQLException {
        String query = "DELETE FROM customers WHERE customerId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, customerId);
            stmt.executeUpdate();
        }
    }

    /**
     * Get a customer from the database by ID.
     *
     * @param customerId The ID of the customer to be fetched.
     * @return The customer object if found, otherwise null.
     * @throws SQLException If a database access error occurs.
     */
    public Customer getCustomer(String customerId) throws SQLException {
        String query = "SELECT * FROM customers WHERE customerId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, customerId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getString("customerId"), rs.getString("name"), rs.getDouble("balance"));
            }
        }
        return null;
    }

    /**
     * Update a customer's balance in the database.
     *
     * @param customerId The ID of the customer.
     * @param balance    The new balance.
     * @throws SQLException If a database access error occurs.
     */
    public void updateBalance(String customerId, double balance) throws SQLException {
        String query = "UPDATE customers SET balance = ? WHERE customerId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, balance);
            stmt.setString(2, customerId);
            stmt.executeUpdate();
        }
    }
}



/**
 * Class to manage bank customers.
 */
 class CustomerManager {
    private CustomerDAO customerDAO;

    /**
     * Initialize the CustomerManager.
     */
    public CustomerManager() {
        customerDAO = new CustomerDAO();
    }

    /**
     * Add a new customer.
     *
     * @param customer The customer to be added.
     * @throws SQLException If a database access error occurs.
     */
    public void addCustomer(Customer customer) throws SQLException {
        customerDAO.addCustomer(customer);
    }

    /**
     * Remove a customer by ID.
     *
     * @param customerId The ID of the customer to be removed.
     * @throws SQLException If a database access error occurs.
     */
    public void removeCustomer(String customerId) throws SQLException {
        customerDAO.removeCustomer(customerId);
    }

    /**
     * Get a customer by ID.
     *
     * @param customerId The ID of the customer to be fetched.
     * @return The customer object if found, otherwise null.
     * @throws SQLException If a database access error occurs.
     */
    public Customer getCustomer(String customerId) throws SQLException {
        return customerDAO.getCustomer(customerId);
    }

    /**
     * Deposit money into a customer's account.
     *
     * @param customerId The ID of the customer.
     * @param amount     The amount to be deposited.
     * @throws SQLException If a database access error occurs.
     */
    public void deposit(String customerId, double amount) throws SQLException {
        Customer customer = customerDAO.getCustomer(customerId);
        if (customer != null) {
            customer.deposit(amount);
            customerDAO.updateBalance(customerId, customer.getBalance());
        }
    }

    /**
     * Withdraw money from a customer's account.
     *
     * @param customerId The ID of the customer.
     * @param amount     The amount to be withdrawn.
     * @throws SQLException If a database access error occurs.
     */
    public void withdraw(String customerId, double amount) throws SQLException {
        Customer customer = customerDAO.getCustomer(customerId);
        if (customer != null && customer.withdraw(amount) != -1) {
            customerDAO.updateBalance(customerId, customer.getBalance());
        }
    }

    /**
     * Get the balance of a customer's account.
     *
     * @param customerId The ID of the customer.
     * @return The current balance if customer is found, otherwise -1.
     * @throws SQLException If a database access error occurs.
     */
    public double getBalance(String customerId) throws SQLException {
        Customer customer = customerDAO.getCustomer(customerId);
        if (customer != null) {
            return customer.getBalance();
        }
        return -1;
    }
}



/**
 * Class to provide the user interface for the banking application.
 */
 class BankingUI {
    private static CustomerManager customerManager = new CustomerManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. Get Customer Details");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Get Balance");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        addCustomer();
                        break;
                    case 2:
                        removeCustomer();
                        break;
                    case 3:
                        getCustomerDetails();
                        break;
                    case 4:
                        depositMoney();
                        break;
                    case 5:
                        withdrawMoney();
                        break;
                    case 6:
                        getBalance();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void addCustomer() throws SQLException {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Customer customer = new Customer(customerId, name, balance);
        customerManager.addCustomer(customer);
        System.out.println("Customer added successfully!");
    }

    private static void removeCustomer() throws SQLException {
        System.out.print("Enter customer ID to remove: ");
        String customerId = scanner.nextLine();
        customerManager.removeCustomer(customerId);
        System.out.println("Customer removed successfully!");
    }

    private static void getCustomerDetails() throws SQLException {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        Customer customer = customerManager.getCustomer(customerId);
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Balance: " + customer.getBalance());
        } else {
            System.out.println("Customer not found!");
        }
    }

    private static void depositMoney() throws SQLException {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        customerManager.deposit(customerId, amount);
        System.out.println("Money deposited successfully!");
    }

    private static void withdrawMoney() throws SQLException {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        customerManager.withdraw(customerId, amount);
        System.out.println("Money withdrawn successfully!");
    }

    private static void getBalance() throws SQLException {
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        double balance = customerManager.getBalance(customerId);
        if (balance != -1) {
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Customer not found!");
        }
    }
}
