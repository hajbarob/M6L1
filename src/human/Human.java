package human;

public class Human {

    private String name;

    int age;

    public void sayHello() {
        Head head = new Head();
        head.sayHello();
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    class Head {

        String helloPart1 = "hello my name is ";

        static final String a = "";

        public void sayHello() {
            System.out.println(helloPart1 + name);
        }

    }
}
