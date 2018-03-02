public class MergeSort {

  /** Mergesort algorithm for int arrays. **/
  public static void sort(int[] array) {
    // Aufgabe 2 (c)
    // Bitte kommentieren Sie folgenden Code ein und ersetzen Sie jeweils ...
    // durch sinnvollen Code.
    /*
    int[] tmp = new int[array.length];
    sort(array, tmp, ..., ...);
    */
  }
  
  /** 
   * Sortiert das array zwischen Positionen lo und (einschliesslich) hi.
   **/
  private static void sort(int[] array, int[] tmp, int lo, int hi) {
    // Aufgabe 2 (c)
    // Bitte kommentieren Sie folgenden Code ein und ersetzen Sie jeweils ...
    // durch sinnvollen Code.
    /*
    if (...) {
      return;
    }
    int mid = ...;
    sort(array, tmp, ..., ...);
    sort(array, tmp, ..., ...);
    merge(array, tmp, ..., ..., ...);
    */
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
  }
}
