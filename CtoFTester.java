/** parameter for celcius to farenheit should just be a variable for celcius, and
visa versa. They should be double since inputs can have decimals.
**/
import java.util.Scanner;

public class CtoFTester{

  public static void main(String[] args) {
    String input;
    Scanner in = new Scanner(System.in);

    System.out.print("Celcius: ");
    input = in.nextLine();
    System.out.print("equals ");
    celsiusToFahrenheit(input);
    System.out.println(" Farenheit");
  }

  public double celsiusToFahrenheit(double celc) {
    return (celc * 9 / 5) + 32;
  }

  public double fahrenheitToCelsius(double faren) {
    return (faren - 32) * 5 / 9;
  }
}
