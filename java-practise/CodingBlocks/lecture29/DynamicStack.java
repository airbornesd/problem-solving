package lecture29;

import lecture28.Stack;

public class DynamicStack extends Stack {
    @Override
    public void push(int item) throws Exception {
        if (isFull()) {
            int[] arrNew = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        super.push(item); // recursive call
        // 'super' call parent class function
    }
}
