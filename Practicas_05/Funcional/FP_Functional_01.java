import java.util.List;
public class FP_Functional_01 {
    
	public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        
        System.out.println("Using to --> [System.out::print] by default");
        printAllNumbersInListFunctional_two(numbers);
       
	    System.out.println("\nprintAllNumbersInListFunctional: ");
        printAllNumbersInListFunctional(numbers);
       
   	    System.out.println("\n printEventNumbersInListFunctional");
        printEventNumbersInListFunctional(numbers);
        
		System.out.println("\nprintSquaresOfEvenNumbersInListFunctional: ");
        printSquaresOfEvenNumbersInListFunctional(numbers);
        
		System.out.println("");
        
    }
    private static void print(int number){
        System.out.print(number + ",");
    }
    private static boolean isEvent(int number){
        return (number%2==0);
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
		.forEach(FP_Functional_01::print);
        System.out.println("");
    }
    private static void printAllNumbersInListFunctional_two(List<Integer> numbers){
        numbers.stream()
		.forEach(System.out::print);
        System.out.println("");
    }
    private static void printEventNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
		.filter(FP_Functional_01::isEvent)
		.forEach(FP_Functional_01::print);
        System.out.println("");
    }
    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
        .filter(number -> number %2==0)
        .map(number -> number*number)
        .forEach(FP_Functional_01::print);
        System.out.println("");
    }
}
