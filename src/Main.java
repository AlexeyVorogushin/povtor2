public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то нужно заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int man = 3;
        if (man >= 2 && man <= 6) {
            System.out.println("Если возраст человека равен " + man + " ,то ему нужно ходить в детский сад");
        } else if (man >= 7 && man <= 17) {
            System.out.println("Если возраст человека равен " + man + " ,то ему нужно ходить в школу");
        } else if (man >= 18 && man <= 24) {
            System.out.println("Если возраст человека равен " + man + " ,то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + man + " ,то ему пора ходить на работу");
        }
        System.out.println("Задача 5");
        int child = 15;
        if (child < 5) {
            System.out.println("Если возраст ребенка " + child + " ,то он не может кататься на аттракционе");
        } else if (child >= 5 && child <= 14){
            System.out.println("Если возраст ребенка " + child + " ,то он может кататься только в сопровождении взрослого.Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка " + child + " ,то он может кататься без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int h = 59;
        if (h < 60 && h > 0) {
            System.out.println("В вагоне есть сидячие места");
        } else if (h > 60 && h < 102) {
            System.out.println("В вогоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет маст");
        }
        System.out.println("Задача 7");
        int one = 1;
        int two = 5;
        int three = 3;
        if(one > two && one > three) {
            System.out.println("Число один наибольшее из всех");
        } else if (two > one && two > three) {
            System.out.println("Число два наибольшее из всех");
        } else {
            System.out.println("Число три наибольшее из всех");
        }
    }

}