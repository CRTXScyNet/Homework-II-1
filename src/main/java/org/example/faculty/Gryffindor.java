package org.example.faculty;

import org.example.CharacterTraits;
import org.example.Hogwarts;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private CharacterTraits nobility;                //благородство
    private CharacterTraits honor;                //честь
    private CharacterTraits bravery;              //храбрость
    private static final String comparing = "  лучший Гриффиндорец, чем ";


    public Gryffindor(String name, String surname, int magikPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, magikPower, transgressionDistance);
        checkValidProperty(nobility, honor, bravery);
        this.nobility = new CharacterTraits("благородство", nobility);
        this.honor = new CharacterTraits("честь", honor);
        this.bravery = new CharacterTraits("храбрость", bravery);
        faculty = "Гриффиндор";
    }

    public Gryffindor(String name, String surname) {
        super(name, surname, (int) (Math.random() * 100), (int) (Math.random() * 100));
        this.nobility = new CharacterTraits("благородство", (int) (Math.random() * 100));
        this.honor = new CharacterTraits("честь", (int) (Math.random() * 100));
        this.bravery = new CharacterTraits("храбрость", (int) (Math.random() * 100));
    }

    private int calculateFacultyAttributes() {
        return nobility.getValue() + honor.getValue() + bravery.getValue();
    }
    private static void compareFacultyAttributes(Gryffindor hogwarts1, Gryffindor hogwarts2) {
        if (hogwarts1.calculateFacultyAttributes() > hogwarts2.calculateFacultyAttributes()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + comparing + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts1.calculateFacultyAttributes() < hogwarts2.calculateFacultyAttributes()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + comparing + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " и " + hogwarts1.getName() + " " + hogwarts1.getSurname() + " равны на факультете");
        }
    }

    public void compare(Gryffindor gryffindor) {
        if (gryffindor == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
        compareFacultyAttributes(this, gryffindor);
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nФакультет: " + faculty +
                ", " + nobility +
                ", " + honor +
                ", " + bravery +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return Objects.equals(nobility, that.nobility) && Objects.equals(honor, that.honor) && Objects.equals(bravery, that.bravery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }
}
