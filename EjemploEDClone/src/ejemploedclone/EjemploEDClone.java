package ejemploedclone;

import java.util.Scanner;

public class EjemploEDClone {

    public static void main(String[] args) {

        int option = -1;
        int op1 = 0, op2 = 0;
        float resultado;
        boolean valid;
        Scanner keyboard = new Scanner(System.in);

        do {
            try {
                System.out.println("--------------");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("6. Prueba");
                option = keyboard.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Introduca operando 1:");
                        valid = false;
                        do {
                            try {
                                op1 = keyboard.nextInt();
                                valid = true;
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);

                        System.out.print("Introduca operando 2:");
                        valid = false;
                        do {
                            try {
                                op2 = keyboard.nextInt();
                                valid = true;
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);
                        resultado = op1 + op2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        System.out.print("Introduca operando 1:");
                        valid = false;
                        do {
                            try {
                                op1 = keyboard.nextInt();
                                valid = true;
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);

                        System.out.print("Introduca operando 2:");
                        valid = false;
                        do {
                            try {
                                op2 = keyboard.nextInt();
                                valid = true;
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);
                        resultado = op1 - op2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        System.out.print("Introduca operando 1:");
                        valid = false;
                        do {
                            try {
                                op1 = keyboard.nextInt();
                                valid = true;
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);

                        System.out.print("Introduca operando 2:");
                        valid = false;
                        do {
                            try {
                                op2 = keyboard.nextInt();
                                valid = true;
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);
                        resultado = op1 * op2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        System.out.print("Introduca operando 1:");
                        valid = false;
                        do {
                            try {
                                op1 = keyboard.nextInt();
                                valid = true;
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);

                        System.out.print("Introduca operando 2:");
                        valid = false;
                        do {
                            try {
                                op2 = keyboard.nextInt();
                                if (op2 == 0) {
                                    throw new Exception("Division por cero");
                                } else {
                                    valid = true;
                                }
                            } catch (Exception e) {
                                valid = false;
                                System.out.println("Introduzca un número entero mayor que cero");
                                keyboard = new Scanner(System.in);
                            }
                        } while (!valid);
                        resultado = (float) op1 / (float) op2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Introduzca opción válida");

                }
            } catch (Exception e) {
                System.out.println("Introduzca una opción válida");
                keyboard = new Scanner(System.in);
            }
        } while (option != 5);
        System.out.println("Gracias por usar este soft");

    }

}
