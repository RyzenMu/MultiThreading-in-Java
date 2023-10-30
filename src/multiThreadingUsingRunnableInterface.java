 class Hi extends Thread{
        public void run() {
            for(int i=1; i <= 5;i++) {
                System.out.println("Hi" + i);
                try {Thread.sleep(1500);} catch(Exception e){}
            }
        }
    }
    
    class Hello extends Thread{
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello" + i);
                try {Thread.sleep(1500);} catch(Exception e){}
            }
        }
    }




public class multiThreadingUsingRunnableInterface {
   
    
    
    public static void main(String[] args) {
            Hi hi = new Hi();
            Hello hello = new Hello();
          
            hi.start();
            try{Thread.sleep(1000);}catch(Exception e){}
            hello.start();
            
    }    
    
    
}
