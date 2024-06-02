import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Celsius and Fahrenheit");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature to convert: ");
        double inputTemperature = scanner.nextDouble();

        switch (choice) {
            case 1:
                convertFromCelsius(inputTemperature);
                break;
            case 2:
                convertFromFahrenheit(inputTemperature);
                break;
            case 3:
                convertFromKelvin(inputTemperature);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Celsius: %.2f, Fahrenheit: %.2f, Kelvin: %.2f\n", celsius, fahrenheit, kelvin);
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.printf("Fahrenheit: %.2f, Celsius: %.2f, Kelvin: %.2f\n", fahrenheit, celsius, kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        System.out.printf("Kelvin: %.2f, Celsius: %.2f, Fahrenheit: %.2f\n", kelvin, celsius, fahrenheit);
    }
}
