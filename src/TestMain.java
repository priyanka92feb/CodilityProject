import sun.awt.X11.XSystemTrayPeer;

public class TestMain {


    public static void main(String[] args) {
        /*ThreadContent threadContent = new ThreadContent();
        threadContent.run();*/
        ThreadContent threadContent = new ThreadContent();
        Thread thread = new Thread(threadContent);
        thread.start();
        ThreadContent threadContent1 = new ThreadContent();
        Thread thread1 = new Thread(threadContent1);
        thread1.start();

    }
}
