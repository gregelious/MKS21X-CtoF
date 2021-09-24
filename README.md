# MKS21X-CtoF

Did not finish but this is what I was able to come up with, I have to figure out how to get inputs as doubles instead of strings.

Also could not figure out how to commit and push from git bash, I dragged my files here so I dont know if the code will be shown properly, I will also paste it here:

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

