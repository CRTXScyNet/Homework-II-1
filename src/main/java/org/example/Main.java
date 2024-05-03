package org.example;

import org.example.faculty.Gryffindor;
import org.example.faculty.Hufflepuff;
import org.example.faculty.Ravenclaw;
import org.example.faculty.Slytherin;

public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 34, 63, 1, 1, 1);
        Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер", 77, 77, 77, 77, 77);
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


        zaharia.compare(sedric);
        hermione.compareAnyStudents(draco);
        harry.compareAnyStudents(ron);
        chjow.compare(padma);
        chjow.compareAnyStudents(grehem);
        System.out.println(gregory);
        System.out.println(jastin);
        System.out.println(markus);
    }
    //faculty
    //gryffindor slytherin hufflepuff ravenclaw
}