/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseswitch;

import java.util.Scanner;

public class ClaseSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nota;
        System.out.println("Ingrese su Nota ...");
        nota = sc.nextLine();
        System.out.println("------------------------");
        System.out.println("Su Nota es: " + IngreseSuNota(nota));
        System.out.println("------------------------");
    }

    public static String IngreseSuNota(String n) {

        switch (n) {
            case "A":
                System.out.println("Excelente!!!");
                break;
            case "B":
                System.out.println("Muy Bien!!!");
                break;
            case "C":
                System.out.println("Regular!!!");
                break;
            case "D":
                System.out.println("Mal!!!");
                break;
            default:
                System.out.println("Muy Mal!!!");
                break;
        }
        return n;
    }

}
