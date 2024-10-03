/*
 2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
 */

 package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
  
public class Atv2 {
    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        //Paso 2: Declarar la variable vector de double 
        //Paso 3: Crear el vector para 15 double 
        double [] jugadores = new double[DF];
        //Paso 4: Declarar indice y variables auxiliares a usar
        int DF=15;
        double altura = 0;
        
        int i;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for(i=0;i<DF;i++){
            System.out.print("Ingrese la altura del jugador:");
            jugadores[i] = Lector.leerDouble();
            altura = altura + jugadores[i];
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        double promedio = altura/15;
        int cantMayorPromedio =0;
        for(i=0;i<DF;i++){
            if(jugadores[i] > promedio)
                cantMayorPromedio++;
        }
        //Paso 9: Informar la cantidad.
        System.out.println("---------------------------------------------------------------------------------");
        for(i=0;i<DF;i++){
            System.out.println("El jugador "+ i+ " tiene la edad: " + jugadores[i]);
        }
        System.out.println("La altura promedio es:"+promedio+ " la cantidad de jugadores con altura mayor que el promedio es: "+ cantMayorPromedio);

    }
    
}
