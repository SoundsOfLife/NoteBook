public class SingleObject{
    private volatile static SingleObject singleOne;
    public SingleObject(){

    }
    public  SingleObject getInstance(){
        try{
            if(singleOne == null){
                // TODO
                synchronized(SingleObject.class){
                    if(singleOne == null)
                        singleOne = new SingleObject();
                }
            }else{

            }
            
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        retunr singleOne;
    }

}