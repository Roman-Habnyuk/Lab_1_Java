import java.util.Objects;
/**
 * Клас, що представляє зоопарк.
 */
public class Zoo {
    private final String name;
    private final String location;

    private Zoo(Builder builder) {
        this.name = Objects.requireNonNull(builder.name, "Zoo Caren");
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
