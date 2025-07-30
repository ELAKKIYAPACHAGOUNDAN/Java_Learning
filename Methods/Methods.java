
//Type1
class Type1 {
    void add() {
        System.out.println("No parameter, No return Value");
        int a = 10;
        int b = 15;
        int result = a + b;
        System.out.println(result);
    }
}

// Type2
class Type2 {
    void sub(int a, int b) {
        System.out.println("Parameter, No return Value");
        System.out.println(a - b);
    }
}

// Type3
class Type3 {

    int mul() {
        System.out.println("No parameter, return Value");
        int j = 1, i = 3;
        return i * j;
    }
}

// Type4
class Type4 {
    int divi(int a, int b) {
        System.out.println("parameter, return Value");
        return a / b;
    }
}

class Methods {
    public static void main(String[] args) {

        Type1 d1 = new Type1();
        d1.add();

        Type2 d2 = new Type2();
        d2.sub(3, 1);

        Type3 d3 = new Type3();
        // d3.mul();
        int result = d3.mul();
        System.out.println(result);

        Type4 d4 = new Type4();
        // d4.divi(100,5);
        int result1 = d4.divi(100, 5);
        System.out.println(result1);

    }
}