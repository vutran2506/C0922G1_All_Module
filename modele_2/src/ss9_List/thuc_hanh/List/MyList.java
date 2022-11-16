package ss9_List.thuc_hanh.List;

import java.util.Arrays;

public class MyList <E>{
    private   int size =0;
    private static  final int sizeList=10;
    private Object elements [];
    public MyList(){
        elements = new Object[sizeList];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements ,newSize);
    }
    public  void  add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++]= e;
    }
    public E get (int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index "+i+ " Size "+i);
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        MyList<Integer> list =new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//
//        System.out.println("element 4: "+list.get(6));
        System.out.println("element 1: "+list.get(1));
        System.out.println("element 2: "+list.get(2));

        System.out.println("element 3 : "+list.get(3));
    }
}
