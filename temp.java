public class temp {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 9, 7, 7, 1, 4, 4, 7, 7 };

        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        int count[] = new int[maxElement + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }

    }
}