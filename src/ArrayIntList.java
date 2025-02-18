import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ArrayIntList implements IntList {

    private int size;
    private int [] buffer;
    public ArrayIntList(){
        size=0;
        buffer=new int[10];
    }
    /**
     * Prepends (inserts) the specified value at the front of the list (at index 0).
     * Shifts the value currently at the front of the list (if any) and any
     * subsequent values to the right.
     *
     * @param value value to be inserted
     */
    @Override
    public void addFront(int value) {
        //shift the present value to right
for(int i= size; i>0; i--){
    buffer[i]=buffer[i-1];
}
    //add new value at front
buffer[0]=value;
size++;
    }

    /**
     * Appends (inserts) the specified value at the back of the list (at index size()-1).
     *
     * @param value value to be inserted
     */
    @Override
    public void addBack(int value) {
        //add the value to the end of list
buffer[size]=value;
size++;
    }

    /**
     * Inserts the specified value at the specified position in this list.
     * Shifts the value currently at that position (if any) and any subsequent
     * values to the right.
     *
     * @param index index at which the specified value is to be inserted
     * @param value value to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public void add(int index, int value) {
if(index<0 || index>size){
    throw new NoSuchElementException("index out of range ");
}
//shift present elements to right to make space for new
for(int i = size; i>index; i--){
    buffer[i]= buffer[i-1];
}
buffer[index]=value;
size++;
    }

    /**
     * Removes the value located at the front of the list
     * (at index 0), if it is present.
     * Shifts any subsequent values to the left.
     */
    @Override
    public void removeFront() {
if(size==0){
    return; // empty list
}
//move to left ,remove front elemtns
for(int i = 0; i<size-1; i++){
    buffer[i]=buffer[i+1];
}
size--;
    }

    /**
     * Removes the value located at the back of the list
     * (at index size()-1), if it is present.
     */
    @Override
    public void removeBack() {
if(size==0){
    return;//list empty
}
size--;
    }

    /**
     * Removes the value at the specified position in this list.
     * Shifts any subsequent values to the left. Returns the value
     * that was removed from the list.
     *
     * @param index the index of the value to be removed
     * @return the value previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public int remove(int index) {
       if (index<0||index>=size){
           throw new IndexOutOfBoundsException("index out range");
       }
       int removedValue = buffer[index];
       for(int i=index; i<size-1; i++){
           buffer[i]=buffer[i+1];
       }
       size--;
       return removedValue;
    }

    /**
     * Returns the value at the specified position in the list.
     *
     * @param index index of the value to return
     * @return the value at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public int get(int index) {
       if(index<0|| index>= size){
           throw new IndexOutOfBoundsException("index i out of range");
       }
       return buffer[index];
    }

    /**
     * Returns true if this list contains the specified value.
     *
     * @param value value whose presence in this list is to be searched for
     * @return true if this list contains the specified value
     */
    @Override
    public boolean contains(int value) {
       for(int i=0; i <size; i++){
           if(buffer[i]== value){
               return true;
           }
       }
       return false;
    }

    /**
     * Returns the index of the first occurrence of the specified value
     * in this list, or -1 if this list does not contain the value.
     *
     * @param value value to search for
     * @return the index of the first occurrence of the specified value in this list
     * or -1 if this list does not contain the value
     */
    @Override
    public int indexOf(int value) {
        return 0;
    }

    /**
     * Returns true if this list contains no values.
     *
     * @return true if this list contains no values
     */
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    /**
     * Returns the number of values in this list.
     *
     * @return the number of values in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Removes all the values from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {
size=0;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}