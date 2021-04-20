public class LambdaTest{
	public static void main(String[] args){
	  /*Expresion lambda --> representa un objeto
      de una interfaz funcional */	  
	   FunctionTest ft = ()-> System.out.println("Hola Mundo");
         ft.saludar();
	}
}