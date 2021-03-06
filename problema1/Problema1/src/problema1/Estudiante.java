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
public class Estudiante {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificaciones;

    public Estudiante(String n, double notaUno, double notaDos,
            double notaTres) {
        nombreEstudiante = n;
        calificacionMateria1 = notaUno;
        calificacionMateria2 = notaDos;
        calificacionMateria3 = notaTres;
    }

    public void establecerNombreEstudiante(String n) {
        nombreEstudiante = n;
    }

    public void establecerCalificacionMateria1(double n) {
        calificacionMateria1 = n;
    }

    public void establecerCalificacionMateria2(double n) {
        calificacionMateria2 = n;
    }

    public void establecerCalificacionMateria3(double n) {
        calificacionMateria3 = n;
    }

    public void establecerPromedioCalificaciones() {
        promedioCalificaciones = (calificacionMateria1 + calificacionMateria2
                + calificacionMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del estudiante: %s\n"
                + "Calificacion materia 1: %.2f\n"
                + "Calificacion materia 2: %.2f\n"
                + "Calificacion materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                nombreEstudiante,
                calificacionMateria1,
                calificacionMateria2,
                calificacionMateria3,
                promedioCalificaciones);
        return cadena;
    }

}
