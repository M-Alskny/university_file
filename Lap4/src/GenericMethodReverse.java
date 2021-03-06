public class GenericMethodReverse {
    //this all array of all data type
    static Integer [] intArr ={1,11,19,115,51,4};
    static Double [] doubleArr ={1.3,1.4,0.5,3.2};
    static Character [] charArr ={'a','b','c','d','e'};
    static String [] strArr ={"ali","saeed","hamood"};
    static Float [] floatArr ={1.5f,4.8f,20.3f,2.4f};
    //generic method reverse the array
    public static <A> void GenericReverse(A[] array )
    {
        int x = array.length-1 ;
        for (int i = 0; i <array.length/2 ; i++) {
            A temp = array[i];
            array[i]=array[x];
            array[x]=temp;
            x--;
        }
    }
    //method print the array
    public static <a> void Print(a[] array)
    {
        System.out.print("[ ");
        for (int i = 0; i <array.length ; i++) {
            if(i<array.length-1)
                System.out.print(array[i]+"  ,  ");
            else
                System.out.println(array[i]+"  ]");
        }
    }
    // this main fanction
    public static void main(String[] args) {
        System.out.println("Integer Array ( Before_Reverse ) :");
        System.out.println("----------------------------------\n");
        Print(intArr);
        System.out.println("\nInteger Array ( After_Reverse ) :");
        System.out.println("----------------------------------\n");
        GenericReverse(intArr);
        Print(intArr);
        System.out.println("\n___________________________________________");



    }
}
