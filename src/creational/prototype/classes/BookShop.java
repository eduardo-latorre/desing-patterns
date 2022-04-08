package creational.prototype.classes;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    List<Book> bookList = new ArrayList<>();

    public BookShop(String shopName, List<Book> bookList) {
        this.shopName = shopName;
        this.bookList = bookList;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    public BookShop clone() throws CloneNotSupportedException {

        List<Book> bookListClone = getBookList();
        String shopNameClone = getShopName();

        BookShop bookShopClone = new BookShop(shopNameClone, bookListClone);
        
        return bookShopClone;
    }
}
