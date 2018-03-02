public class MergeSort {

  /**
   * Mergesort algorithm for int arrays.
   **/
  public static void sort(int[] array) {
    // Aufgabe 2 (c)
    // Bitte kommentieren Sie folgenden Code ein und ersetzen Sie jeweils ...
    // durch sinnvollen Code.
    int[] tmp = new int[array.length];
    sort(array, tmp, 0, array.length - 1);
  }

  /**
   * Sortiert das array zwischen Positionen lo und (einschliesslich) hi.
   **/
  private static void sort(int[] array, int[] tmp, int lo, int hi) {
    // Aufgabe 2 (c)
    // Bitte kommentieren Sie folgenden Code ein und ersetzen Sie jeweils ...
    // durch sinnvollen Code.
    if (hi <= lo) {
      return;
    }

    int mid = lo + (hi - lo) / 2;
    sort(array, tmp, 0, mid);
    sort(array, tmp, mid + 1, hi);
    merge(array, tmp, lo, mid, hi);
  }

  /**
   * Die Methode kombiniert zwei bereits sortierte, benachbarte Teilbereiche des
   * Eingabearrays zu einer sortierten Folge.
   * Es wird angenommen, dass array[lo] bis array[mid] und array[mid + 1] bis
   * array[hi] bereits korrekt sortiert sind. Die sortierte Folge befindet sich
   * am Ende in array[lo] bis array[hi].
   **/
  private static void merge(int[] array, int[] tmp, int lo, int mid, int hi) {
    // Aufgabe 2 (b)
    // Sie dürfen annehmen, dass tmp die gleiche Grösse wie array hat. Verwenden
    // Sie das Array tmp, um Werte aus array zwischenzuspeichern.

    int leftSideIndex = lo;
    int rightSideIndex = mid + 1;

    for (int tempIndex = lo; tempIndex <= hi; tempIndex++) {



      if (rightSideIndex > hi
          || (leftSideIndex <= mid && array[leftSideIndex] <= array[rightSideIndex])) {

        tmp[tempIndex] = array[leftSideIndex];
        leftSideIndex++;

      } else {

        tmp[tempIndex] =  array[rightSideIndex];
        rightSideIndex++;
      }

    }

    for (int i = lo; i <= hi; i++) {
      array[i] = tmp[i];
    }
  }
}
