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
}


public class Example1 {
    public static void main(String[] args) {
    Operations func = new Operations();
    func.add();
    func.add2(1,2,3);
    func.add1(1,2);
    func.add4(1,3.5f,3.4);
    System.out.println("Method Overloading Example Completed");
    
    }
}
