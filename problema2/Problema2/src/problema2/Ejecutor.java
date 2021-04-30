/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author josef
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Manuel";
        String lastName = "Armijos";
        double sueldoB = 500;
        String cedu = "1111556854";
        Profesor profUno = new Profesor(name, lastName, sueldoB, cedu);
        profUno.establecerSueldoTotal();
        System.out.printf("%s\n", profUno);
        
        String nombre = "Augusto";
        String apellido = "Alvarez";
        double sueldoBasico = 200;
        String ced = "1985426546";
        Profesor profDos = new Profesor(nombre, apellido, sueldoBasico, ced);
        profDos.establecerSueldoTotal();
        System.out.printf("%s\n", profDos);
    }
    
}
