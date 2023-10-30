
public class joinAndAlive {
    public static void main(String[] args) throws Exception{
       
        Thread t1 = new Thread(() ->
            {
                for(int i=1; i<=5; i++){
                    System.out.println("hi");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            });
        Thread t2 = new Thread(() ->  {
                for (int i=1; i<=5; i++) {
                    System.out.println("Hello");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            });
        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(t1.isAlive());
        t2.start();
        t1.join();
        t2.join();
        System.out.println("bye");
        System.out.println(t1.isAlive());
    }    
}
