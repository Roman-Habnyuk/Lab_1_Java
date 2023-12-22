import java.util.Objects;

/**
 * Клас, що представляє зоопарк.
 */
public class Zoo {
    private final String name;
    private final String location;

    private Zoo(Builder builder) {
        this.name = Objects.requireNonNull(builder.name, "Name cannot be null");
        this.location = builder.location;
    }

    /**
     * Повертає рядкове представлення зоопарку.
     */
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    /**
     * Порівнює два зоопарки за їхнім іменем та розташуванням.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(name, zoo.name) &&
                Objects.equals(location, zoo.location);
    }

    /**
     * Генерує хеш-код для зоопарку.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    /**
     * Клас для створення об'єкту зоопарку за допомогою патерну Builder.
     */
    public static class Builder {
        private final String name;
        private String location;

        /**
         * Конструктор для об'єкту Builder з обов'язковим параметром - ім'ям зоопарку.
         *
         * @param name ім'я зоопарку
         */
        public Builder(String name) {
            this.name = Objects.requireNonNull(name, "Name cannot be null");
        }

        /**
         * Встановлює розташування зоопарку.
         *
         * @param location розташування зоопарку
         * @return посилання на сам об'єкт Builder для ланцюгового виклику
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Повертає об'єкт зоопарку на основі накопичених параметрів.
         *
         * @return об'єкт зоопарку
         */
        public Zoo build() {
            return new Zoo(this);
        }
    }
}

/**
 * Клас, що представляє тварину в зоопарку.
 */
public class Animal {
    private final String species;
    private final int age;

    /**
     * Конструктор для класу Animal.
     *
     * @param species вид тварини
     * @param age     вік тварини
     */
    public Animal(String species, int age) {
        this.species = Objects.requireNonNull(species, "Species cannot be null");
        this.age = age;
    }

    /**
     * Повертає рядкове представлення тварини.
     */
    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Порівнює дві тварини за їхнім видом та віком.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(species, animal.species);
    }

    /**
     * Генерує хеш-код для тварини.
     */
    @Override
    public int hashCode() {
        return Objects.hash(species, age);
    }
}

/**
 * Клас, що представляє вольєр для тварин в зоопарку.
 */
public class Enclosure {
    private final String type;
    private final int capacity;

    /**
     * Конструктор для класу Enclosure.
     *
     * @param type     тип вольєру
     * @param capacity вмісткість вольєру
     */
    public Enclosure(String type, int capacity) {
        this.type = Objects.requireNonNull(type, "Type cannot be null");
        this.capacity = capacity;
    }

    /**
     * Повертає рядкове представлення вольєру.
     */
    @Override
    public String toString() {
        return "Enclosure{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    /**
     * Порівнює два вольєри за їхнім типом та вмісткістю.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enclosure enclosure = (Enclosure) o;
        return capacity == enclosure.capacity &&
                Objects.equals(type, enclosure.type);
    }

    /**
     * Генерує хеш-код для вольєру.
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, capacity);
    }
}
