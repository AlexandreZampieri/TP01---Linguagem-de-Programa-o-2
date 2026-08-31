/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

/**
 *
 * Feito por Alexandre Zampieri e Caio Andrade
 */
public class Author {
    public String nome;
    public String email;
    public char gender;
    
    public Author (String nome, String email, char gender)
    {
        this.nome = nome;
        this.email = email;
        this.gender = gender;
    }
    
    public String getNome()
    {
        return nome;
    }
    
      public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
      public char getGender()
    {
        return gender;
    }
    
    @Override
   public String toString()
   {
       //"Author[name=Wellington Tuler,email=tulermoraes@yahoo.com,gender=m]".
       return "nome=" + nome+ ", email= " + email + ", genero= "+ gender;
   }
    
}
