/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal2 {

    public static void main(String[] args) throws SQLException {
        /* Scanner sc = new Scanner(System.in);
        int op;
        boolean bandera = true;

        do {
            Enlace c = new Enlace();
            System.out.println("Ingrese el nombre de la ciudad");
            String nCiudad = sc.nextLine();
            System.out.println("Ingrese la poblacion de la ciudad");
            int pCiudad = sc.nextInt();
            Ciudad ciudad = new Ciudad(nCiudad, pCiudad);
            c.insertarCiudad(ciudad);
            System.out.println("PARA SALIR PULSE 1; PARA SEGUIR INGRESANDO"
                    + "PULSE CUALQUIER TECLA");
            op = sc.nextInt();
            sc.nextLine();
            if (op == 1) {
                bandera = false;
            }
        } while (bandera);*/
        Enlace c = new Enlace();
        for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }
    }
}
