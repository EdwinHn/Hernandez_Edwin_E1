/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_e1;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_E1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        int menu = 1;
        int opcion;

        //Menú
        do {
            System.out.println("--- Menú ---\n");
            System.out.println("1- Pirámide");
            System.out.println("2- El Mayor");
            System.out.println("3- Paquetes de Canales");
            System.out.println("4- Carácteres Vocales");
            System.out.println("5- Salir\n");
            System.out.print("Ingrese su opción: ");
            opcion = scan.nextInt();

            
            
            
            //Opción inválida
            if (opcion < 1 || opcion > 5) {
                System.out.println("\nIngrese una opción válida\n");

                
                
                
                //1- Pirámide
            } else if (opcion == 1) {
                System.out.println("\n1- Pirámide\n");

                String fila="";
                int cantidadFila = 0;
                int cicloFila = 1;
                int contador = 1;
                int cicloPiramide = 0;
                int numero;
                int cicloNumero = 0;
                int suma = 0;

                System.out.print("Cantidad de fila de la pirámide: ");

                do {
                    cantidadFila = scan.nextInt();

                    if (cantidadFila < 1) {
                        System.out.print("Ingrese una cantidad válida: ");

                    } else {
                        cicloFila = 0;
                    }

                } while (cicloFila > 0);

                do {
                    while (cicloPiramide < contador) {
                        System.out.print("Ingrese los números de la fila #"+(contador)+": ");
                        numero = scan.nextInt();
                        fila+=numero+" ";
                        suma += numero;
                        cicloPiramide++;

                    }
                    System.out.println("");
                    fila+= (" = " + suma + "\n");
                    contador++;
                    cicloNumero++;
                    cicloPiramide = 0;
                    suma = 0;

                } while (cicloNumero < cantidadFila);
                System.out.print("Cantidad de fila de la pirámide: "+cantidadFila+"\n");
                System.out.println(fila);

                
                
                
                //2- El Mayor
            } else if (opcion == 2) {
                System.out.println("\n2- El Mayor\n");
                String numeroString;
                int numero = 0;
                int mayor = 0;
                int suma = 0;
                int promedio;
                int contador = 0;

                do {
                    System.out.print("Ingrese un número: ");
                    numeroString = scan.next().toLowerCase();

                    if (!numeroString.equals("no")) {
                        numero = Integer.parseInt(numeroString);
                        if (numero > mayor) {
                            mayor = numero;

                        }
                    }

                    suma += numero;
                    contador++;

                } while (!numeroString.equals("no"));

                promedio = suma / contador;

                System.out.println("\nNúmero Mayor Ingresado: " + mayor);
                System.out.println("Número Promedio: " + promedio + "\n");

                
                
                
                //3- Paquetes de Canales
            } else if (opcion == 3) {
                System.out.println("\n3- Paquetes de Canales\n");

                String nombre;
                String canal;
                String caja;
                String repetir;
                int cicloCanal = 1;
                int cicloRepetir = 1;
                int cicloCaja = 1;
                int hd = 0;
                int hdPrecio;
                int normal = 0;
                int normalPrecio;
                int cajaPrecio = 0;
                double impuesto;
                double total;
                double subtotal;

                System.out.print("Igrese el nombre del cliente: ");
                nombre = scan.next();

                do {
                    System.out.print("Ingrese el tipo de canal (HD/Normal): ");

                    do {
                        canal = scan.next().toLowerCase();

                        if (!canal.equals("hd") && !canal.equals("normal")) {
                            System.out.println("Ingrese una opción válida (HD/Normal): ");

                        } else if (canal.equals("hd")) {
                            hd++;
                            cicloCanal = 0;

                        } else if (canal.equals("normal")) {
                            normal++;
                            cicloCanal = 0;

                        }
                    } while (cicloCanal > 0);

                    System.out.print("Desea ingresar otro canal? (si/no): ");

                    do {
                        repetir = scan.next();

                        if (!repetir.equals("si") && !repetir.equals("no")) {
                            System.out.print("Ingrese una opción válida (si/no): ");

                        } else if (repetir.equals("no")) {
                            cicloRepetir = 0;

                        } else if (repetir.equals("si")) {
                            cicloRepetir = 0;
                        }

                    } while (cicloRepetir > 0);

                    cicloCanal = 1;

                } while (repetir.equals("si"));

                System.out.print("Ingrese el tipo de Caja Digital (LIGHTBOX / LIGHTBOX / DVRBOX):");

                do {
                    caja = scan.next().toUpperCase();

                    if (!caja.equals("LIGHTBOX") && !caja.equals("LIGHTBOX") && !caja.equals("DVRBOX")) {
                        System.out.print("Ingrese una opción válida (LIGHTBOX / LIGHTBOX / DVRBOX): ");

                    } else if (caja.equals("LIGHTBOX")) {
                        cicloCaja = 0;
                        cajaPrecio = 50;

                    } else if (caja.equals("LIGHTBOX")) {
                        cicloCaja = 0;
                        cajaPrecio = 100;

                    } else if (caja.equals("DVRBOX")) {
                        cicloCaja = 0;
                        cajaPrecio = 150;
                    }

                } while (cicloCaja > 0);

                normalPrecio = normal * 20;
                hdPrecio = hd * 30;
                subtotal = normalPrecio + hdPrecio;
                impuesto = subtotal * 0.15;
                total = subtotal + impuesto + cajaPrecio;

                System.out.println("\n** Factura **\n");
                System.out.println("Nombre: " + nombre);
                System.out.println(normal + " canales normales: Lps." + normalPrecio);
                System.out.println(hd + " canales HD: Lps." + hdPrecio);
                System.out.println("ISV 15%: Lps." + impuesto);
                System.out.println("Total: Lps." + total + "\n");

                
                
                
                //4- Carácteres Vocales
            } else if (opcion == 4) {
                System.out.println("\n4- Carácteres Vocales\n");

                String cadena;
                int vocales = 0;
                int contador1 = 0;
                int contador2 = 0;
                int contador3 = 1;

                System.out.print("Ingrese una cadena: ");
                cadena = scan.next().toLowerCase();

                while (contador1 < cadena.length()) {
                    if (cadena.substring(contador2, (contador3)).equals("a") || cadena.substring(contador2, (contador3)).equals("e") || cadena.substring(contador2, (contador3)).equals("i") || cadena.substring(contador2, (contador3)).equals("o") || cadena.substring(contador2, (contador3)).equals("u")) {
                        contador1++;
                        contador2++;
                        contador3++;
                        vocales++;

                    }

                    contador1++;
                    contador2++;
                    contador3++;

                }

                System.out.println("Cantidad de vocales: " + vocales);

                
                
                
                //5- Salir
            } else if (opcion == 5) {
                System.out.println("HASTA LUEGO");
                menu = 0;

            }
        } while (menu > 0);
    }
}
