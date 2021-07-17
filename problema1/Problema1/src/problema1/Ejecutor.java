/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

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
        String name = "David Valarezo";
        double calificacion1 = 8.65;
        double calificacion2 = 9.2;
        double calificacion3 = 7.09;
        Estudiante est1 = new Estudiante(name, calificacion1, calificacion2,
                calificacion3);
        est1.establecerPromedioCalificaciones();
        System.out.printf("%s\n", est1);

        String nombre = "Jorge Merino";
        double nota1 = 6.03;
        double nota2 = 10;
        double nota3 = 8.01;
        Estudiante est2 = new Estudiante(nombre, nota1, nota2, nota3);
        est2.establecerPromedioCalificaciones();
        System.out.printf("%s\n", est2);
    }

}
