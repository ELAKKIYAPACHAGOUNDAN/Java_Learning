class Ambiguity1{
    void ambi(int a, char b){
        System.out.println("method 1-> by default, int value has been taken.");
    }
    void ambi(byte a, char b){
        System.out.println("method 2");
    }
}
class Ambiguity2{
    void ambii(char a, byte b){
        System.out.println("method 1 from ambiguity 2");
    }
    void ambii(byte a, char b){
        System.out.println("method 2 from ambiguity 2");
    }
}
class Ambiguity3{
    void ambii(char a, byte b){
        System.out.println("method 1 from ambiguity 2");
    }
    void ambii(byte a, char b){
        System.out.println("method 2 from ambiguity 2");
    }
}
public class Example2 {
    public static void main(String[] args) {
        System.out.println("Ambiguity in Method Overloading Example");
        System.out.println("-------------------------------------------------");
        System.out.println("Implicit type conversion in method overloading");
        Ambiguity1 obj = new Ambiguity1();
        obj.ambi(100,'A');

        //causing ambiguity
        Ambiguity2 obj2 = new Ambiguity2();
        //obj2.ambii(10,'a'); -- This line will cause ambiguity error

        
        //After Type conversion
        Ambiguity3 obj3 = new Ambiguity3();
        obj3.ambii((byte)10,'a'); 


        /*NOTE:
        1) Scenario 1: void add(int a, char b) and void add(byte a, char b) ||
         method name-> same ||
         number of parameters-> same ||
         parameter types-> should be different || 
         Implicit type conversion is allowed in method overloading.
         ----
         byte and int are both numeric types, so the complier will take the integer number by default as int.
        
         "Ambibuity" means the compiler is confused about which method to call.
         */

}
    }
