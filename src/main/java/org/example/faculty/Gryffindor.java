package org.example.faculty;

import org.example.CharacterTraits;
import org.example.Hogwarts;

public class Gryffindor extends Hogwarts {
    private CharacterTraits nobility;                //благородство
    private CharacterTraits honor;                //честь
    private CharacterTraits bravery;              //храбрость
    private String comparing = "  лучший Гриффиндорец , чем ";
    private String faculty = "Гриффиндор";


    public Gryffindor(String name, String surname, int magikPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, magikPower, transgressionDistance);
        checkValidProperty(nobility, honor, bravery);
        this.nobility = new CharacterTraits("благородство", nobility);
        this.honor = new CharacterTraits("честь", honor);
        this.bravery = new CharacterTraits("храбрость", bravery);
    }

    public Gryffindor(String name, String surname) {
        super(name, surname, (int) (Math.random() * 100), (int) (Math.random() * 100));
        this.nobility = new CharacterTraits("благородство", (int) (Math.random() * 100));
        this.honor = new CharacterTraits("честь", (int) (Math.random() * 100));
        this.bravery = new CharacterTraits("храбрость", (int) (Math.random() * 100));
    }

    public void compare(Gryffindor gryffindor) {
        if (gryffindor == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
        boolean isBetter = this.nobility.getValue() + this.honor.getValue() + this.bravery.getValue() >
                gryffindor.nobility.getValue() + gryffindor.honor.getValue() + gryffindor.bravery.getValue();
        if (isBetter) {
            System.out.println(getName() + " " + getSurname() + comparing + gryffindor.getName() + " " + gryffindor.getSurname());
        } else {
            System.out.println(gryffindor.getName() + " " + gryffindor.getSurname() + comparing + getName() + " " + getSurname());
        }
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
}
