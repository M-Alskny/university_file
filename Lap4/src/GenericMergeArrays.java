public class GenericMergeArrays {
    //two diffrint array
    static Integer [] intArr ={11,12,13,14,15,16};
    static Integer [] intArr2 ={17,18,19,20,21,22};
    //method merge tow arrays
    public static <A> A[] Merge(A[] array_1 , A[] array_2)
    {
        int temp=0;
        A[] New_Array = (A[]) new Object[array_1.length+array_2.length];
        for (int i = 0; i <New_Array.length ; i++) {
            if (i<array_1.length)
                New_Array[i]=array_1[i];
            else {
                New_Array[i] = array_2[temp];
                temp++;
            }
        }
        // the return the new array
        return New_Array;
    }
    // method print the array
    public static <A> void Print(A[] array)
    {
        System.out.print("[ ");
        for (int i = 0; i <array.length ; i++) {
            if(i<array.length-1)
                System.out.print(array[i]+"  ,  ");
            else
                System.out.println(array[i]+"  ]");
        }
    }
    // the main method
    public static void main(String[] args) {

        Print( Merge(intArr,intArr2));
    }
}
