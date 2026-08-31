/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

/**
 *
 * @author aluno
 */
public class Tp01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Author[] authors = new Author[2];
    authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
    authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
    
    Book b1 = new Book("tim-tim", authors, 0);
    
        System.out.println(b1.toString());
    

    }
    
}
