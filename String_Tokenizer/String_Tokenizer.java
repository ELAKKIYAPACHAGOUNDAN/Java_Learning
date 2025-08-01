import java.util.StringTokenizer;

class String_Tokenizer {
    public static void main(String[] args) {
        System.out.println("String Tokenizer");
        System.out.println("------------------");
        //Spliting the words in a string using StringTokenizer and split method

        // Using StringTokenizer class

        // Method-1: Using hasMoreTokens() and nextToken()
        //using space as delimiter
        System.out.println("Method-1:");
        StringTokenizer token=new StringTokenizer("hello world java"," ");
        token.hasMoreTokens();
        System.out.println(token.nextToken());
        token.hasMoreTokens();
        System.out.println(token.nextToken());
        System.out.println();

        //using comma as delimiter
        StringTokenizer token_1= new StringTokenizer("This,is,too,beautiful",",");
        token_1.hasMoreTokens();
        System.out.println(token_1.nextToken());
        token_1.hasMoreTokens();
        System.out.println(token_1.nextToken());
        System.out.println("------------------");

        // Method-2: Using hasMoreTokens() in a while loop
        //using space as delimiter
        System.out.println("Method-2:");
        StringTokenizer token_2= new StringTokenizer("wow its an amazing day"," ");
        while(token_2.hasMoreTokens()){
            System.out.println(token_2.nextToken());
        }
        System.out.println();


        // Using split method
        String string="this is really amazing";
        String[] array = string.split(" ");
        for(String str : array) {
            System.out.println(str);
        }
        System.out.println("------------------");

        //Changing immutable string to mutable string
        String str = "This is WOW!"; // immutable string
        System.out.println("Immutable String: " + str);

        // To change it to mutable, we can use StringBuilder
        StringBuilder sb = new StringBuilder(str); // mutable string
        sb.append(" good"); // modifying the mutable string
        System.out.println("Mutable String: " + sb);
        System.out.println(sb.length()); // length of the mutable string
        System.out.println(sb.capacity()); // capacity of the mutable string


    }
}