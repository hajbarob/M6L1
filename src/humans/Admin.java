package humans;

public class Admin extends Human{

    int cabinetNumber;

    static {
        System.out.println("Admin static init block 1 ");
    }

    static {
        System.out.println("Admin static init block 2 ");
    }

    {
        System.out.println("Admin init block 1 ");
        cabinetNumber = 5;

    }

    {
        System.out.println("Admin init block 2 ");
    }

    boolean isRootAdmin;

    public Admin(String name, String secondName, boolean isRootAdmin) {
        super(name, secondName);

        isRootAdmin = isRootAdmin;

        System.out.println("Admin constructor ");
    }


    public Admin(String name, String secondName) {
        super(name, secondName);

        System.out.println("Admin constructor ");

        isRootAdmin = false;
    }


    public static void main(String[] args) {
        Admin admin = new Admin("Hola", "Joja");
    }
}
