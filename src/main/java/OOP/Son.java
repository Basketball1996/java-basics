package OOP;

public class Son extends Parent{

    private static String str = "小明";

    public Son(){
        System.out.println("这是子类的构造方法");
    }

    public static void main(String[] args) {

        Son son = new Son();
        son.mainMethod();
        son.print();


    }
    public void mainMethod(){
       String str =  "小红";
       System.out.println(this.str);
    }
    public void print(){
        System.out.println("这是子类的print方法");
    }
}
