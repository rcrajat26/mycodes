public class MyBubbleSort implements Sort{
    @Override
    public int[] sort(int[] arr) {

        int n = arr.length;
        for(int itr = 0;itr<n-1;itr++) {

            for(int heavy = 0; heavy < n-1-itr; heavy++) {
                if(arr[heavy+1]<arr[heavy]) {
                    int temp = arr[heavy];
                    arr[heavy] = arr[heavy+1];
                    arr[heavy+1] = temp;
                }
            }
        }
        return arr;
    }
}
