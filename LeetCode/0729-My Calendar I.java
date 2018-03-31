
class MyCalendar {

    ArrayList<List<Integer>> orders = null;

    public MyCalendar() {
        this.orders = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        List<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        boolean result = true;
        if (orders.size() == 0)
            orders.add(temp);
        else if (orders.size() == 1) {
            if (orders.get(0).get(0) >= end){
                orders.add(0,temp);
            }else if(orders.get(0).get(1) <= start){
                orders.add(temp);
            }else{
                result = false;
            }
        } else {
            if (orders.get(0).get(0) >= end) {
                orders.add(0, temp);
            } else if (orders.get(orders.size() - 1).get(1) <= start) {
                orders.add(temp);
            } else {
                int i = 0, j = orders.size() - 1;
                while (i < j) {
                    int mid = (i + j) / 2;
                    if (orders.get(mid).get(0) == start) {
                        result = false;
                        break;
                    }
                    if (orders.get(mid).get(0) > start) {
                        j = mid;
                    } else {
                        i = mid + 1;
                    }
                }
                if (orders.get(i).get(0) >= end && orders.get(i - 1).get(1) <= start) {
                    orders.add(i, temp);
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */