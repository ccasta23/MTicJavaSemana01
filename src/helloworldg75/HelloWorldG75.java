/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldg75;

import java.util.Scanner;
import poo.Carro;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class HelloWorldG75 {
    
    //Definir la función
    public static int sumar(int a, int b ){
        int resultado = a + b;
        return resultado;
    }
    
    public static void saludar(String nombre){
        System.out.println("¡Hola "+nombre+"! Bienvenido(a) al mundo de la POO en Java");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mostrar salidas en consola
        //En python lo haciamos con print
//        System.out.println("Hello World, ¡Welcome to Java!");
//        
//        final char MASCULINO = 'M';
//        final char FEMENINO = 'F';
//        
//        String nombre = "Pepito"; //Comillas DOBLES
//        char sexo = MASCULINO; //Comillas sencillas - Caracteres
//        int edad; //Números enteros
//        boolean es_estudiante = false; 
//        double calificacion = 3.9; //Números con decimal
//        
//        final String APELLIDO = "Molano"; //Declaración de una constante}
//        
//        String nombre_2 = "Ana"; //Comillas DOBLES
//        char sexo_2 = FEMENINO; //Comillas sencillas - Caracteres
//        int edad_2; //Números enteros
//        boolean es_estudiante_2 = true; 
//        double calificacion_2 = 4.7; //Números con decimal
//        
//        edad = 56; //Al final escribir la letra l
//        
//        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", es_estudiante: " + es_estudiante 
//                + ", Calificación: " + calificacion + ", Sexo: " + sexo );
//        
//        System.out.println("Hola mundo");
//        System.out.println(nombre);
//        
//        System.out.println("Hola " + nombre);
          
        //++ => aumentar el valor de una variable en 1
//        int suma = 0;
//        System.out.println(suma); // 0
//        suma++;
//        System.out.println(suma);//1
//        suma++;
//        System.out.println(suma);//2
//        System.out.println(suma++);//2
//        System.out.println(suma);//3
//        ++suma;
//        System.out.println(suma); //4
//        System.out.println(++suma); //5
        
        //En python: input("Ingrese su edad: ")
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ingrese su nombre: ");
//        String nombre = in.next();
//        System.out.println("Ingrese su edad: ");
//        int edad = in.nextInt(); 
//        
//        System.out.println("Su nombre es: " + nombre);
//        System.out.println("Su edad es: " + edad);
//        
//        
//        int i = 1, j = 2, k = 3;
//        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
//        System.out.println("i < j => " + (i < j));
//        System.out.println("(i + j) >= k => " + ((i + j) >= k));
//        System.out.println("(j + k) > (i + 5) => " + ((j + k) > (i + 5)));
//        System.out.println("k != 3 => " + (k != 3));
//        System.out.println("j == 2 => " + (j == 2));
        
//        final double FROM_LBS_TO_KG = 2.205;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ingrese su peso en libras: ");
//        int peso_lbs = in.nextInt();
//        
//        System.out.println("Su peso en libras es: " + peso_lbs);
//        
//        double peso_kg = peso_lbs / FROM_LBS_TO_KG;
//        
//        System.out.println("Su peso en KG es: " + peso_kg);
        
//        Scanner in = new Scanner(System.in);
//        System.out.println("Ingrese el código del estudiante: ");
//        String codigo_estudiante = in.next();
//        
//        System.out.println("Ingrese la nota del parcial 1 (20%): ");
//        double parcial_1 = in.nextDouble();
//        System.out.println("Ingrese la nota del parcial 2 (30%): ");
//        double parcial_2 = in.nextDouble();
//        
//        System.out.println("Ingrese la nota del taller (15%): ");
//        double taller_1 = in.nextDouble();
//        
//        System.out.println("Ingrese la nota del quiz 1: ");
//        double quiz_1 = in.nextDouble();
//        System.out.println("Ingrese la nota del quiz 2: ");
//        double quiz_2 = in.nextDouble();
//        
//        System.out.println("Ingrese la nota del proyecto final (30%): ");
//        double proyecto_final = in.nextDouble();
//        
//        double nota_final = (parcial_1*0.2) 
//                            + (parcial_2*0.3) 
//                            + (taller_1*0.15)
//                            + (((quiz_1+quiz_2)/2)*0.05)
//                            + (proyecto_final*0.3);
//        
//        System.out.println("El estudiante con código " + codigo_estudiante + " tiene una nota final de: " + nota_final);
//        
//        
//        if ( nota_final >= 3 ){
//            System.out.println("El estudiante ganó la materia :D");
//        //elif
//        } else if ( nota_final >=2.8 && nota_final<3 ){
//            System.out.println("Una oportunidad más... Que empiece el juego :P");
//        } else {
//            System.out.println("El estudiante perdió la materia :(");
//        }
        
//        int cantidad = 0; //Inicio
//        while( cantidad<=10 ){ //Condición
//            System.out.println("Cantidad: " + cantidad);
//            cantidad++; //Incremento/Decremento
//        }
//        
//        //Inicio=> 0
//        //Condición=>  i<10
//        //Incremento/Decremento => +1
//        for (int i = 0; i < 10; i+=2) {
//            System.out.println("I:" + i);
//        }
//        
//        //Continúa el flujo
//        
//        //Inicio=> 10
//        //Condición=>  i>0
//        //Incremento/Decremento => -1
//        for (int i = 10; i > 0; i--) {
//            System.out.println("(Decremento) I:" + i);
//        }

        //Creación de OBJETOS
        Carro mi_carrito_1 = new Carro(); //Objeto a partir de una CLASE
        mi_carrito_1.setMarca("Chevrolet"); //Modificar valor a los atributos
        mi_carrito_1.setModelo(2001);
        mi_carrito_1.setColor("azul");
        
        mi_carrito_1.mostrarInformacion();
        
        //Crear el objeto y enviar el valor de los atributos
        Carro mi_carrito_2 = new Carro("bmw", 2021, "verde"); //Objeto a partir de una CLASE
//        mi_carrito_2.setMarca("BMW");
//        mi_carrito_2.setModelo(2021);
//        mi_carrito_2.setColor("verde");
        
        mi_carrito_2.mostrarInformacion();
        
//        Scanner in = new Scanner(System.in);
//        
//        System.out.println("Ingrese el número 1: ");
//        int num1 = in.nextInt();
//        System.out.println("Ingrese el número 2: ");
//        int num2 = in.nextInt();
//
//        int resultado_operacion = sumar(num1, num2);//Ejecutar el método
//        System.out.println("Resultado "+num1+" + "+num2+"= " + resultado_operacion);
//        
//        saludar("Lola"); //Ejecutar método
    }
    
    
}
