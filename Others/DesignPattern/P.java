import com.sun.beans.decoder.ValueObject;

public class P{
    private String lock;
    public P(String lock){
        super();
        this.lock = lock;
    }
    public void setValue(){
        try{
            synchronized(lock){
                if(!ValueObject.value.equlas("")){
                    
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}