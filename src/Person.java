 public class Person {
        // írj egy statikus fieldet popular néven
        static int popular;

        // írj egy konstruktort ami megnöveli a statikus fieldünket
     public Person(int popular) {
         this.popular = popular+1;

     }
     // írj egy metódust ami vissza adja a popular értékét
     public static int getPopular() {
         return popular;
     }
     // írj egy katasztrófa statikus metódust ami nulláza a populart
     public static int getDisaster(){
         return popular = 0;
     }

}
