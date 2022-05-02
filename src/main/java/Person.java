public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        age = -1;
        city = null;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        city = null;
    }

    public Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        age = -1;
        this.city = city;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city == null ? "Адрес отсутствует!" : city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAge(0).setCity(city);
    }
    @Override
    public String toString() {
        return name + " " + surname + " (" + (hasAge() ? age + ", " : "") + (hasAddress() ? city : "") + ")";
    }

}
