import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

      char sexo;
      double h, psIdeal;

      System.out.printf("Informe o sexo (M/F): ");
      sexo = (char)System.in.read();

      System.out.printf("Informe a altura (m): ");
      h = ler.nextDouble();

      if ((sexo == 'M') || (sexo == 'm'))
         psIdeal = (72.7 * h) - 58;
      else
         psIdeal = (62.1 * h) - 44.7;

      System.out.printf("\nO Peso Ideal eh: %6.2f kgs.\n", psIdeal);
    }
}
