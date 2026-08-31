/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.ArrayList;

/**
 *
 * Feito por Alexandre Zampieri e Caio Andrade
 */
public class Book {

    private String name;
    private double price;
    private int qty = 0;
    private Author[] authors = new Author[2];

    public Book(String name, Author[] authors, double price) {


        this.name = name;
        this.price = price;
        this.authors = authors;

    }

    public Book(String name, Author[] authors, double price, int qty) {


        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = qty;

    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
         String s = "Book[name=" + name + ",authors={";

    for (int i = 0; i < authors.length; i++) {
        s += authors[i];

        if (i < authors.length - 1) {
            s += ",";
        }
    }

    s += "},price=" + price + ",qty=" + qty + "]";

    return s;
    }

    public String getAuthorsNames() {
        //return "Autor 01" + "Autor 02";
        //return authors[0].nome + authors[1].nome;
         return authors[0].getNome() + authors[1].getNome();

    }
}
