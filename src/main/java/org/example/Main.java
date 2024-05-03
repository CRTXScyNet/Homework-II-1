package org.example;

import org.example.faculty.Gryffindor;
import org.example.faculty.Hufflepuff;
import org.example.faculty.Ravenclaw;
import org.example.faculty.Slytherin;

public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри", "Поттер");
        Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер");
        Gryffindor ron = new Gryffindor("Рон", "Уизли");

        Slytherin draco = new Slytherin("Драко", "Малфой");
        Slytherin grehem = new Slytherin("Грехем", "Монтегю", 51, 15, 15, 23, 56, 23, 33);
        Slytherin gregory = new Slytherin("Грегори", "Гойл");

        Hufflepuff zaharia = new Hufflepuff("Захария", "Смит");
        Hufflepuff sedric = new Hufflepuff("Седрик", "Диггори", 23, 52, 23, 5, 2);
        Hufflepuff jastin = new Hufflepuff("Джастин", "Финч-Флетчли");

        Ravenclaw chjow = new Ravenclaw("Чжоу", "Чанг", 23, 52, 23, 2, 5, 3);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил");
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 34, 1, 34, 75, 8, 45);



        System.out.println(harry);
        System.out.println();
        System.out.println(hermione);
        System.out.println();
        harry.compare(hermione);
        System.out.println();
        System.out.println(markus);
        System.out.println();
        System.out.println(zaharia);
        System.out.println();
        markus.compareAnyStudents(zaharia);
    }
    //faculty
    //gryffindor slytherin hufflepuff ravenclaw
}