
public class mutiThreadingUsingLamda {
    public static void main(String[] args) {
        Runnable hi = new Runnable() {
            public void run() {
                for(int i=1; i<=5; i++){
                    System.out.println("hi");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            }
        };
        Runnable hello = new Runnable() {
            public void run() {
                for (int i=1; i<=5; i++) {
                    System.out.println("Hello");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            }
        };
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);
        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();
    }    
}
