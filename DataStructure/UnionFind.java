public class UnionFind{
    private int capacity = 16;
    private int[] data;

    public UnionFind(){
        data = new int[capacity];
        for(int i = 0;i < capacity;i++){
            data[i] = -1;
        }
    }

    public UnionFind(int capacity){
        data = new int[capacity];
        for(int i = 0;i < capacity;i++){
            data[i] = -1;
        }
    }

    public int find(int x){
        if(data[x] < 0){
            return x;
        }else{
            data[x] = find(data[x]);
            return data[x];
        }
    }

    public void union(int x1,int x2){
        if(find(x1) != find(x2)){
            if(data[x1] < data[x2]){
                data[x2] = x1;
            }else{
                if(data[x1] == data[x2]){
                    data[x2] -= 1;
                }
                data[x1] = x2; 
            }
        }
    }
}