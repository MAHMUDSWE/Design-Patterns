package decoratorPattern;

import java.io.*;

/**
 *
 * @author Mahmud
 */
public class Customer {

    public static void main(String[] args) throws IOException {
        int choice;
        double totalCost = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1 for Plain Coffee, 2 for Espresso and 3 for Cappuccino.");
        System.out.print("Enter Choice: ");
        choice = Integer.parseInt(br.readLine());
        Food coffee = null;
        switch (choice) {
            case 1:
                coffee = new BlackCoffee();

                System.out.println(coffee.prepareFood() + " = " + coffee.foodPrice());
                totalCost = totalCost + coffee.foodPrice();
                System.out.println("Total Cost = " + totalCost);

                do {
                    System.out.println("Press...");
                    System.out.println("1. to Add_Milk");
                    System.out.println("2. to Add_Sugar");
                    System.out.println("3. to Add_Chocolate");
                    System.out.println("4. to exit and proceed to pay");

                    System.out.print("Enter your choice: ");

                    choice = Integer.parseInt(br.readLine());

                    switch (choice) {

                        case 1: {
                            coffee = new Milk((Food) new BlackCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 2: {
                            coffee = new Sugar((Food) new BlackCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 3: {
                            coffee = new Chocolate((Food) new BlackCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 4: {
                            System.out.println("Total bill to pay: " + totalCost);
                        }
                        break;
                        default: {
                            System.out.println("No other foods availabe to add.");
                        }
                        return;
                    }
                    
                } while (choice != 4);

                break;
            case 2:
                coffee = new EspressoCoffee();
                System.out.println(coffee.prepareFood() + " = " + coffee.foodPrice());
                totalCost = totalCost + coffee.foodPrice();
                System.out.println("Total Cost = " + totalCost);

                do {
                    System.out.println("Press...");
                    System.out.println("1. to Add_Milk");
                    System.out.println("2. to Add_Sugar");
                    System.out.println("3. to Add_Chocolate");
                    System.out.println("4. to exit and proceed to pay");

                    System.out.print("Enter your choice: ");

                    choice = Integer.parseInt(br.readLine());

                    switch (choice) {

                        case 1: {
                            coffee = new Milk((Food) new EspressoCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 2: {
                            coffee = new Sugar((Food) new EspressoCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 3: {
                            coffee = new Chocolate((Food) new EspressoCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 4: {
                            System.out.println("Total bill to pay: " + totalCost);
                        }
                        break;
                        default: {
                            System.out.println("No other foods availabe to add.");
                        }
                        return;
                    }
                } while (choice != 4);
                break;
            default:
                coffee = new CappuccinoCoffee();
                System.out.println(coffee.prepareFood() + " = " + coffee.foodPrice());
                totalCost = totalCost + coffee.foodPrice();
                System.out.println("Total Cost = " + totalCost);

                do {
                    System.out.println("Press...");
                    System.out.println("1. to Add_Milk");
                    System.out.println("2. to Add_Sugar");
                    System.out.println("3. to Add_Chocolate");
                    System.out.println("4. to exit and proceed to pay");

                    System.out.print("Enter your choice: ");

                    choice = Integer.parseInt(br.readLine());

                    switch (choice) {

                        case 1: {
                            coffee = new Milk((Food) new CappuccinoCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 2: {
                            coffee = new Sugar((Food) new CappuccinoCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 3: {
                            coffee = new Chocolate((Food) new CappuccinoCoffee());
                            System.out.println(coffee.prepareFood());

                            totalCost = totalCost + coffee.foodPrice();
                            System.out.println("Total Cost = " + totalCost);
                        }
                        break;
                        case 4: {
                            System.out.println("Total bill to pay: " + totalCost);
                        }
                        break;
                        default: {
                            System.out.println("No other foods availabe to add.");
                        }
                        return;
                    }
                } while (choice != 4);
                break;
        }

//        do {
//            System.out.println("Press...");
//            System.out.println("1. to Add_Milk");
//            System.out.println("2. to Add_Sugar");
//            System.out.println("3. to Add_Chocolate");
//            System.out.println("4. to exit and proceed to pay");
//
//            System.out.print("Enter your choice: ");
//
//            choice = Integer.parseInt(br.readLine());
//
//            switch (choice) {
//
//                case 1: {
//                     coffee = new Milk(coffee);  
//                    System.out.println(coffee.prepareFood());
//
//                    totalCost = totalCost + coffee.foodPrice();
//                    System.out.println("Total Cost = " + totalCost);
//                }
//                break;
//                case 2: {
//                    coffee = new Sugar(coffee);
//                    System.out.println(coffee.prepareFood());
//
//                    totalCost = totalCost + coffee.foodPrice();
//                    System.out.println("Total Cost = " + totalCost);
//                }
//                break;
//                case 3: {
//                    coffee = new Chocolate(coffee);
//                    System.out.println(coffee.prepareFood());
//
//                    totalCost = totalCost + coffee.foodPrice();
//                    System.out.println("Total Cost = " + totalCost);
//                }
//                break;
//                case 4: {
//                    System.out.println("Total bill to pay: " + totalCost);
//                }
//                break;
//                default: {
//                    System.out.println("No other foods availabe to add.");
//                }
//                return;
//            }
//        } while (choice != 4);
    }
}
