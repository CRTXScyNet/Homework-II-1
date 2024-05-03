package org.example.faculty;

import org.example.CharacterTraits;
import org.example.Hogwarts;

public class Slytherin extends Hogwarts {
    private CharacterTraits cunning;                //хитрость
    private CharacterTraits determination;                //решительность
    private CharacterTraits ambition;              //амбициозность
    private CharacterTraits resourcefulness;              //находчивость
    private CharacterTraits lustForPower;              //жажда власти
    private String comparing = "  лучший Слизеринец , чем ";
    private String faculty = "Слизерин";

    public Slytherin(String name, String surname, int magikPower, int transgressionDistance,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magikPower, transgressionDistance);
        checkValidProperty(cunning, determination, ambition, resourcefulness, lustForPower);
        this.cunning = new CharacterTraits("хитрость", cunning);
        this.determination = new CharacterTraits("решительность", determination);
        this.ambition = new CharacterTraits("амбициозность", ambition);
        this.resourcefulness = new CharacterTraits("находчивость", resourcefulness);
        this.lustForPower = new CharacterTraits("жажда власти", lustForPower);
    }

    public Slytherin(String name, String surname) {
        super(name, surname, (int) (Math.random() * 100), (int) (Math.random() * 100));
        this.cunning = new CharacterTraits("хитрость", (int) (Math.random() * 100));
        this.determination = new CharacterTraits("решительность", (int) (Math.random() * 100));
        this.ambition = new CharacterTraits("амбициозность", (int) (Math.random() * 100));
        this.resourcefulness = new CharacterTraits("находчивость", (int) (Math.random() * 100));
        this.lustForPower = new CharacterTraits("жажда власти", (int) (Math.random() * 100));
    }

    public void compare(Slytherin slytherin) {
        if (slytherin == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
        boolean isBetter = this.cunning.getValue() + this.determination.getValue() + this.ambition.getValue()
                + this.resourcefulness.getValue() + this.lustForPower.getValue() >
                slytherin.cunning.getValue() + slytherin.determination.getValue() + slytherin.ambition.getValue()
                        + slytherin.resourcefulness.getValue() + slytherin.lustForPower.getValue();
        if (isBetter) {
            System.out.println(getName()+ " " + getSurname() + comparing + slytherin.getName() + " " + slytherin.getSurname());
        } else {
            System.out.println(slytherin.getName() + " " + slytherin.getSurname() + comparing + getName() + " " + getSurname());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nФакультет: " + faculty +
                "; " + cunning +
                ";  " + determination +
                "; " + ambition +
                "; " + resourcefulness +
                "; " + lustForPower +
                '.';
    }
}
