class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is Alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is Alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is Alive: " + nt3.t.isAlive());
        
        try {
            System.out.println("Waiting for threads to finish.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        
        System.out.println("Thread One is Alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is Alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is Alive: " + nt3.t.isAlive());
        
        System.out.println("Main Thread Exiting");
    }
}