package org.example;

public abstract class Hogwarts {
    private int magikPower;
    private int transgressionDistance;
    private final String name;
    private final String surname;
    protected String faculty = "";
    private String comparing = " более сильный маг, чем ";

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
        boolean isBetter = this.magikPower + this.transgressionDistance > hogwarts.magikPower + hogwarts.transgressionDistance;
        if (isBetter) {
            System.out.println(getName() + " " + getSurname() + comparing + hogwarts.getName() + " " + hogwarts.getSurname());
        } else {
            System.out.println(hogwarts.getName() + " " + hogwarts.getSurname() + comparing + getName() + " " + getSurname());
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
