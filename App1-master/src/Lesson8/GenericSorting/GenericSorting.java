package lesson8.GenericSorting;

import java.util.Comparator;

public class GenericSorting<T> {
    public void sort(T[] array, Comparator<T> comparator) {
        quicksort(array, comparator, 0, array.length - 1);
    }

    // Quicksort algorithm implementation
    private void quicksort(T[] array, Comparator<T> comparator, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, comparator, low, high);
            quicksort(array, comparator, low, partitionIndex - 1);
            quicksort(array, comparator, partitionIndex + 1, high);
        }
    }

    private int partition(T[] array, Comparator<T> comparator, int low, int high) {
        T pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}