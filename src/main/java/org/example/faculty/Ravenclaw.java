package org.example.faculty;

import org.example.CharacterTraits;
import org.example.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private CharacterTraits cleverness;                //Интеллект
    private CharacterTraits wisdom;                //мудры
    private CharacterTraits wit;              //остроумны
    private CharacterTraits creative;              //творчество
    private String comparing = "  лучший Когтевранец , чем ";
    private String faculty = "Когтевран";

    public Ravenclaw(String name, String surname, int magikPower, int transgressionDistance, int cleverness, int wisdom, int wit, int creative) {
        super(name, surname, magikPower, transgressionDistance);
        checkValidProperty(cleverness, wisdom, wit, creative);
        this.cleverness = new CharacterTraits("интеллект",cleverness);
        this.wisdom = new CharacterTraits("мудрость",wisdom);
        this.wit = new CharacterTraits("остроумие",wit);
        this.creative = new CharacterTraits("полон творчества",creative);
    }
    public Ravenclaw( String name, String surname) {
        super(name, surname, (int) (Math.random() * 100), (int) (Math.random() * 100));
        this.cleverness = new CharacterTraits("интеллект",(int) (Math.random() * 100));
        this.wisdom = new CharacterTraits("мудрость",(int) (Math.random() * 100));
        this.wit = new CharacterTraits("остроумие",(int) (Math.random() * 100));
        this.creative = new CharacterTraits("полон творчества",(int) (Math.random() * 100));
    }
    public void compare(Ravenclaw ravenclaw){
        if (ravenclaw == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
        boolean isBetter = this.cleverness.getValue() + this.wisdom.getValue() + this.wit.getValue() +this.creative.getValue()>
                ravenclaw.cleverness.getValue() + ravenclaw.wisdom.getValue() + ravenclaw.wit.getValue() + ravenclaw.creative.getValue();
        if (isBetter) {
            System.out.println(getName()+ " " + getSurname() + comparing + ravenclaw.getName() + " " + ravenclaw.getSurname());
        } else {
            System.out.println(ravenclaw.getName() + " " + ravenclaw.getSurname() + comparing + getName() + " " + getSurname());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nФакультет: " + faculty +
                "; : " + cleverness +
                "; : " + wisdom +
                "; : " + wit +
                "; : " + creative +
                '.';
    }
}
