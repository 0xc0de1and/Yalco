package sec01.chap01.ex08;

public class IntArrayInfo {
    int cnt;
    int max;
    int min;
    int sum;
    double average;

    IntArrayInfo(int arr[]){
        max = arr[0];
        min = arr[0];
        cnt = arr.length;

        for (int compare : arr){
            max = max > compare ? max : compare;
            min = min < compare ? min : compare;
            sum += compare;
        }

        average = 1.0 * sum / cnt;
    }

}
