/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u04e09;

import java.util.Scanner;
public class U04E09 {

    public static void main(String[] args) {
        int sillas;
        int alumnos;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de sillas del curso: ");
        sillas = entrada.nextInt();
        System.out.print("Ingrese la cantidad de alumnos del curso: ");
        alumnos = entrada.nextInt();
        if (sillas >= alumnos){
            System.out.print("Las sillas alcanzan para todos los alumnos");
            }
            else{
                System.out.print("Faltan "+(alumnos-sillas)+" sillas para completar el curso");
            }
    }
}