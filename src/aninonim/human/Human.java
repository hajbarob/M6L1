package aninonim.human;

class Human {
    private String name;

    public Human() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(getName());
    }

    public void printNameFactorial(int amount) {
        System.out.println(getName());
        amount--;
        if (amount == 0) {
            return;
        }
        printNameFactorial(amount);
    }

    public static long multiplyNumbers(int num) {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}

class HumanTest {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setName("Igor");
        human1.printName();

        //human1 = new Human();

        Human human = new Human() {

            public void printName() {
                human1.printName();
                System.out.println("Name is " + getName());
                printSecondName();
            }

            public void printSecondName(){
                System.out.println("second name");
            }
        };

        human.setName("Elon");

        human.printName(); //Name is Elon
        human1.printNameFactorial(3);

    }
}