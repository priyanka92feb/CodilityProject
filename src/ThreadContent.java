import sun.misc.ThreadGroupUtils;

public class ThreadContent implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Content "
                + Thread.currentThread().getName()
                +" "
                + Thread.currentThread().getThreadGroup());
        interruptOtherThreadsFromGroup(Thread.currentThread().getThreadGroup());
        try {
            Thread.sleep(5000);

            System.out.println("After 5000 seconds - Thread Content "
                    + Thread.currentThread().getName()
                    +" "
                    + Thread.currentThread().getThreadGroup());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void interruptOtherThreadsFromGroup(ThreadGroup threadGroup) {
        threadGroup.list();
        threadGroup.interrupt();

    }
}
