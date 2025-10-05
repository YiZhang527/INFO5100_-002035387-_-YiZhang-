import java.util.*;

public class OnlineStoreSystem {
    public static void main(String[] args) {

        String[] orderData = {
                "John,Laptop,1,899.99", "Sarah,Mouse,2,25.50", "Mike,Keyboard,1,75.00",
                "John,Monitor,1,299.99", "Sarah,Laptop,1,899.99", "Lisa,Mouse,3,25.50",
                "Mike,Headphones,1,150.00", "John,Mouse,1,25.50", "Lisa,Keyboard,2,75.00",
                "Sarah,Monitor,2,299.99", "Mike,Monitor,1,299.99", "Lisa,Headphones,1,150.00"
        };

        System.out.println("=== ONLINE STORE ORDER PROCESSING SYSTEM ===");
        System.out.println();
        storeAllOrders(orderData);
        findUniqueCustomers(orderData);
        sortProducts(orderData);
        calculateTotals(orderData);
        processBigOrders(orderData);
        handleReturns(orderData);
    }

    public static void storeAllOrders(String[] orderData) {
        ArrayList<String> orderList = new ArrayList<>(Arrays.asList(orderData));
        int totalOrders = orderList.size();
        System.out.println("STEP 1: Managing orders with ArrayList");
        System.out.println("Total orders: " + totalOrders);
        System.out.println("First 3 orders:");
        System.out.println(orderList.get(0));
        System.out.println(orderList.get(1));
        System.out.println(orderList.get(2));
        System.out.println();
    }

    public static void findUniqueCustomers(String[] orderData) {
        HashSet<String> uniqueCustomers = new HashSet<>();
        for(String order : orderData) {
            String[] parts = order.split(",");
            uniqueCustomers.add(parts[0]);
        }
        System.out.println("STEP 2: Finding customers with HashSet");
        System.out.println("Unique customers: " + uniqueCustomers);
        System.out.println("Total customers: " + uniqueCustomers.size());
        System.out.println();
    }

    public static void sortProducts(String[] orderData) {
        TreeSet<String> sortedProducts = new TreeSet<>();
        for (String order : orderData) {
            String [] parts = order.split(",");
            sortedProducts.add(parts[1]);
        }
        System.out.println("STEP 3: Sorting products with TreeSet");
        System.out.println("Get all product names: " + sortedProducts);
        System.out.println("Total count: " + sortedProducts.size());
        System.out.println();
    }

    public static void calculateTotals(String[] orderData) {
        HashMap<String, Double> customers = new HashMap<>();
        for(String order : orderData) {
            String [] parts = order.split(",");
            String customerName = parts[0];
            int quantity = Integer.parseInt(parts[2]);
            double price = Double.parseDouble(parts[3]);
            double currentTotal = customers.getOrDefault(customerName, 0.0);
            double newTotal = currentTotal + (quantity * price);
            customers.put(customerName, newTotal);
        }

        HashMap<String, Integer> productCount = new HashMap<>();
        for(String order : orderData) {
            String [] parts = order.split(",");
            String productName = parts[1];
            int quantity = Integer.parseInt(parts[2]);
            int currentQuantity = productCount.getOrDefault(productName, 0);
            int newQuantity = currentQuantity + quantity;
            productCount.put(productName, newQuantity);
        }
        System.out.println("Step 4: Calculating totals with HashMap");
        System.out.println("Total spent by each customer: " + customers);
        System.out.println("Total quantity by each product: " + productCount);
        System.out.println();
    }

    public static void processBigOrders(String[] orderData) {
        Queue<String> bigOrders = new LinkedList<>();
        for(String order : orderData) {
            String [] parts = order.split(",");
            int quantity = Integer.parseInt(parts[2]);
            Double price = Double.parseDouble(parts[3]);
            Double totalPrice = quantity * price;
            if (totalPrice >= 200) {
                bigOrders.offer(order);
            }
        }
        System.out.println("STEP 5: Processing Big Orders with Queue");
        while(!bigOrders.isEmpty()) {
            String order = bigOrders.poll();
            System.out.println("Processing big orders:" + order);
        }
        System.out.println();
    }

    public static void handleReturns(String[] orderData) {
        Stack<String> returnOrders = new Stack<>();
        returnOrders.push( "John,Monitor,1,299.99");
        returnOrders.push( "John,Mouse,1,25.50");
        returnOrders.push( "Sarah,Monitor,1,299.99");
        System.out.println("STEP 6: Handling returns with Stack: ");
        while(!returnOrders.isEmpty()) {
            String order = returnOrders.pop();
            System.out.println(order);
        }
    }

}