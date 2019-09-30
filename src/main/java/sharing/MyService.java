package sharing;

public class MyService  implements  Runnable{
    public String get(){
        return "get Response";
    }

    public String post(){
        return "post Response";
    }

    @Override
    public void run() {
        System.out.println (Thread.currentThread ().getName () +":"+get ());
    }
}
