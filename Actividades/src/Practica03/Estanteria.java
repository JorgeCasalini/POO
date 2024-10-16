package practica03;

public class Estanteria {
  
   private int cantLibros = 0;
   private int maximo = 20;
   private Libro [] libros;
    
   
   public Estanteria(){
      libros = new Libro [maximo]; //Java hace con que todas posiciones del vector apunte a null, hasta que se hagan new Libro[pos]
   }
   
   public Estanteria(int n){
       maximo = n;
       libros = new Libro [n];
   }
   
   public int getCantLibros(){
       return cantLibros;
   }
   
   public boolean estaLleno(){
       return maximo == cantLibros;
   }
   //Supone que se checkeo que no este llena la estanteria con el modulo estaLleno
   public boolean agregarLibro(Libro libro1){
       if(!estaLleno()){
           libros[cantLibros++] = libro1;
           return true;
       }
       return false;
   }
   
   public Libro devolverTitulo(String titulo1){
       int aux = 0;
       while((aux < cantLibros) && (!titulo1.equals(this.libros[aux].getTitulo()))){
          aux++;
       }
      if(aux < cantLibros){
          return libros[aux];
      }
      else
           return null;
   }
   
   
}