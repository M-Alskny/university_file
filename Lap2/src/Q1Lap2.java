import java.util.Arrays;

public class Q1Lap2 {
    int array []={22,33,44,55,66};

    public void print (){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i<array.length-1)
            System.out.print(",");
        }
        System.out.print("]" +"\n");

    }
    public void reverse (){
        int n =array.length-1;
        for (int i = 0; i < array.length/2; i++) {
           int temp =array[i];
           array[i]=array[n];
            array[n]=temp;
           n--;


        }
    }
    public void BackupArray (){
        int size =array.length;
        int NewArray []= new int[size];
        for (int i = 0; i < array.length; i++) {
            NewArray[i] =array[i];

        }
        System.out.println(Arrays.toString(NewArray));
    }
    public void removeArray(){
        for (int i = 0; i < array.length; i++) {
            array[i]=0;

        }
    }

}
