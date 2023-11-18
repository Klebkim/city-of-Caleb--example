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
                fanta.setName("Fanta");
                fanta.setPrice(1.25);
                fanta.setQuantity(10);
                Drink sprite = new Drink();
                sprite.setName("Sprite");
                sprite.setPrice(1.50);
                sprite.setQuantity(10);
                Drink coke = new Drink();
                coke.setName("Coke");
                coke.setPrice(1.50);
                coke.setQuantity(10);
                Snack oreo = new Snack();
               oreo.setSnackname("oreo");
               oreo.setSnackprice(2.50);
               oreo.setSnackquantity(5);
                Snack nerds = new Snack();
                nerds.setSnackname("Nerds");
                nerds.setSnackprice(3.00);
                nerds.setSnackquantity(5);

               machine.getSnackslist().add(oreo);
               machine.getSnackslist().add(nerds);
               machine.getDrinkList().add(fanta);
               machine.getDrinkList().add(sprite);
               machine.getDrinkList().add(coke);
            Scanner machineScanner = new Scanner(System.in);

             while (true) {
                 System.out.println("What would you like to buy?");
                 System.out.println("1. Oreo");
                 System.out.println("2. Fanta");
                 System.out.println("3. Nerds");
                 System.out.println("4. Sprite");
                 System.out.println("5. Coke");
                 int managerPin = 471016;
                 int choice = machineScanner.nextInt();
                 if (choice == 1) {
                     System.out.println("You chose oreo! OK!");


                     int quantity = oreo.getSnackquantity();
                     if (quantity < 1) {
                         System.out.println("Sorry! We are out of oreos.");
                     } else {
                         oreo.setSnackquantity(quantity - 1);
                         machine.setMoney(machine.getMoney() + oreo.getSnackprice());
                     }

                     System.out.println("The number of oreo left is " + oreo.getSnackquantity());
                 }
                 if (choice == 2) {
                     System.out.println("You chose Fanta. Fantastic!");
                     int quantity = fanta.getQuantity();
                     if (quantity < 1) {
                         System.out.println("Sorry! We are out of fanta.");
                     } else {
                         fanta.setQuantity(quantity - 1);
                         machine.setMoney(machine.getMoney() + fanta.getPrice());
                     }

                         System.out.println("The number of fanta left is " + fanta.getQuantity());


                                      }
                        else if (choice == 3) {
                     System.out.println("You chose Nerds. Noice!");
                     int quantity = nerds.getSnackquantity();
                     if (quantity < 1) {
                         System.out.println("Sorry! We are out of nerds.");
                     } else {
                         machine.setMoney(machine.getMoney() + nerds.getSnackprice());
                         nerds.setSnackquantity(quantity - 1);
                     }



                         System.out.println("The number of nerds left is " + nerds.getSnackquantity());

                 } else if (choice == 4) {
                     System.out.println("You chose Sprite. Splendid!");
                     int quantity = sprite.getQuantity();
                     if (quantity < 1) {
                         System.out.println("Sorry! We are out of sprite.");
                     } else {
                         sprite.setQuantity(quantity - 1);
                         machine.setMoney(machine.getMoney() + sprite.getPrice());
                     }


                         System.out.println("The number of sprite left is " + sprite.getQuantity());

                 } else if (choice == 5) {
                     System.out.println("You chose Coke. Good Choice!");
                     int quantity = coke.getQuantity();
                     if (quantity < 1) {
                         System.out.println("Sorry! We are out of coke.");
                     } else if (quantity > 1) {
                         coke.setQuantity(quantity - 1);
                         machine.setMoney(machine.getMoney() + coke.getPrice());
                     }
                         System.out.println("The number of sprite left is " + sprite.getQuantity());
                     }

                  else if (choice == managerPin){
                      String password = "Soccer";
                     System.out.println("Manager mode: On");
                     System.out.println("Please enter the password: ");

                     String checkPw = machineScanner.nextLine();
                     if(checkPw.equals(password)){
                         System.out.println("Manager authenticated successfully");
                     } else {
                         System.out.println("Incorrect password. Are you sure you are the manager");
                     }

                 }

                      else {

                     System.out.println("The amount of money in the machine is " + machine.getMoney());
                 }

             }
             }}