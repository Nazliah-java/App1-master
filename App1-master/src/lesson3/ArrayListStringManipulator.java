package lesson3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringManipulator {
    private ArrayList<String> arrayList;
    
    public ArrayListStringManipulator() {
        arrayList = new ArrayList<>();
}

// Method to add an element to the ArrayList
public void addElement(String element) {
    // controls
    arrayList.add(element);
}

// Method to remove an element by value from the ArrayList
public void removeElementByValue(String element) {
arrayList.remove(String.valueOf(element));  
}

// Method to remove an element by index from the ArrayList
public void removeElementByIndex(int element) {
arrayList.remove(element);        
}

public ArrayList<String> getArrayList(){
return arrayList;
}

// Method to search for an element in the ArrayList and return its index
// If the element is not found, return -1
public int searchElement(String element) {
return arrayList.indexOf(element);
}

//sort
public void sortList() {
Collections.sort(arrayList);
}

public static void main(String[] args) {
    ArrayListStringManipulator arrayListStringManipulator = new ArrayListStringManipulator();
    arrayListStringManipulator.addElement("s70");
    arrayListStringManipulator.addElement("y80");
    arrayListStringManipulator.addElement("a30");
    //System.out.println(arrayListManipulator.getArrayList().toString());

    // [90, 100, 150]
    //arrayListManipulator.removeElementByValue(90);
    // [100, 150]
    //arrayListManipulator.removeElementByIndex(1);
    // [100]

    //int ind = arrayListStringManipulator.searchElement(element:"y80");
    //System.out.println(ind);

   arrayListStringManipulator.sortList();
    System.out.println(arrayListStringManipulator.getArrayList().toString());
    
}

}
