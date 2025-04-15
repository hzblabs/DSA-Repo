//Question
// Design a dynamic array class that supports the following operations:
// 1. add(Object data): Adds an element to the end of the array.
// 2. remove(Object data): Removes the first occurrence of the specified element from the array.
// 3. search(Object data): Returns the index of the first occurrence of the specified element, or -1 if not found.
// 4. insert(int index, Object data): Inserts the specified element at the specified index, shifting elements to the right if necessary.
// 5. grow(): Doubles the size of the array when it reaches its capacity.
// 6. shrink(): Halves the size of the array when it is less than a quarter full.
// 7. get(int index): Returns the element at the specified index.
// 8. size(): Returns the number of elements in the array.
// 9. capacity(): Returns the current capacity of the array.
// 10. isEmpty(): Returns true if the array is empty, false otherwise.
// 11. clear(): Clears the array, resetting its size to 0.


public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] arr;

    public DynamicArray() {
        this.arr = new Object[capacity];    
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];   
    }

    public Object get(int index) {
        return arr[index];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        arr[size] = data;
        size++;
    }

    public void remove(Object data) {

    }
    
    public Object search(Object data) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public void insert(int index, Object data)
    {
            if(size>=capacity){
                grow();
            }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = data;
        size++;
    }

    public void grow() {
        int newcapacity = (int) (capacity * 2);
        Object[] newarr = new Object[newcapacity];

        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        capacity = newcapacity;
        arr = newarr;
    }
    
    public void shrink() {
        int newcapacity = (int) (capacity / 2);
        Object[] newarr = new Object[newcapacity];

        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        capacity = newcapacity;
        arr = newarr;
    }
    
    public boolean isEmpty() {
        if (size <= 0) {
            return true;
        }
        return false;
    }

    public int Clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        return size = 0;
    }
}

// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         DynamicArray array = new DynamicArray();
//         array.add(1);
//         array.add(2);
//         array.add(3);
//         array.add(4);
//         array.add(5);
//         array.insert(0, 6);
        

//         System.out.println("Size: " + array.size);
//         System.out.println("Capacity: " + array.capacity);
//         System.out.println("Search index: " + array.search(2));
//         System.out.println("Element of index: " + array.get(3));
//         System.out.println("Is array empty?: " + array.isEmpty());
//         // System.out.println("Clearing array: " + array.Clear());
//         System.out.println(Arrays.toString(array.arr));
        
//     }
    
// }
