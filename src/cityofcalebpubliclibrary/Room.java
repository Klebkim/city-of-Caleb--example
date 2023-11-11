package cityofcalebpubliclibrary;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<Book> booklist;
    //shelves
    //plants
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public List<Book> getBooklist() {
        return this.booklist;
    }
    public void setBookList(List<Book> booklist) {
        this.booklist = booklist;
    }
    public void addBook(Book myBook) {
        this.booklist.add(myBook);
    }}




