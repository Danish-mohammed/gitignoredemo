
class Test{
    public void add(){
        System.out.println("Adding 2 number");
    }

    public void acceptName(){
        System.out.println("Accepting user name");
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder problem");
        Test test=new Test();
        test.add();
        test.acceptName();
    }
}
