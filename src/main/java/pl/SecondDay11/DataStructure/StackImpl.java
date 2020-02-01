package pl.SecondDay11.DataStructure;

public class StackImpl implements StackInterface {

    private Object[] stackData = new Object[10];
    private int currentFreeIndex = 0;

    @Override
    public Object pop() {
        Object p = stackData[currentFreeIndex - 1];
        stackData[currentFreeIndex - 1] = null;
        currentFreeIndex = currentFreeIndex - 1;
    return p;
}

    @Override
    public void push(Object o) {
        if (stackData[currentFreeIndex] == null) {
            stackData[currentFreeIndex] = o;
            currentFreeIndex++;
        }
        }


    @Override
    public Object peek() {
        return stackData[currentFreeIndex - 1];
    }

}
