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
public class Automotor {

    private String cedulaDueno;
    private String marcaVehiculo;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cedula, String marca, int anoFa,
            double vehiculo) {
        cedulaDueno = cedula;
        marcaVehiculo = marca;
        anoFabricacion = anoFa;
        valorVehiculo = vehiculo;
    }

    public void establecerCedulaDueno(String cedula) {
        cedulaDueno = cedula;
    }

    public void establecerMarcaVehiculo(String marca) {
        marcaVehiculo = marca;
    }

    public void establecerAnoFabricacion(int anoFa) {
        anoFabricacion = anoFa;
    }

    public void establecerValorVehiculo(double vehiculo) {
        valorVehiculo = vehiculo;
    }

    public void establecerValorMatricula() {
        int numeroAnos = 2021 - anoFabricacion;
        valorMatricula = ((valorVehiculo * 0.002) / 100) * numeroAnos;
    }
    
    public String obtenerCedulaDueno() {
        return cedulaDueno;
    }
    
    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }
    
    public int obtenerAnoFabricacion() {
        return anoFabricacion;
    }
    
    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Datos del vehículo:\n"
                + "Cédula del Dueño: %s\n"
                + "Marca: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor vehículo: %.2f\n"
                + "Valor Matrícula: %.2f\n",
                cedulaDueno,
                marcaVehiculo,
                anoFabricacion,
                valorVehiculo,
                valorMatricula);
        return cadena;
    }

}
