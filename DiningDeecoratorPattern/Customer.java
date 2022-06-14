package DiningDeecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalPrice = 0;
        int choice;


        do {
            System.out.println("=========Food Menu=========");
            System.out.println(" 1. Varieties");
            System.out.println(" 2. Jhal Fry");
            System.out.println(" 4. to Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {

                case 1: {
                    Food vfood = new VarietiesFood();
                    System.out.println(vfood.prepareFood() + " Food Price = " + vfood.foodPrice());
                    totalPrice += vfood.foodPrice();
                    System.out.println("Total Price = " + totalPrice);

                    do {
                        System.out.println("=========Add Food=========");
                        System.out.println(" 1. Mashed Potatoes");
                        System.out.println(" 2. Fried Bitter Gourd");
                        System.out.println(" 3. to exit");

                        System.out.print("Enter your choice: ");
                        choice = Integer.parseInt(br.readLine());

                        switch (choice) {
                            case 1: {
                                Food f1 = new MashedPotatoes(new VarietiesFood());
                                ;
                                System.out.println(f1.prepareFood() + " Food Price = " + f1.foodPrice());
                                totalPrice += f1.foodPrice();
                                System.out.println("Total Price = " + totalPrice);
                            }
                            break;
                            case 2: {
                                Food f2 = new FriedBitterGourd(new VarietiesFood());
                                System.out.println(f2.prepareFood());
                                System.out.println(f2.prepareFood() + " Food Price = " + f2.foodPrice());
                                totalPrice += f2.foodPrice();
                                System.out.println("Total Price = " + totalPrice);
                            }
                            break;

                            default: {
                                System.out.println("No other food available");
                            }
                        }
                    }
                    while (choice != 3);
                }
                break;

                case 2: {

                    Food jffood = new JhalFry();
                    System.out.println(jffood.prepareFood() + " Food Price = " + jffood.foodPrice());
                    totalPrice += jffood.foodPrice();
                    System.out.println("Total Price = " + totalPrice);

                    do {
                        System.out.println("=========Add Food=========");
                        System.out.println(" 1. Mashed Potatoes");
                        System.out.println(" 2. Fried Bitter Gourd");
                        System.out.println(" 3. to exit");

                        System.out.print("Enter your choice: ");
                        choice = Integer.parseInt(br.readLine());

                        switch (choice) {
                            case 1: {
                                Food f1 = new MashedPotatoes(new VarietiesFood());
                                ;
                                System.out.println(f1.prepareFood() + " Food Price = " + f1.foodPrice());
                                totalPrice += f1.foodPrice();
                                System.out.println("Total Price = " + totalPrice);
                            }
                            break;
                            case 2: {
                                Food f2 = new FriedBitterGourd(new VarietiesFood());
                                System.out.println(f2.prepareFood());
                                System.out.println(f2.prepareFood() + " Food Price = " + f2.foodPrice());
                                totalPrice += f2.foodPrice();
                                System.out.println("Total Price = " + totalPrice);
                            }
                            break;

                            default: {
                                System.out.println("No other food available");
                            }
                        }
                    }
                    while (choice != 3);
                }
                break;

                default: {
                    System.out.println("No other food available");
                }

                return;
            }
        }while (choice != 4);


    }
}
