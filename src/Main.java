import VendingMachine.Machine;
import VendingMachine.Drink;
import VendingMachine.Snack;
import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
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
            Scanner pwScanner = new Scanner(System.in);
            Scanner doubleScanner = new Scanner(System.in);

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


                } else if (choice == 3) {
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
                } else if (choice == managerPin) {
                    String password = "Soccer";
                    System.out.println("Manager mode: On");
                    System.out.println("Please enter the password: ");

                    String checkPw = pwScanner.nextLine();
                    if (checkPw.equals(password)) {
                        System.out.println("Manager authenticated successfully");
                        // 1 update oreo
                        // 2 update fanta
                        // 3 update nerds
                        // 4 update sprite
                        // 5 update coke
                        // 6 update money
                        System.out.println("What would you like to update?");
                        System.out.println("1. Oreo");
                        System.out.println("2. Fanta");
                        System.out.println("3. Nerds");
                        System.out.println("4. Sprite");
                        System.out.println("5. Coke");
                        System.out.println("6. Money");
                        int managerChoice = machineScanner.nextInt();
                        //INTRODUCING THE SWITCH
                        switch (managerChoice) {
                            case 1: {
                                System.out.println("Do you want to update the price or the quantity?");
                                System.out.println("1. Quantity");
                                System.out.println("2. Price");
                                int managerUpdate = machineScanner.nextInt();

                                if (managerUpdate == 1) {
                                    System.out.println("What would you like to set as the new quantity for the oreos?");
                                    int newQuantity = machineScanner.nextInt();
                                    oreo.setSnackquantity(newQuantity);
                                    System.out.println("Ok the quantity for oreo has been updated to " + newQuantity);
                                }
                                if (managerUpdate == 2) {
                                    System.out.println("What would you like to set as the new  price the oreos?");
                                    double newPrice = machineScanner.nextDouble();
                                    oreo.setSnackprice(newPrice);
                                    System.out.println("Ok the quantity for oreo has been updated to " + newPrice);

                                    break;
                                }}
                                //oreo
                            case 2: {
                                System.out.println("Do you want to update the price or the quantity?");
                                System.out.println("1. Quantity");
                                System.out.println("2. Price");
                                int managerUpdate = machineScanner.nextInt();

                                if (managerUpdate == 1) {
                                    System.out.println("What would you like to set as the new quantity for the fanta?");
                                    int newQuantity = machineScanner.nextInt();
                                    fanta.setQuantity(newQuantity);
                                    System.out.println("Ok the quantity for fanta has been updated to " + newQuantity);
                                }
                                if (managerUpdate == 2) {
                                    System.out.println("What would you like to set as the new  price the fanta?");
                                    double newPrice = machineScanner.nextDouble();
                                    fanta.setPrice(newPrice);
                                    System.out.println("Ok the quantity for fanta has been updated to " + newPrice);
                                }
                                break;
                            }
                                //fanta

                            case 3: {
                                System.out.println("Do you want to update the price or the quantity?");
                                System.out.println("1. Quantity");
                                System.out.println("2. Price");
                                int managerUpdate = machineScanner.nextInt();

                                if (managerUpdate == 1) {
                                    System.out.println("What would you like to set as the new quantity for the nerds?");
                                    int newQuantity = machineScanner.nextInt();
                                    nerds.setSnackquantity(newQuantity);
                                    System.out.println("Ok the quantity for nerds has been updated to " + newQuantity);
                                }
                                if (managerUpdate == 2) {
                                    System.out.println("What would you like to set as the new  price the fanta?");
                                    double newSnackprice = machineScanner.nextDouble();
                                    nerds.setSnackprice(newSnackprice);
                                    System.out.println("Ok the quantity for nerds has been updated to " + newSnackprice);
                                }
                                break;
                            }
                            //nerds
                            case 4: {
                                System.out.println("Do you want to update the price or the quantity?");
                                System.out.println("1. Quantity");
                                System.out.println("2. Price");
                                int managerUpdate = machineScanner.nextInt();

                                if (managerUpdate == 1) {
                                    System.out.println("What would you like to set as the new quantity for the sprite?");
                                    int newQuantity = machineScanner.nextInt();
                                    sprite.setQuantity(newQuantity);
                                    System.out.println("Ok the quantity for sprite has been updated to " + newQuantity);
                                }
                                if (managerUpdate == 2) {
                                    System.out.println("What would you like to set as the new  price the sprite?");
                                    double newPrice = machineScanner.nextDouble();
                                    sprite.setPrice(newPrice);
                                    System.out.println("Ok the quantity for sprite has been updated to " + newPrice);
                                }
                                break;
                            }
                            //sprite
                            case 5: {
                                System.out.println("Do you want to update the price or the quantity?");
                                System.out.println("1. Quantity");
                                System.out.println("2. Price");
                                int managerUpdate = machineScanner.nextInt();

                                if (managerUpdate == 1) {
                                    System.out.println("What would you like to set as the new quantity for the coke?");
                                    int newQuantity = machineScanner.nextInt();
                                    coke.setQuantity(newQuantity);
                                    System.out.println("Ok the quantity for coke has been updated to " + newQuantity);
                                }
                                if (managerUpdate == 2) {
                                    System.out.println("What would you like to set as the new  price the coke?");
                                    double newPrice = machineScanner.nextDouble();
                                    coke.setPrice(newPrice);
                                    System.out.println("Ok the quantity for coke has been updated to " + newPrice);
                                }
                                break;
                            }
                            //coke
                            case 6: {
                                System.out.println("Please enter the new amount of money.");
                                double newMoney = machineScanner.nextDouble();
                                machine.setMoney(newMoney);
                                System.out.println("Ok the new money in the vending has been updated to " + machine.getMoney());
                                break;
                            }
                            //money
                            default:
                                //english please
                        }



                    } else {
                        System.out.println("Incorrect password. Are you sure you are the manager");
                    }
                    System.out.println("Manager mode: Off");
                    System.out.println("\n\n\n\n\n");
                } else {
//                    System.out.println("I don't understand what you are talking about");
                    System.out.println("The amount of money in the machine is " + machine.getMoney());
                }

            }
        }}