class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        long SN = (long)n * (n + 1) / 2;
        long S2N = (long)n * (n + 1) * (2L * n + 1) / 6;

        long S = 0, S2 = 0;

        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long)arr[i] * arr[i];
        }

        long val1 = S - SN;       // repeating - missing
        long val2 = S2 - S2N;

        val2 = val2 / val1;       // repeating + missing

        long repeating = (val1 + val2) / 2;
        long missing = repeating - val1;

        list.add((int)repeating);
        list.add((int)missing);

        return list;
    }
}
