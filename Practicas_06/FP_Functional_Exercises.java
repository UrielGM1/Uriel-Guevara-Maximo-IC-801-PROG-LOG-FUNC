import java.util.List;
public class FP_Functional_Exercises {
     public static void main(String[] args) {
        List<Integer> numbers =List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses =List.of("Spring","Spring Boot","API",
        "Microservices","AWS","PCF","Azure","Docker","Kubernetes");        
         
         System.out.println("Exercise 1");
         PrintNumbers(numbers);  
         
         System.out.println("Exercise 2");
         PrintWords(courses);
        
         System.out.println("Exercise 3");
         ContainingSpring(courses);
        
         System.out.println("Exercise 4");
         WordsFourFunctional(courses);
        
         System.out.println("Exercise 5");
         CubeNumbersFunctional(numbers);
         System.out.println("Exercise 6");
         NumberCharacter(courses);
        
    }
    private static boolean NumbersOdd(int number){
        return (number%2!=0);
    }
    private static void Print(Object dato){
        System.out.print(dato +",");
    }
    private static boolean selectWords(String courses){
        return (courses.contains("Spring"));
    }
    private static boolean WordsFour(String courses){
        return courses.length()>=4;
    }
    private static int NumberChar(String courses){
        return courses.length();
    }
    private static void PrintNumbers(List<Integer> numbers){
    numbers.stream().filter(FP_Functional_Exercises::NumbersOdd).forEach(FP_Functional_Exercises::Print);
        System.out.println("");
    }
    private static void PrintWords(List<String> strings){
        strings.stream().forEach(FP_Functional_Exercises::Print);
        System.out.println("");
    }
    private static void ContainingSpring(List<String> strings){
        strings.stream().filter(FP_Functional_Exercises::selectWords).forEach(FP_Functional_Exercises::Print);
        System.out.println("");
    }
    private static void WordsFourFunctional(List<String> strings){
        strings.stream().filter(FP_Functional_Exercises::WordsFour).forEach(FP_Functional_Exercises::Print);
        System.out.println("");
    }
    private static void CubeNumbersFunctional(List<Integer> numbers){
        numbers.stream().map(number -> number*number*number).forEach(FP_Functional_Exercises::Print);
        System.out.println("");
    }
    private static void NumberCharacter(List<String> strings){
       strings.stream().map(FP_Functional_Exercises::NumberChar).forEach(FP_Functional_Exercises::Print);
    }
}