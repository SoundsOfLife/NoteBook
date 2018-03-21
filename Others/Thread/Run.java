public class Run{
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread m1 = new MyThread(service);
        MyThread m2 = new MyThread(service);
        MyThread m3 = new MyThread(service);
        MyThread m4 = new MyThread(service);
        MyThread m5 = new MyThread(service);
        MyThread m6 = new MyThread(service);
        MyThread m7 = new MyThread(service);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
        m7.start();
    }
}