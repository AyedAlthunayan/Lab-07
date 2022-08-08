import java.util.ArrayList;

public class Book {
    //private AuthorOfBook[] authors;
    ArrayList<AuthorOfBook> author = new ArrayList<>();
    private  String name;
    private  double price ;
    private int qty;

    public Book(ArrayList<AuthorOfBook> author, String name, double price, int qty) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public ArrayList<AuthorOfBook> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<AuthorOfBook> author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
