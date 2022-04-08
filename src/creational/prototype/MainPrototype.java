package creational.prototype;

import creational.prototype.classes.Book;
import creational.prototype.classes.BookShop;

import java.util.ArrayList;
import java.util.List;

/*
* - Allows to use a copy of an instance instead of creating a new one
* - Uses Cloneable Interface to give permission to java to clone a certain class
* - It's mainly used when you need to fetch date from database, you only fetch once
* */
public class MainPrototype {

    public static void main(String[] args){

        List<Book> bookList = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            bookList.add(new Book(i, "Book " + i));
        }

        //Prototype
        BookShop bookShop1 = new BookShop("Shop 1", bookList);
        System.out.println(bookShop1);

        //Cloned from Prototype
        try {
            BookShop bookShop2 = bookShop1.clone();
            bookShop2.setShopName("Shop 2 Cloned");
            bookShop2.getBookList().remove(0);
            System.out.println(bookShop2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
