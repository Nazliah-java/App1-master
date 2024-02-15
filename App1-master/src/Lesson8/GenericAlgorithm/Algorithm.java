package lesson8.GenericAlgorithm;

public class Algorithm<T> {
    public void execute(T input){

    }

    public void sort(T[] array, Comparator<T> comparator){
        Arrays.sort(array, comparator);
    }
}
