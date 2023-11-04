package cityofcalebpubliclibrary;

import java.util.ArrayList;
import java.util.List;

public class Book {
    // title
    // author
    // page number

    private String title;
    private author author;
    private int pageNumber;
    public author getAuthor(){
        return this.author;
    }
    public void setAuthor(author author) {
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPageNumber(){
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
