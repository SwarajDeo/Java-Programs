package learnJava;

public class t31_MethodsInJava {
    static int logic(int x ,int y){     //Making a method/Function
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*(5);
        }
        return z;

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = logic(a,b);   // Method ko call kiya yaha par
        System.out.println(c);


    }


}
