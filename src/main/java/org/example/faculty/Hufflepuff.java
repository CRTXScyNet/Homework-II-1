package org.example.faculty;

import org.example.CharacterTraits;
import org.example.Hogwarts;

public class Hufflepuff extends Hogwarts {
    private CharacterTraits hardworking;                //трудолюбивы
    private CharacterTraits loyalty;                //верность
    private CharacterTraits honesty;              //честность
    private String comparing = "  лучший Пуффендуец , чем ";
    private String faculty = "Пуффендуй";

    public Hufflepuff( String name, String surname, int magikPower, int transgressionDistance,int hardworkingValue, int loyaltyValue, int honestyValue) {
        super( name, surname, magikPower, transgressionDistance);
        checkValidProperty(hardworkingValue, loyaltyValue, honestyValue);
        this.hardworking = new CharacterTraits("трудолюбие", hardworkingValue);
        this.loyalty = new CharacterTraits("верность", loyaltyValue);
        this.honesty = new CharacterTraits("честность", honestyValue);
    }

    public Hufflepuff(String name, String surname) {
        super(name, surname, (int) (Math.random() * 100), (int) (Math.random() * 100));
        this.hardworking = new CharacterTraits("трудолюбие", (int) (Math.random() * 100));
        this.loyalty = new CharacterTraits("верность", (int) (Math.random() * 100));
        this.honesty = new CharacterTraits("честность", (int) (Math.random() * 100));
    }

    public void compare(Hufflepuff hufflepuff) {
        if (hufflepuff == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
        boolean isBetter = this.hardworking.getValue() + this.loyalty.getValue() + this.honesty.getValue() >
                hufflepuff.hardworking.getValue() + hufflepuff.loyalty.getValue() + hufflepuff.honesty.getValue();
        if (isBetter) {
            System.out.println(getName()+ " " + getSurname() + comparing + hufflepuff.getName() + " " + hufflepuff.getSurname());
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
}
