package math;

import human.Human;

class Math {
    public int sum1toN(int number) {

        class Sum {
            public int calculateSum() {
                int result = 0;
                for (int i = 1; i <= number; i++) {
                    result += i;
                }
                return result;
            }
        }

        return new Sum().calculateSum();
    }


}

class MathTest {
    public static void main(String[] args) {
        System.out.println(new Math().sum1toN(4)); //1+2+3+4
    }
}