package org.example.faculty;

import org.example.CharacterTraits;
import org.example.Hogwarts;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private CharacterTraits hardworking;                //трудолюбивы
    private CharacterTraits loyalty;                //верность
    private CharacterTraits honesty;              //честность
    private static final String comparing = "  лучший Пуффендуец, чем ";

    public Hufflepuff(String name, String surname, int magikPower, int transgressionDistance, int hardworkingValue, int loyaltyValue, int honestyValue) {
        super(name, surname, magikPower, transgressionDistance);
        checkValidProperty(hardworkingValue, loyaltyValue, honestyValue);
        this.hardworking = new CharacterTraits("трудолюбие", hardworkingValue);
        this.loyalty = new CharacterTraits("верность", loyaltyValue);
        this.honesty = new CharacterTraits("честность", honestyValue);
        faculty = "Пуффендуй";
    }

    public Hufflepuff(String name, String surname) {
        super(name, surname, (int) (Math.random() * 100), (int) (Math.random() * 100));
        this.hardworking = new CharacterTraits("трудолюбие", (int) (Math.random() * 100));
        this.loyalty = new CharacterTraits("верность", (int) (Math.random() * 100));
        this.honesty = new CharacterTraits("честность", (int) (Math.random() * 100));
        faculty = "Пуффендуй";
    }

    private int calculateFacultyAttributes() {
        return hardworking.getValue() + loyalty.getValue() + honesty.getValue();
    }

    private static void compareFacultyAttributes(Hufflepuff hogwarts1, Hufflepuff hogwarts2) {
        if (hogwarts1.calculateFacultyAttributes() > hogwarts2.calculateFacultyAttributes()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + comparing + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts1.calculateFacultyAttributes() < hogwarts2.calculateFacultyAttributes()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + comparing + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " и " + hogwarts1.getName() + " " + hogwarts1.getSurname() + " равны на факультете");
        }
    }

    public void compare(Hufflepuff hufflepuff) {
        if (hufflepuff == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
        boolean isBetter = this.hardworking.getValue() + this.loyalty.getValue() + this.honesty.getValue() >
                hufflepuff.hardworking.getValue() + hufflepuff.loyalty.getValue() + hufflepuff.honesty.getValue();
        if (isBetter) {
            System.out.println(getName() + " " + getSurname() + comparing + hufflepuff.getName() + " " + hufflepuff.getSurname());
        } else {
            System.out.println(hufflepuff.getName() + " " + hufflepuff.getSurname() + comparing + getName() + " " + getSurname());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nФакультет: " + faculty +
                "; " + hardworking +
                "; " + loyalty +
                "; " + honesty +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return Objects.equals(hardworking, that.hardworking) && Objects.equals(loyalty, that.loyalty) && Objects.equals(honesty, that.honesty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyalty, honesty);
    }
}
