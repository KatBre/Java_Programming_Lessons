package pl.Day12;

public class MyLinkedList {
    private MyNode startNode;

    public void add(Integer newValue) {
        if (startNode == null) {
            startNode = new MyNode(newValue, null);
        } else {
            MyNode currentNode = startNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new MyNode(newValue, null);
        }
    }

    public void printAll() {
        if (startNode == null) {
            System.out.print("No data");
        } else {
            System.out.print(startNode.value + " - ");
            MyNode currentNode = startNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
                if (currentNode.nextNode == null) {
                    System.out.println(currentNode.value);
                } else {
                    System.out.print(currentNode.value + " - ");
                }
            }
        }
    }
}
