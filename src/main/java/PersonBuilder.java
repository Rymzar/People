
public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String city;
    private Person person;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Недопустимый возраст!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Не полные данные!");
        } else if (age >= 0 && city != null) {
            return  new Person(name, surname, age, city);
        } else if (age > 0) {
            return new Person(name, surname, age);
        } else if (city != null) {
            return new Person(name, surname, city);
        } else {
            return new Person(name, surname);
        }
    }
}
