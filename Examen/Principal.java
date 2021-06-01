//1
public class Principal {
   //2
    public static void main(String[] args) {
        //3
        PruebaExamen pe;
        //4
        pe = (x, y, z) -> System.out.println(x+y+z);
        pe.operacionPrueba(5, 6, 7);               
        //5       
        System.out.println(PruebaExamen.operacionPrueba(6,4));        
        //6
        pe.mensajeHola();        
        //7
        pe.mensajeHola("Prueba de funcionamiento");
       //8
        pe = (x, y, z) -> System.out.println(x+(y*z));
        pe.operacionPrueba(3, 2, 4);
       //9
        pe.operacionPrueba(4,PruebaExamen.operacionPrueba(3,2),PruebaExamen.operacionPrueba(7,5));
       //12
        miMetodo(pe);      
       //13
        miMetodo((x,y,z)-> System.out.println(x+(y/z))); 
       //16
       pe = (x, y, z) -> System.out.println((double)x+y/z);
       pe.operacionPrueba(5,6,3);
       //17
       miMetodo(pe,2,3,5);      
    } 
    //10
   private static void miMetodo(PruebaExamen ObjPruExam){
     //11
      ObjPruExam.operacionPrueba(4,PruebaExamen.operacionPrueba(3,2),PruebaExamen.operacionPrueba(7,5));
   }
   //14
   private static void miMetodo(PruebaExamen ObjPruExam,int x, int y, int z){
      //15
      ObjPruExam.operacionPrueba(x,PruebaExamen.operacionPrueba(y, y),PruebaExamen.operacionPrueba(z,z));
    }
}