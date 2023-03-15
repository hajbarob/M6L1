package humans;

public class Human {

    public static final String natureClass = "HUMAN";

    static {
        System.out.println("Human static init block 1 ");
    }

    {
        System.out.println("Human init block 1 ");
    }

    {
        System.out.println("Human init block 2 ");
        this.name = "AAA";
    }

    private String name;

    private String secondName;

    public Human(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;

        System.out.println("Human constructor ");
    }
}
