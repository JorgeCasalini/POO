/*
 1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la tabla
del 2.
Genere enteros aleatorios hasta obtener el número 11. Para cada número muestre
el resultado de multiplicarlo por 2 (accediendo al vector).
 */


import PaqueteLectura.GeneradorAleatorio;

public class Atv1 {
    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) {
            tabla2[i]=2*i;
        }
        
        int ale= GeneradorAleatorio.generarInt(12);
        while(ale!=11){
             System.out.println("2x" + ale + "=" + tabla2[ale]);
             ale= GeneradorAleatorio.generarInt(12);
        }
    }
    
}
