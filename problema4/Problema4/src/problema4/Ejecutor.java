/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

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
        String cliente1 = "Julio Ramirez";
        String banco1 = "Banco Pichincha";
        double vCheque1 = 5200;
        ManejoCheque chequeUno = new ManejoCheque(cliente1, banco1, vCheque1);
        chequeUno.establecerComisionBanco();
        System.out.printf("%s\n", chequeUno);
        
        String cliente2 = "David Iñiguez";
        String banco2 = "Banco de Loja";
        double vCheque2 = 4620;
        ManejoCheque chequeDos = new ManejoCheque(cliente2, banco2, vCheque2);
        chequeDos.establecerComisionBanco();
        System.out.printf("%s\n", chequeDos);
    }
    
}
