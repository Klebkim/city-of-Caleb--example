import VendingMachine.Machine;
import VendingMachine.Drink;
import VendingMachine.Snack;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

                Machine machine = new Machine();
                machine.setName("My (not)Greatest(not) Machine");
                machine.setMoney(100.00);
                machine.setDrinkList(new ArrayList<>());
                machine.setSnackslist(new ArrayList<>());

                Drink fanta = new Drink();
                fanta.setName("Pineapple Fanta");
                fanta.setPrice(1.25);
                fanta.setQuantity(10);
                Snack oreo = new Snack();
               oreo.setSnackname("oreo");
               oreo.setSnackprice(2.50);
               oreo.setSnackquantity(5);

               machine.getSnackslist().add(oreo);
               machine.getDrinkList().add(fanta);
            Scanner machineScanner = new Scanner(System.in);

             while (true) {
                 System.out.println("What would you like to buy?");
                 System.out.println("1. Oreo");
                 System.out.println("2. Fanta");
                 int choice = machineScanner.nextInt();
                 if (choice == 1) {
                     machine.setMoney(machine.getMoney() + oreo.getSnackprice());
                     int quantity = oreo.getSnackquantity();
                     if (quantity < 0){
                         System.out.println("Sorry! We are out of oreos.");
                     } else {
                         oreo.setSnackquantity(quantity - 1);
                         machine.setMoney(machine.getMoney() + oreo.getSnackprice());
                     }

                     System.out.println("The number of oreo left is " + oreo.getSnackquantity());
                 } else if (choice == 2) {
                     System.out.println("You chose Fanta. Fantastic!");
                     machine.setMoney(machine.getMoney() + fanta.getPrice());
                     fanta.setQuantity(fanta.getQuantity() - 1);
                     int quantity = fanta.getQuantity();
                     if (quantity < 0){
                         System.out.println("Sorry! We are out of fanta.");
                     } else {

                         machine.setMoney(machine.getMoney() + fanta.getPrice());
                     }
                     System.out.println("The number of fanta left is " + fanta.getQuantity());
                 } else {
                     System.out.println("I couldn't understand. Please try again");
                 }
                 System.out.println("The amout of money in the machine is " + machine.getMoney());
                 }
             }
//            System.out.println("The amount of money left in the machine is " +machine.getMoney());
//            System.out.println("The number of oreo left in the machine is " + oreo.getSnackquantity());
//               System.out.println("Do you want an Oreo?(Yes / No)");
//               Scanner machineScanner = new Scanner(System.in);
//               String answer = machineScanner.nextLine();
//               if (answer.equalsIgnoreCase("Yes")) {
//                   int oreoQuantity = oreo.getSnackquantity();
//                   oreoQuantity --;
//                   oreo.setSnackquantity(oreoQuantity);
//
//                   double myMoney = machine.getMoney();
//                   myMoney = myMoney + oreo.getSnackprice();
//                   //machine.setMoney(myMoney);
//
//                   machine.setMoney(machine.getMoney() + oreo.getSnackprice());
//               }
//            System.out.println("The amount of money left in the machine is " +machine.getMoney());
//            System.out.println("The number of oreo left in the machine is " + oreo.getSnackquantity());
//        }
}