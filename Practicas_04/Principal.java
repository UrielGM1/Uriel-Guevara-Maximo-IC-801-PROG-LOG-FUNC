public class Principal {
    public static void main(String[] args) {
        System.out.println(Principal.engine("==>CalculadoraInt -->Resultado= ").calcular(5, 6));
        System.out.println("==>CalculadoraLong -->Resultado= " + Principal.engine().calcular(67,45));
    }
    private static CalculadoraInt engine(String cal) {
        System.out.print(cal);
        return (x, y) -> x * y;
    }
    private static CalculadoraLong engine() {
        return (x, y) -> x - y;
    }
}
