/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int op;
        
        do{
            System.out.println("Ingrese la placa del vehiculo");
            String pl = sc.nextLine();
            System.out.println("Ingrese el valor del automovil");
            double va = sc.nextDouble();
            sc.nextLine();
            Enlace c = new Enlace();
            Auto a = new Auto();
            a.establecerPlaca(pl);
            a.establecerValorMatricula(va);
            c.insertarAuto(a);
            System.out.println("PARA SALIR PULSE 1; PARA SEGUIR INGRESANDO"
                    + "PULSE CUALQUIER TECLA");
            op = sc.nextInt();
            if (op == 1) {
                bandera = false;
            }
        }while(bandera);
    }

}
