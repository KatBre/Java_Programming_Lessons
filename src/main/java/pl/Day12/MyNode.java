package pl.Day12;

public class MyNode {
    public Integer value;
    public MyNode nextNode;

    public MyNode(Integer value, MyNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
        System.out.println("New node value = " + value);
    }
}
