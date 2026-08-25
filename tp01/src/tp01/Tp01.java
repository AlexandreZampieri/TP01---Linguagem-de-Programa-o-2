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
        Author autor = new Author("Roger", "roger@email.com", 'F');
        
        System.out.println(autor.getEmail());
       autor.setEmail("rogerinho@doemail.com");
       System.out.println(autor.getEmail());
       
        System.out.println(autor.toString());

    }
    
}
