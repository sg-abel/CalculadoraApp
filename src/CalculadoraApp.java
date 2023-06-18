import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true){
            System.out.println("**** Aplicacion Calculadora ****");
            //Mostrar Menu
            mostrarMenu();
                try {
                    var operacion = Integer.parseInt(consola.nextLine());
                    //revisar que este dentro de las opciones seleccionadas
                    if (operacion >= 1 && operacion <= 4) {
                        //Ejecutamos la operacion deseada
                        ejecutarOperacion(operacion, consola);
                    } else if (operacion == 5) {//Salir
                        System.out.println("Hasta Pronto...");
                        break;
                    } else {
                        System.out.println("Opcion erronea: " + operacion);
                    }
                    //imprimir un salto antes de repetir el ciclo
                    System.out.println();
                }//fin Try
            catch (Exception e){
                    System.out.println("Ocurrio un error: " + e.getMessage());
            }
        } //fin ciclo while
    }// fin de main

    private static void mostrarMenu() {
        System.out.print("""
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Salir
                """);
        System.out.print("Elige la operacion a realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona el primer valor: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el segundo valor: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        Double resultado;
        switch (operacion) {
            case 1 -> {//suma
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {//resta
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {//multiplicacion
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
            case 4 -> {//division
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es: " + resultado);
            }
            default -> System.out.println("Operacion Erronea: " + operacion);
        }

    }

}//fin de clase
