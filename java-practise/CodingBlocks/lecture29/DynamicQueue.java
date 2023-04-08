package lecture29;
import lecture28.Queue;


public class DynamicQueue extends Queue{
    @Override
    public void EnQueue(int item) {
        if(isFull()){
            int[] arrNew = new int[2*arr.length];
            for(int i =0; i < arr.length; i++) {
                int idx = (i + front) % arr.length;
                arrNew[i] = arr[idx];
            }
        }

        super.EnQueue(item);
    }
}

// incomplete