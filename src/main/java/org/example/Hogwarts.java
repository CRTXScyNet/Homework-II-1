package org.example;

public abstract class Hogwarts {
    private int magikPower;
    private int transgressionDistance;
    private final String name;
    private final String surname;
    protected String faculty = "";
    private static final String comparing = " более сильный маг, чем ";

    public Hogwarts(String name, String surname, int magikPower, int transgressionDistance) {
        checkValidProperty(magikPower, transgressionDistance);
        this.name = name;
        this.surname = surname;
        this.magikPower = magikPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagikPower() {
        return magikPower;
    }

    public void setMagikPower(int magikPower) {
        this.magikPower = magikPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public static void checkValidProperty(int... property) {
        for (int i : property) {
            if (i < 0 || i > 100) {
                throw new IllegalArgumentException("Свойство находится вне допустимого диапазона.");
            }
        }

    }

    public String getFaculty() {
        return faculty;
    }

    public void compareAnyStudents(Hogwarts hogwarts) {
        if (hogwarts == null) {
            throw new NullPointerException("Ошибка! Студента для сравнения не существует.");
        }
//        System.out.println(this);
//        System.out.println(hogwarts);
        compareBasicAttributes(this, hogwarts);
    }

    private int calculateBasicAttributes() {
        return magikPower + transgressionDistance;
    }

    private static void compareBasicAttributes(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if (hogwarts1.calculateBasicAttributes() > hogwarts2.calculateBasicAttributes()) {
            System.out.println(hogwarts1.getName() + " " + hogwarts1.getSurname() + comparing + hogwarts2.getName() + " " + hogwarts2.getSurname());
        } else if (hogwarts1.calculateBasicAttributes() < hogwarts2.calculateBasicAttributes()) {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + comparing + hogwarts1.getName() + " " + hogwarts1.getSurname());
        } else {
            System.out.println(hogwarts2.getName() + " " + hogwarts2.getSurname() + " и " + hogwarts1.getName() + " " + hogwarts1.getSurname() + " равны по магической силе");
        }
    }

    @Override
    public String toString() {
        return "Студент: \n" + "Имя: " + name + " " + surname +
                ", Магическая сила: " + magikPower +
                ", Расстояние трансгресии: " + transgressionDistance + ".";
        /*+ "Hogwarts{" +
                "magikPower=" + magikPower +
                ", transgressionDistance=" + transgressionDistance +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';*/
    }
}
