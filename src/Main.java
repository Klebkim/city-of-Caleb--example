import java.util.List;
import java.util.ArrayList;
import cityofcalebpubliclibrary.Book;
import cityofcalebpubliclibrary.author;
import cityofcalebpubliclibrary.Room;
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("Harry Potter and the Philosopher's Stone");
        myBook.setPageNumber(309);
        System.out.println("The book I created is " + myBook.getTitle());
        System.out.println("The number of pages in this book is " + myBook.getPageNumber());

        author myAuthor = new author();
        myAuthor.setDob("July 31, 1965");
        myAuthor.setFirstname("J.K");
        myAuthor.setLastname("Rowling");

        System.out.println("The author's first name is " + myAuthor.getFirstname());
        System.out.println("The author's last name is " + myAuthor.getLastname());
        System.out.println("The author's date of birth is " + myAuthor.getDob());

        myBook.setAuthor(myAuthor);
        System.out.println("The book's author's first name is " + myBook.getAuthor().getFirstname());
        System.out.println("The book's author's last name is " + myBook.getAuthor().getLastname());
        System.out.println("The book's author's date of birth is " + myBook.getAuthor().getDob());

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
