class Solution {

    public int findPages(int[] arr, int k) {

        int n = arr.length;

        if (k > n) return -1;

        int low = arr[0];
        int high = 0;

        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int students = countStudents(arr, mid);

            if (students > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    int countStudents(int[] arr, int pages) {

        int students = 1;
        int pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }

        return students;
    }
}
