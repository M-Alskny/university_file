public class HI {
    int Int_arr[] = {12, 13, 14, 15, 16};
    double Double_arra[] = {1.0, 5.5, 1.6, 9.3};
    char Char_arr[] = {'d', 'r', 'p', 'l'};

    public static <T> void reverse(T arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            T temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
            n--;

        }
    }
    public static <T> void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }


    public static <T> void main(String[] args) {
        HI r1 = new HI();

    }
}