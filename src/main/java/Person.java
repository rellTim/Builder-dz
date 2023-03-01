import java.util.Objects;

public class Person {
    protected final String name;
    protected final String family;
    private int age;
    private String city;


    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public Person(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setFamily(family).setCity(city);
    }

    @Override
    public String toString() {
        return "name - " + name + " family - " + family + " age - " + age + " city - " + city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && family.equals(person.family) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family);
    }
}
