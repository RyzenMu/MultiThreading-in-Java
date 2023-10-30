class Hi implements Runnable{
    public void run() {
        for(int i=1; i <= 5;i++) {
            System.out.println("Hi" + i);
            try {Thread.sleep(1500);} catch(Exception e){}
        }
    }
}

class Hello implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello" + i);
            try {Thread.sleep(1500);} catch(Exception e){}
        }
    }
}

public class multiThreading1 {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);
        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();
        
    }    
}
