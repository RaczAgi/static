public class Main {
    public static void main(String[] args) {
        // írd meg a person osztályt
        Person first = new Person();
        Person second = new Person();
        Person third = new Person();

        // példányosísd 3 szor a persont
        System.out.println(Person.getPopular());

        // kérd le a statikus fieldet


        // példányosísd még 1 szer
        Person fourth = new Person();

        // kérd le a statikus fieldet
        System.out.println(Person.getPopular());

        // hívd meg a katasztofa metódust
        System.out.println(Person.getDisaster());;
    }
}