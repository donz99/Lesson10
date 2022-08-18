package Lesson9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //Proc1. Описать функцию PowerA3(A), вычисляющую третью степень числа A и возвращающую ее.
    // С помощью этой
    //процедуры найти третьи степени пяти разных чисел.
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите целое число ");
            int x = in.nextInt();
            System.out.println("x^3 = " + powerA3(x));
        }
    }
    static int powerA3(int a) {
        return a*a*a; // или int cube=a*a*a; -->> return cube
    }*/

    //  Proc3. Описать 2 функции аMean(X, Y), вычисляющую
    //среднее арифметическое AMean = (X+Y)/2 и gMean(X, Y) среднее геометрическое
    //GMean =√X·Y двух положительных чисел X и Y. С помощью
    //этих функци найти среднее арифметическое и среднее геометрическое
    //для пар (A, B), (A, C), (A, D), если даны A, B, C, D

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=5;
        for (int i = 0; i < 3; i++) {
            int z = (int)(Math.random()*10);
            System.out.println(a+" "+z+" amean = " + aMean(a,z));
            System.out.println(a+" "+z+" gmean = " + gMean(a,z));
        }
        }


    static double aMean (int x, int y){
        return (x+y)/2.0;
    }
    static double gMean (int x, int y){
        return Math.sqrt(x*y);    //math это статический метод
    }*/

    //Proc4◦
    //. Описать 2 функции процедуру triangleP(a), вычисляющую по стороне a
    //равностороннего треугольника его периметр P = 3·a и triangles(a) площадь
    // S = (a2·√/3)/4
    //(все параметры являются вещественными). С помощью этой процедуры найти периметры и площади
    //трех равносторонних треугольников с данными сторонами.

    /*static double perimetr (double a){
        return 3*a;
    }
    static double plos (double a){
        return (a*a*Math.sqrt(3)/4.0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {


            double a = in.nextDouble();
            int z = (int)(Math.random()*10);
            System.out.println("Периметр треугольника со сторой "+ a+": "+ perimetr(a));
            System.out.println("Площадь со сторонй "+a+" " + plos(a));
        }
    }

    double a = in.nextDouble();
    int z = (int)(Math.random()*10);
            System.out.println("Периметр треугольника со сторой "+ a+": "+ perimetr(a));
            System.out.println("Площадь со сторонй "+a+" " + plos(a));*/


    //Proc5. Описать функцию RectP(x1, y1, x2, y2), вычисляющую периметр P
    //прямоугольника со сторонами, параллельными осям координат, по координатам (x1, y1),
    // (x2, y2) его противоположных вершин
    //С помощью этой функции найти периметры трех прямоугольников с данными противоположными
    // вершинами.

    //Вычислить площадь трёх треугольников треугольника по формуле Герона
    // S = √p*(p-a)*(p-b)*(p-c)
    // р - полупериметр, a, b, c - стороны
    //Проверить с помощью функции, что по сторонам a, b, c можно построить треугольник

    /*static boolean isTriangle (int a, int b, int c){
        return a+b > c && a+c > b && b+c > a;
    }
    static double p(int a, int b, int c){
        return (a+b+c)/2.0;
    }
    static double s(int a, int b, int c){
        double p = p(a,b,c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите стороны треугольника: ");
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if (isTriangle(a,b,c)){
                System.out.println("Площадь треугольника " + s(a,b,c));
            }
            else {
                System.out.println("Треугольника с такими сторонами не существует ");
            }
        }
    }*/


    //        Proc6. Описать функцию DigitCount(K), находящую количество
    //        цифр целого положительного числа K. С помощью этой функции
    //        найти количество цифр для каждого из пяти целых чисел.

    //ф-ция подсчитывает кол-во цифр в числе
    /*static int digintCount (int a){
        int k=0;
        while(a!=0) {
            a /= 10;
            k++;
        }
        return k;
    }


    public static void main(String[] args) {
        Random gen = new Random();
        for (int i = 0; i < 5; i++) {
            int x = gen.nextInt(1_000_000);
            System.out.println("В числе " + x + " " + digintCount(x) + " цифр");
        }
    }*/

    //ф-ция подсчитывает сумму цифр в числе

    /*static int sum(int a) {
        int sum = 0;
        while (a != 0) {
            int c = a % 10;
            a /= 10;
            sum += c;

        }
        return sum;
    }


    public static void main(String[] args) {
        Random gen = new Random();
        for (int i = 0; i < 5; i++) {
            int x = gen.nextInt(100);

            System.out.println("В числе " + x + " Сумма цифр " + sum(x));
        }
    }*/

    // Proc8◦
    //. Описать процедуру AddRightDigit(D, K), добавляющую к целому положительному числу K справа цифру D (D — входной параметр целого
    //типа, лежащий в диапазоне 0–9, K — параметр целого типа, являющийся
    //одновременно входным и выходным). С помощью этой процедуры последовательно добавить к данному числу K справа данные цифры D1 и D2,
    //выводя результат каждого добавления.

    static int addRightDigir(int d, int k) {
        return k * 10 + d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int k = in.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите цифру ");
            int d = in.nextInt();
            System.out.println(addRightDigir(d,k));
        }
    }

    // Proc16. Описать функцию Sign(X) целого типа, возвращающую для целого
    // числа X следующие значения:
    //−1, если X < 0; 0, если X = 0; 1, если X > 0.
    //С помощью этой функции найти значение выражения Sign(A) + Sign(B)
    //для данных вещественных чисел A и B. infinity

    static int sign(int k){
        int sign=0;
        if (k<0) sign = -1;
        else if (k==0) sign = 0;
        else if (k>0) sign = 1;
        return sign;
    }


}


