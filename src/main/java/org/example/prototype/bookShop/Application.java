package org.example.prototype.bookShop;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShop("Novelty");
        bs.loadData();
        System.out.println(bs);
        BookShop b1 = bs.clone();
        b1.setShop("A1");
        System.out.println(b1);
    }
}
