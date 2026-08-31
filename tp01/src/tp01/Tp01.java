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
       
        Author[] authors = new Author[2];

        authors[0] = new Author(
                "Autor 01",
                "autor01@email.com",
                'm'
        );

        authors[1] = new Author(
                "Autor 02",
                "autor02@email.com",
                'f'
        );

        Book book = new Book(
                "Java",
                authors,
                100.00
        );

        System.out.println(book.getName());
        System.out.println(book.getPrice());

        book.setPrice(120.00);

        System.out.println(book.getPrice());

        book.setQty(10);

        for (Author author : book.getAuthors()) {
            System.out.println(author);
        }

        System.out.println(book.getAuthorsNames());

        System.out.println(book);
    }
}
