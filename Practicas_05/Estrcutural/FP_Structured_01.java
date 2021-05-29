import java.util.List;

public class FP_Structured_01 {
    
	public static void main(String[] args) {
        List<Integer> numbers =  List.of(12,9,13,4,6,2,4,12,15);
        
		FP_Structured_01.printAllNumbersInListStructure(numbers);
        System.out.println("");
        
		FP_Structured_01.printEventNumbersInListEstructured(numbers);
        System.out.println("");
        
        printAllNumbersInListStructure(List.of(12,9,13,4,6,2,4,12,15));
        System.out.println("");
        
		printEventNumbersInListEstructured(List.of(12,9,13,4,6,2,12,15));
        System.out.println("");
        
   }
    
private static void printAllNumbersInListStructure(List<Integer> numbers){
    for(int number : numbers){
        System.out.print(number + ",");
    }
    System.out.println("");
}
  private static void printEventNumbersInListEstructured(List<Integer> numbers){
      for(int number: numbers){
          if(number % 2 ==0){
              System.out.print(number + ", ");
          }
      }
	   System.out.println("");
  }
}
