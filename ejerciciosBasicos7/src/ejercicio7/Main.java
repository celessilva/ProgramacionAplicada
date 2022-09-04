package ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      double matriz[][]= new double[4][4];
        Scanner teclado= new Scanner(System.in);
        double suma=0.0;

        for (int f=0;f<4;f++){
            for (int c=0;c<3;c++ ){
                System.out.println("Ingrese el alumno numero : " + f);
                matriz[f][c]=teclado.nextDouble();
                suma= suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma=0.0;
        }

        for (int f=0;f<4;f++){
            System.out.println("Las notas del alumno:" +f);
            for (int c=0;c<3;c++ ) {
                System.out.println("nota numero :" + c + " " + matriz[f][c]);

            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
        }


    }
/* se debe revisar este ejercicio , no me gusta la visualizaacion*/

    /* en una tabla de 4 filas y 4 columnas, se guardan las notas de 4 alumnos
    cada fila corresponden a las notas y al promedio de cada alumno.
    Se necesita un programa que permita cargar a un profesor
    en las 3 posiciones ( colummnas ) de cada fila,las notas del alumno y en la ultima columna
    el promedio.
    Una vez realizados todos los calculos se desea mostrar las 3 notas de cada alumno
    y el promedio correspondiente recorriendo la matriz.
     */
}
