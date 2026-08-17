package org.example.prototype.bookShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BookShop implements Cloneable {
    private String shop;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shop;
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for(Book b: this.getBooks()){
            shop.getBooks().add(b);
        }
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shop + '\'' +
                ", books=" + books +
                '}';
    }
    public void loadData(){
        for(int i = 1; i <= 10; i++){
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book" + i);
            getBooks().add(b);
        }
    }
}
