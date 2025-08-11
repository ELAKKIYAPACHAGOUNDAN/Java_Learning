class Operations{
    void add(){
        System.out.println(100+200);
    }
    void add1(int a, int b){
        System.out.println(a+b);
    }
    void add2(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add4(int a, float b, double c){
        System.out.println(a + b + c);
    }
    void add(int a){
        System.out.println("This is integer: "+a);
    }
    void add(float a){
        System.out.println("This is float: "+a);
    }
    void add(double a){
        System.out.println("This is double: "+a);
    }
}
public class Example1 {
    public static void main(String[] args) {
    Operations func = new Operations();
    System.out.println("NOTE: Method Overloading defines that multiple methods can have the same name with different parameters within the same class.");
    func.add();
    func.add2(1,2,3);
    func.add1(1,2);
    func.add4(1,3.5f,3.4);
    System.out.println("Method Overloading Example Completed");
    func.add(10);
    func.add(10.2f);
    func.add(10.5);
    }
}
