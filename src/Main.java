public class Main {
    public static void main(String[] args) {
        // írd meg a person osztályt

        // példányosísd 3 szor a persont
        Person first = new Person(3);
        Person second = new Person(4);
        Person third = new Person(5);

        // kérd le a statikus fieldet
        System.out.println(first.getPopular());

        // példányosísd még 1 szer
        Person fourth = new Person(6);

        // kérd le a statikus fieldet
        System.out.println(fourth.getPopular());

        // hívd meg a katasztofa metódust
        System.out.println(Person.getDisaster());
    }
}