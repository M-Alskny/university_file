public class RevresArray {


        static int [] arry = {12,13,14,15,16,87};

        static public void Print()
        {
            System.out.print("[ ");
            for (int i = 0; i < arry.length ; i++) {
                if(i< arry.length-1)
                    System.out.print(arry[i]+"  ,  ");
                else
                    System.out.println(arry[i]+"  ]");
            }
        }

        static public void Revers()
        {
            int x= arry.length-1;
            for (int i = 0; i < arry.length/2 ; i++) {
                int temp =arry[i];
                arry[i]=arry[x];
                arry[x] =temp;
                x--;
            }
        }

        public static void main(String[] args) {
            System.out.println("Before Revers :");
            Print();
            Revers();
            System.out.println("After Revers :");
            Print();
        }


}
