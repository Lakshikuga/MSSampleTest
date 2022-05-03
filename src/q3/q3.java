package q3;

import java.util.Scanner;

public class q3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //char arr[] = new char[n];
        char arr[] = {'a', 'b', 'c', 'd'};
        //char arr[] = {};

       /* System.out.print("Enter the CHARACTERS in ur array!!!");
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(i);
        }*/
        System.out.println("Enter the start index");
        int start = sc.nextInt();

        int len = sc.nextInt();

        System.out.println(result(arr, start,len));
    }

    public static char[] result(char arr[], int start, int len) {
        char[] res = new char[len];

        if(start >= 0 && start < arr.length){
            if(len <= arr.length) {
                if(len+start <= arr.length) {
                    for (int i = start; i < len + start; i++) {
                        res[i - start] = arr[i];
                    }
                }
                //System.out.println(res);
                return res;
            }
            else
                System.out.println(res);
                return null;
        }
        else
            System.out.println(res);
            return null;

    }

}
