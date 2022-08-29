
class Test{

    private int a;
    private  int b;

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void add(){
        System.out.println("Adding 2 number");
    }

    public void acceptName(){
        System.out.println("Accepting user name");
        int rand = (int) ((Math.random()*6)+1);
        System.out.println(rand);
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
