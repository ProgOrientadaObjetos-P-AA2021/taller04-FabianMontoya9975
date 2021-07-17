/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

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
        String cedula1 = "1115965454";
        String marca1 = "Mazda";
        int fab1 = 1985;
        double vehiculo1 = 450000;
        Automotor autoUno = new Automotor(cedula1, marca1, fab1, vehiculo1);
        autoUno.establecerValorMatricula();
        System.out.printf("%s\n", autoUno);
        
        String cedula2 = "1894356445";
        String marca2 = "Mercedez";
        int fab2 = 1960;
        double vehiculo2 = 980000;
        Automotor autoDos = new Automotor(cedula2, marca2, fab2, vehiculo2);
        autoDos.establecerValorMatricula();
        System.out.printf("%s\n", autoDos);
    }
    
}
