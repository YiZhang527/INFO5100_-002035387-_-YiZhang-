# Exercise-1b
# Problem Statement: Online Store Order Processing
## Task
Create a Java program that processes online store orders using 6 different data structures. Each data structure solves a specific problem in the order workflow.
## Beginning
- Created a String array `orderData` containing 12 sample orders
- Printed a header to identify the program
- Called 6 separate methods, each handling a specific data structure task
- Each method receives the same `orderData` array as input
- Each method independently processes the data and prints its own results
## Step 1: ArrayList - Store All Orders
- Created `storeAllOrders()` method
- Converted array to ArrayList using `Arrays.asList()`
- Used `size()` to get total count
- Used `get()` to display first 3 orders
## Step 2: HashSet - Find Unique Customers
- Split each order by comma to extract customer name
- HashSet automatically eliminated duplicate customers
- Displayed unique customer list and count
## Step 3: TreeSet - Sort Products
- Split each order to extract product name (second element `parts[1]`)
- TreeSet automatically sorted products alphabetically
- Displayed sorted product list and count
## Step 4: HashMap - Calculate Totals
- Created two HashMaps: one for customer spending, one for product quantities
- For customer spending: calculated price × quantity and accumulated per customer
- For product quantities: summed quantity values per product
- Used `getOrDefault()` for safe accumulation in both maps
- Displayed both summaries
## Step 5: Queue - Process Big Orders
- Filtered orders with total value ≥ $200
- Used LinkedList as Queue implementation
- Processed in first-come-first-served order
- Printed each big order during processing
## Step 6: Stack - Handle Returns
- Created sample return orders and pushed to Stack
- Processed returns in LIFO order using `pop()`
- Displayed each return as it was processed
