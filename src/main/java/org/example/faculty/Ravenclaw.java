package org.example.faculty;

import org.example.CharacterTraits;
import org.example.Hogwarts;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private CharacterTraits cleverness;                //Интеллект
    private CharacterTraits wisdom;                //мудры
    private CharacterTraits wit;              //остроумны
    private CharacterTraits creative;              //творчество
    private static final String comparing = "  лучший Когтевранец, чем ";


    public Ravenclaw(String name, String surname, int magikPower, int transgressionDistance, int cleverness, int wisdom, int wit, int creative) {
        super(name, surname, magikPower, transgressionDistance);
        checkValidProperty(cleverness, wisdom, wit, creative);
        this.cleverness = new CharacterTraits("интеллект", cleverness);
        this.wisdom = new CharacterTraits("мудрость", wisdom);
        this.wit = new CharacterTraits("остроумие", wit);
        this.creative = new CharacterTraits("полон творчества", creative);
        faculty = "Когтевран";
    }

    public Ravenclaw(String name, String surname) {
        super(name, surname, (int) (Math.random() * 100), (int) (Math.random() * 100));
        this.cleverness = new CharacterTraits("интеллект", (int) (Math.random() * 100));
        this.wisdom = new CharacterTraits("мудрость", (int) (Math.random() * 100));
        this.wit = new CharacterTraits("остроумие", (int) (Math.random() * 100));
        this.creative = new CharacterTraits("полон творчества", (int) (Math.random() * 100));
    }
    private int calculateFacultyAttributes() {
        return cleverness.getValue() + wisdom.getValue() + wit.getValue() + creative.getValue();
    }
    private static void compareFacultyAttributes(Ravenclaw hogwarts1, Ravenclaw hogwarts2) {
        if (hogwarts1.calculateFacultyAttributes() > hogwarts2.calculateFacultyAttributes()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + comparing + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts1.calculateFacultyAttributes() < hogwarts2.calculateFacultyAttributes()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + comparing + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " и " + hogwarts1.getName() + " " + hogwarts1.getSurname() + " равны на факультете");
        }
    }
    public void compare(Ravenclaw ravenclaw) {
        if (ravenclaw == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
compareFacultyAttributes(this,ravenclaw);
    }

    @Override
    public String toString() {
        return super.toString() + "\nФакультет: " + faculty +
                "; " + cleverness +
                "; " + wisdom +
                "; " + wit +
                "; " + creative +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return Objects.equals(cleverness, ravenclaw.cleverness) && Objects.equals(wisdom, ravenclaw.wisdom) && Objects.equals(wit, ravenclaw.wit) && Objects.equals(creative, ravenclaw.creative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cleverness, wisdom, wit, creative);
    }
}
