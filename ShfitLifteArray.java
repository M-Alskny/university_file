public class ShfitLifteArray {

        static int [] a = {8,6,9,22,7,78,45};

        static public void Print()
        {
            System.out.print("[ ");
            for (int i = 0; i <a.length ; i++) {
                if(i<a.length-1)
                    System.out.print(a[i]+"  ,  ");
                else
                    System.out.println(a[i]+"  ]");
            }
        }

        static public void ShiftLeft()
        {
            int i ;
            for (i=0; i<a.length-1 ;i++)
            {
                a[i]=a[i+1];
            }
            a[a.length-1]=0;
        }

        public static void main(String[] args) {
            System.out.println("Before Shift_Left : ");
            Print();
            System.out.println("=====================");
            System.out.println("After Shift_Left  : ");
            ShiftLeft();
            Print();
        }

}
