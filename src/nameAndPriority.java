
public class nameAndPriority {
    public static void main(String[] args) throws Exception{
       
        Thread t1 = new Thread(() ->
            {
                for(int i=1; i<=5; i++){
                    System.out.println("hi" + Thread.currentThread().getPriority());
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            }, "hi Thread");
        Thread t2 = new Thread(() ->  {
                for (int i=1; i<=5; i++) {
                    System.out.println("Hello");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            });
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setName("Thtread hi");
        t2.setName("Thread Hello");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(1);
        t2.setPriority(10);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
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
