public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("Tom");
        cat.setAge(2);
        System.out.println("My name is "+cat.getName()+" and I'm "+cat.getAge()+" years old");
    }
}