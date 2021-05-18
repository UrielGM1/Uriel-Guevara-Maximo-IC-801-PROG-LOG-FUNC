//1
public interface PruebaExamen {
    //2	
    public default void mensajeHola(){
      //3
	  System.out.println("Mi nombre es: Uriel Guevara");      
    }
    //4
    public default void mensajeHola(String cadena){
		System.out.println("La cadena es: "+ cadena);
    }
    //5
    public static int operacionPrueba(int x, int y){
	    //6	
        return x+y;
    }
    //7
    public void operacionPrueba(int x, int y, int z);        
}
