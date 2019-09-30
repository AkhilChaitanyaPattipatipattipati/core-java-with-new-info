package sharing;

public class MyTest {
    public static void main(String[] args) {
        MyService myService=new MyService ();
        new Thread(myService).start ();
        new Thread(myService).start ();
        new Thread(myService).start ();
        new Thread(myService).start ();
        new Thread(myService).start ();
    }
}
