/*
 3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Leer un valor entero e indicar si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.
 */

package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Atv3 {
    
    public static void main(String[] args) {
        //Paso 2. iniciar el generador aleatorio
        GeneradorAleatorio.iniciar();
        int i,j,DF=5;
	int [][] matriz = new int[DF][DF];
        
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios        
        for(i=0;i<DF;i++){
            for(j=0;j<DF;j++)
                matriz[i][j]= GeneradorAleatorio.generarInt(31);
        }
        
//Paso 4. mostrar el contenido de la matriz en consola
        int cantFila1=0;
        for(i=0;i<DF;i++){
            System.out.println("----");
                for(j=0;j<DF;j++){
                if(j==0)
                    cantFila1= cantFila1 +matriz[i][0]; 
            
                System.out.print("(" + i + "," + j + ")" + matriz[i][j] + "|");
        
                }
        }
                System.out.println("----");
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        /*
        for(i=0;i<DF;i++)
            cantFila1= cantFila1 +matriz[i][0];
        System.out.println("Cantidad Fila 1: "+ cantFila1);
        */
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //Luego, imprima el vector.
        int [] vector = new int [DF];
        for(j=0;j<DF;j++){
            int total=0;
            for(i=0;i<DF;i++)
                total=total + matriz[j][i];
            vector[j]=total;
            System.out.println("TOTAL DE LA FILA "+ j + ": "+ vector[j]);
        }
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        System.out.println("Ingrese un valor: ");
        int valor = Lector.leerInt();
        boolean encontro=false;
        for(i=0;i<DF;i++){
            for(j=0;j<DF;j++)
                 if(valor==matriz[i][j]){
                    System.out.println("El valor fue encontrado en la posicion ("+ i +","+j+")");
                    encontro=true;
                 }
                 
        }
        if(encontro ==false)
            System.out.println("No se encontró el elemento");
    }
    
}
