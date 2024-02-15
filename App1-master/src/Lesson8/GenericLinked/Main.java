package lesson8.GenericLinked;

public class Main {
    public static void main(String[] args) {
        
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Integer List: " + intList.isEmpty());

        intList.remove(1);
        System.out.println("Integer List after removing 1: " + intList.isEmpty());

        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Siti");
        stringList.add("want");
        stringList.add("car");
        System.out.println("Integer List: " + stringList.isEmpty());

        stringList.remove("Siti");
        System.out.println("Integer List after removing Siti: " + stringList.isEmpty());

        GenericLinkedList<Character> charList = new GenericLinkedList<>();
        charList.add('A');
        charList.add('E');
        charList.add('O');
        System.out.println("Integer List: " + stringList.isEmpty());

        charList.remove('O');
        System.out.println("Integer List after removing Siti: " + charList.isEmpty());
        
    }
}
