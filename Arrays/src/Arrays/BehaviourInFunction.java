package Arrays;

import java.util.Arrays;

public class BehaviourInFunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr1={"amish","ashish","ritesh","suraj","rajesh"};
        changeString(arr1);
        System.out.println(Arrays.toString(arr1 ));
    }

    static void change(int[] arr){
        arr[4]=90;
    }

    static void changeString(String[] arr){
        arr[2]="Anijesh";
    }
}
