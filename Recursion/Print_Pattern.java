//Question Link:
"https://practice.geeksforgeeks.org/problems/print-pattern3549/1?page=2&category[]=Recursion&sortBy=submissions"


class Solution{
 static List<Integer> pattern(int N) {
        List<Integer> list = new ArrayList<>();
        addPattern(list, N);
        return list;
    }

    static void addPattern(List<Integer> list, int N) {
        if (N <= 0) {
            list.add(N);
            return;
        }
        list.add(N);
        addPattern(list, N - 5);
        if (N != 0) {
            list.add(N);
        }
    }

}
