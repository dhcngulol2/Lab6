package BaiTH6;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;
	
	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}
	public MyArrayList (int capacity) {
		this.elements = (E[]) new Object[capacity];
	}
	
	public void growSize() {
		int newSize = elements.length*2;
		E[] newElements = (E[]) new Object[newSize];
		
		for (int i =0 ; i< size;i++) {
			newElements[i]=elements[i];
			
	}
		elements = newElements;
	}
	public int size() {
		
		
		return size;
	}
	public boolean isEmpty() {
		
		return size==0;
		
	}
	public E get(int i) throws IndexOutOfBoundsException{
		
	
		return elements[i];
	}
	public E set(int i, E e) throws IndexOutOfBoundsException {
		E oldValue = elements[i];
		elements[i]=e;
		return oldValue;
	}
	public boolean add(E e) {
		if (size>=elements.length) {
			growSize();
		}
		elements[size]=e;
		size++;
		return true;
	}
	public E remove(int i) throws IndexOutOfBoundsException {
		E[] newElements = (E[]) new Object[elements.length];
		E OldElement = elements[i];
		int count = 0;
		
		for (int j =0 ; j<size ;j++) {
			if (j==i) {
				j++;
			}
			newElements[count]= elements[j];
			count ++;
			
		}
		this.size--;
		elements=newElements;
		return OldElement ;
	}
	public void clear() {
		elements = (E[]) new Object[DEFAULT_CAPACITY];
		size=0;
	}
	public int lastIndexOf (Object o ) {
		
		for (int i = size-1 ; i > 0 ; i --) {
			if (o==elements[i]) {
				return i; 
				 
			}
			
		}
		return -1;
	}
	public E[] toArray() {
	    E[] array = (E[]) new Object[size]; 
	    for (int i = 0; i < size; i++) {
	        array[i] = elements[i]; 
	    }
	    return array;
	}
	public MyArrayList<E> clone() {
		MyArrayList<E> newList = new MyArrayList<>(size);
		for (int i = 0; i < size; i++) {
	        newList.add(elements[i]);
	    }
		
		return newList;
	}
	public boolean contains(E e) {
		for(int o =0 ;  o < size-1; o++) {
			if (elements[o] == e ) {
				return true;
			}
		}
		
		return false;
	}
	public int IndexOf (Object o ) {
		
		for (int i = 0; i < size-1 ; i++) {
			if (o==elements[i]) {
				return i; 
				 
			}
			
		}
		return -1;
	}
	public boolean remove(E e) {
		int count = 0 ; 
		boolean check =false; 
		
		for (int i = 0; i < size-1 ; i++) {
			if(e != elements[i]) {
				elements[count]=elements[i];
				count++;
			}
			else{
				
				return check = true;
			}
		}
		for (int i = count  ; i < size ;i++ ) {
			elements[count] = null;
		}
		size = count ;
		return check;
	}
	public void sort(Comparator<E> c) {
		Arrays.sort(elements, 0,size, c);
	}

	
	


}
