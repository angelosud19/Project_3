public class Main {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = 5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de " + x + " = " + "%.2f%n", A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de " + z + " = " + C + System.lineSeparator());

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + "elevado a " + y + " = " + A);
        System.out.println(x + "elevado ao quadrado = " + B);
        System.out.println(x + "5 elevado ao quadrado = " + A + System.lineSeparator());

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        //TESTE VERSAO

    }
}