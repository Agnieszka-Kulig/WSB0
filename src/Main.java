public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.name = "Ryś";
        cat.age = 23;
        cat.weight = 9.0;
        cat.sex = "male";
        cat.isAlive = true;
        cat.breed = "British ShortHair";
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.weight);
        System.out.println(cat.sex);
        System.out.println(cat.isAlive);
        System.out.println(cat.breed);
    }

}
