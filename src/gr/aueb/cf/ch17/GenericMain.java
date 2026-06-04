package gr.aueb.cf.ch17;

public class GenericMain {

    static void main() {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();
        var intNode = new GenericNode<Integer>();

        strNode.setValue("Hello");
        doubleNode.setValue(3.14);
        intNode.setValue(42);



        System.out.println(strNode.getValue()); // Hello
        System.out.println(doubleNode.getValue()); // 3.14
        System.out.println(intNode.getValue()); // 42
    }
}
