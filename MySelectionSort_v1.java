public class MySelectionSort {

    public int[] sort(int[] arr) {

        final int SIZE = arr.length;

        for(int unsorted_first = 0; unsorted_first<SIZE-1;unsorted_first++) {
            int swap_with_index = unsorted_first;

            for(int curr_unsorted = unsorted_first+1;curr_unsorted<SIZE;curr_unsorted++) {
                if(arr[curr_unsorted]<arr[swap_with_index]) {
                    swap_with_index = curr_unsorted;
                }
            }
            swap(unsorted_first,swap_with_index,arr);
        }
        return arr;
    }

    private void swap(int unsorted_first, int swap_with_index,int[] arr) {
        int temp = arr[unsorted_first];
        arr[unsorted_first] = arr[swap_with_index];
        arr[swap_with_index] = temp;
    }
}
