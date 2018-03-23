/**
 * 生产者、消费者缓冲区
 */
public class Storage implements IStorage {

    private final int maxSize = 10;
    private Queue<Object> queue = new LinkedList<Object>();

    @Override
    public void put(Object obj) {
        synchronized (queue) {
            while (queue.size() > maxSize) {
                System.out.println("缓冲区已满，不能进入");
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            queue.add(obj);
            System.out.println("进入缓冲区");
            queue.notifyAll();
        }
    }

    @Override
    public Object get() {
        Object obj = null;
        synchronized (queue) {
            while (queue.size() <= 0) {
                System.out.println("缓冲区为空, 进入等待");
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            obj = queue.poll();
            System.out.println("离开缓冲区");
            queue.notifyAll();
        }

        return obj;
    }
}