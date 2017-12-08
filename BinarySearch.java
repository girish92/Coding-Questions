/*

VMWare Interview Round 2

Implement Binary Search
Implement Generic Binary Search (Java Generics)
Implement Node Class Declaration

*/

public class BinarySearch<T extends Comparable<T>> {
    private T[] data;

    public BinarySearch(T[] data) {
        this.data = data;
    }

    public int search(Comparable<T> key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = data[mid];
            
            int result = key.compareTo(midVal);

            if (result < 0) {
                high = mid - 1;
            }

            else if (result > 0) {
                low = mid + 1;
            } 

            else {
                return mid;
            }
        }
        return -1;
    }
}


public int binarySearch(int[] data, int size, int key){
    int low = 0;
    int high = size - 1;
    
    while(high >= low){
        int mid = (high + low) / 2;
        
        if(data[mid] == key){
            return mid;
        }
        
        if(data[mid] < key){
            low = mid + 1;
        }
        
        if(data[mid] > key){
            high = mid - 1;
        }
    }
    return -1;
}


class Node{
    
    int data;
    Node left;
    Node right;
    
    public Node(int num){
        data = num;
        Node left = null;
        Node right = null;
    }
}