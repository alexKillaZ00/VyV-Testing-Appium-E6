
import java.util.*;
import java.util.Scanner;

class Nodo {

    int operando;
    int esoperando;
    char opr;
    Nodo izquierda;
    Nodo derecha;

    Nodo(int operando, char opr, int esoperando) {
        this.operando = operando;
        this.esoperando = esoperando;
        this.izquierda = null;
        this.derecha = null;
        this.opr = opr;
    }

}//cierra clase Nodo

public class EvaluarExpresiones {

    public static Nodo crearNodo(int operando, char opr, int esoperando) {
        return new Nodo(operando, opr, esoperando);
    }//cierra crearNodo

    public static boolean esoperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }//cierra esoperador

    public static int precedencia(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '^') {
            return 3;
        }
        return 0;
    }//cierra precedencia

    public static String infijoAposfijo(String infix) {
        String var = "Xx";
        Scanner read = new Scanner(System.in);
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String[] tokens = infix.split("\\s+");

        int vari = 0;
        for (String token : tokens) {
            char c = token.charAt(0);
            if (Character.isDigit(c)) {
                postfix.append(token).append(" ");
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }//cierra ciclo white
                stack.pop();

            } else if (esoperador(c)) {
                while (!stack.isEmpty() && precedencia(c) <= precedencia(stack.peek())) {
                    postfix.append(stack.pop()).append(" ");
                }//cierra while

                stack.push(c);

            } else if (var.indexOf(c) != -1 && vari == 0) {
                System.out.println("Ingresa el valor de x: ");
                vari = read.nextInt();
                postfix.append(vari).append(" ");
                
            } else if (vari!=0){
                postfix.append(vari).append(" ");

            }//cierra else
        }//cierra llave for

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }//cierra while

        return postfix.toString();

    }//cierra metodo infijoAposfijo

    public static Nodo construirArbolExpression(String posfij) {
        Stack<Nodo> stack = new Stack<>();
        String[] tokens = posfij.split("\\s+");

        for (String token : tokens) {

            char c = token.charAt(0);

            if (Character.isDigit(c)) {
                //int aux = Integer.parseInt(token);
                stack.push(crearNodo(Integer.parseInt(token), '#', 1));

            } else if (esoperador(c)) {
                Nodo nuevoNodo = crearNodo(-1, c, 0);
                nuevoNodo.derecha = stack.pop();
                nuevoNodo.izquierda = stack.pop();
                stack.push(nuevoNodo);
            }//cierra llave else

        }//cierra for tokens
        return stack.pop();
    } //Cierrra llave metodo construirArbolExpression

    public static int evaluarArbolExpresion(Nodo node) {

        if (node.esoperando == 1) {
            return node.operando;
        }//cierra if

        int izqVal = evaluarArbolExpresion(node.izquierda);
        int derVal = evaluarArbolExpresion(node.derecha);

        switch (node.opr) {
            case '+':
                return izqVal + derVal;
            case '-':
                return izqVal - derVal;
            case '*':
                return izqVal * derVal;
            case '/':
                if (derVal == 0) {
                    throw new ArithmeticException("Nose puede dividir entre cero.");
                }//cierra if
                return izqVal / derVal;

            case '^':

                return (int) Math.pow(izqVal, derVal);

            default:
                return 0;
        }//cierra switch
    }//cierra llave metodo evaluarArbolExpresion

    public static void main(String[] args) {
        String infixExpression = "30 + 5 + 5 - x ^ x"; //^ 
        String postfixExpression = infijoAposfijo(infixExpression);

        System.out.println(postfixExpression);
        Nodo expressionTree = construirArbolExpression(postfixExpression);
        int result = evaluarArbolExpresion(expressionTree);
        System.out.println("Value of the expression: " + result);
    }//cierra clase main

}//cierra llave de la clase principal
