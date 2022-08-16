/*
Trabajo individual 18 Alumnos y notas
Alumno: Erick Díaz Guerra
*/
package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Individual18AlumnosYNotas {
   public static void main(String[] args) {

      Scanner registrar = new Scanner(System.in);

      System.out.println("*** Registro de alumnos y sus notas ***");
      System.out.println("============================== ==============================");
      System.out.println("Ingrese el nombre de cada alumno y su respectiva nota:");

      String nombre;
      ArrayList<String> nombres = new ArrayList<String>();
      String nota;
      ArrayList<Integer> notas = new ArrayList<Integer>();
      int iAlum = 1;

      System.out.println("============================== ==============================");
      do {
         System.out.println("Nombre del alumno numero ("+iAlum+"):");
         nombre = registrar.nextLine();
         if (!nombre.equals("SALIR")) {
            while (nombre.equals("")) {
               System.out.println("Debe ingresar el nombre del alumno:");
               nombre = registrar.nextLine();
            }
            nombres.add(nombre);

            System.out.println("Ingrese la nota de " + nombre + " (valor entero de 1 a 7):");
            nota = registrar.nextLine();
            while (nota.length() != 1 ||
                  !nota.matches("[1-7]*")) {
               System.out.println("Ingrese una nota valida (valor entero de 1 a 7):");
               nota = registrar.nextLine();
            }
            notas.add(Integer.parseInt(nota));

            iAlum++;
         }
      } while(!(nombre.equals("SALIR") && iAlum > 2));

      System.out.println("============================== ==============================");
      System.out.println("Nomina de alumnos y sus notas:");
      System.out.println("============================== ==============================");
      for (int i = 0; i < nombres.size(); i++) {
         System.out.println("Nombre: ["+nombres.get(i)+"] Nota: ["+notas.get(i)+"]");
      }

      int sumaNotas = 0;
      float promNotas;
      for (int i = 0; i < notas.size(); i++) {
         sumaNotas = sumaNotas + notas.get(i);
      }
      promNotas = (float)sumaNotas / (float)notas.size();
      System.out.println("============================== ==============================");
      System.out.println("La nota promedio del curso es un "+promNotas);

      int menor = notas.get(0);
      int iMenor = 0;
      for (int i = 0; i < notas.size(); i++) {
         if (notas.get(i) <= menor) {
            menor = notas.get(i);
            iMenor = i;
         }
      }
      System.out.println("============================== ==============================");
      System.out.println("La peor nota fue un "+menor+" obtenida por "+nombres.get(iMenor)+".");

      int mayor = notas.get(0);
      int iMayor = 0;
      for (int i = 0; i < notas.size(); i++) {
         if (notas.get(i) >= mayor) {
            mayor = notas.get(i);
            iMayor = i;
         }
      }
      System.out.println("============================== ==============================");
      System.out.println("La mejor nota fue un "+mayor+" obtenida por "+nombres.get(iMayor)+".");
      System.out.print("============================== ==============================");
   }
}