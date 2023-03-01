public class PersonBuilder implements IPersonBuilder {
    private  String name;
    private String family;
    private int age;
    private String city;
    Person person;

    public PersonBuilder setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Поле имя пустое");
        } else this.name = name;
        return this;
    }

    public PersonBuilder setFamily(String family) {
        if (family == null) {
            throw new IllegalArgumentException("Поле фамилия пустое");
        } else this.family = family;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("В поле \"возраст\" указан некорректный возраст");
        } else this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        if (city == null) {
            throw new IllegalArgumentException("Поле город пустое");
        } else this.city = city;
        return this;
    }

    @Override
    public Person build() {
        if (name == null || family == null) {
            throw new IllegalArgumentException("Нету поля \"имя\" или \"фамилия\" ");
        }
        if (age < 1) {
            person = new Person(name, family);
        } else person = new Person(name, family, age);
        person.setCity(city);
        return person;
    }
}
