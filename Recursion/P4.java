public class P4 {
  public static int sum(int[] arr, int n, int i) {
    if (i == n) {
      return arr[n];
    } else {
      int s = arr[i] + sum(arr, n, i + 1);
      return s;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 92, 23, 15, -20, 10 };
    System.out.println("Sum : " + sum(arr, arr.length - 1, 0));
  }
}
