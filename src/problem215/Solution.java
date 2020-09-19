package problem215;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        heapify(nums, n);

        for (int i = 0; i < k - 1; i++) {
            swap(nums, 0, n - i - 1);
            heapify(nums, n - i - 1);
        }
        return nums[0];
    }

    void heapify(int[] array, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            sink(array, n, i);
        }
    }

    void sink(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[i]) {
            largest = left;
        }
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(array, largest, i);
            sink(array, n, largest);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
