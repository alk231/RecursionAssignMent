public class P3 {
  public static int maxElem(int[] arr, int i) {
    if (i == (arr.length - 1)) {
      return arr[arr.length - 1];
    }

    else {
      int maxVal = maxElem(arr, i + 1);
      return Math.max(arr[i], maxVal);
    }

  }

  public static void main(String[] args) {
    int arr[] = { 13, 1, -3, 22, 5 };
    System.out.println("MaxValue : " + maxElem(arr, 0));
  }
}
