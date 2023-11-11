import java.util.ArrayList;
import java.util.List;
import VendingMachine.Drinks;
import VendingMachine.Snacks;
import VendingMachine.Machine;
public class Main {
    public static void main(String[] args) {
Snacks mySnacks = new Snacks();
        mySnacks.setSnackname("Nerds Gummy");
        mySnacks.setSnackprice(" $3.00");
        mySnacks.setSnackquantity("600 grams");
        System.out.println("The snack I created is " + mySnacks.getSnackname());
        System.out.println("The snack price is" + mySnacks.getSnackprice());
        System.out.println("The snack quantity is" + mySnacks.getSnackquantity());
        mySnacks.setSnackname("Pringles Original");
        mySnacks.setSnackprice(" $2.00");
        mySnacks.setSnackquantity("400 grams");
        System.out.println("The snack I created is " + mySnacks.getSnackname());
        System.out.println("The snack price is" + mySnacks.getSnackprice());
        System.out.println("The snack quantity is" + mySnacks.getSnackquantity());
        mySnacks.setSnackname("Oreo Mini");
        mySnacks.setSnackprice(" $1.00");
        mySnacks.setSnackquantity("200 grams");
        System.out.println("The snack I created is " + mySnacks.getSnackname());
        System.out.println("The snack price is" + mySnacks.getSnackprice());
        System.out.println("The snack quantity is" + mySnacks.getSnackquantity());

        Drinks myDrinks = new Drinks();
        myDrinks.setDrinkname("Prime");
        myDrinks.setDrinkprice(" $3.00");
        myDrinks.setDrinkquantity("2 oz");
        System.out.println("The drink I created is " + myDrinks.getDrinkname());
        System.out.println("The drink price is" + myDrinks.getDrinkprice());
        System.out.println("The drink price is" + myDrinks.getDrinkquantity());

        myDrinks.setDrinkname("Coke");
        myDrinks.setDrinkprice(" $2.00");
        myDrinks.setDrinkquantity("6 oz");
        System.out.println("The drink I created is " + myDrinks.getDrinkname());
        System.out.println("The drink price is" + myDrinks.getDrinkprice());
        System.out.println("The drink price is" + myDrinks.getDrinkquantity());
        myDrinks.setDrinkname("Gatorade");
        myDrinks.setDrinkprice(" $1.00");
        myDrinks.setDrinkquantity(" 4 oz");
        System.out.println("The drink I created is " + myDrinks.getDrinkname());
        System.out.println("The drink price is" + myDrinks.getDrinkprice());
        System.out.println("The drink price is" + myDrinks.getDrinkquantity());



            Room myRoom = new Room();
            myRoom.setName("Magic Room");
            List<Book> myListOfBook = new ArrayList<>();
            myListOfBook.add(myBook);
            myRoom.setBookList(myListOfBook);
            System.out.println("The new room's name is " + myRoom.getName());
            System.out.println("This room has " +myRoom.getBooklist().size() + " book(s)!");
            System.out.println("The only book in this room has a title of " + myRoom.getBooklist().get(0).getTitle());


    }
}
