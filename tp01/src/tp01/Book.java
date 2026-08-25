/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Book {

    private String name;
    private double price;
    private int qty = 0;
    private Author[] authors = new Author[2];

    public Book(String name, Author[] authors, double price) {

        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        this.name = name;
        this.price = price;
        this.authors = authors;

    }

    public Book(String name, Author[] authors, double price, int qty) {

        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

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

    public String toString() {
        //"Book[name=?,authors={Author[name=?,email=?,gender=?],......},price=?,qty=?]".
        return "nome=" + name + ", autores= " + authors + ", price= " + price + ", qty= " + qty;
    }

    public String getAuthorsNames() {
        //return "Autor 01" + "Autor 02";
        //return authors[0].nome + authors[1].nome;
         return authors[0].getNome() + authors[1].getNome();

    }
}
