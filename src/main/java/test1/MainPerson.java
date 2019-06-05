package test1;

public class MainPerson {
    public static void main(String[] args) {
        try {
            Person person1 = new Person();
            person1.setFirstName("Ivan");
            person1.setLastName("Ivanov");
            person1.setAge(120);
            System.out.println("Все верно!");
        } catch (InvalidAgeExeption e) {
            e.printStackTrace();
        }
    }
}
