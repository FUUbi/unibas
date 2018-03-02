public class InsertionSort {

  /**
   * Insertionsort algorithm for int arrays, sorting the input array in place.
   **/

  public static void sort(int[] array) {
    // Aufgabe 1 (a)

    for (int i = 1; i < array.length; i++) {
      int valueToInsert = array[i];
      int insertPosition = i;

      while (insertPosition > 0
          && valueToInsert < array[insertPosition - 1]) {

        array[insertPosition] = array[insertPosition - 1];
        insertPosition--;

      }
      array[insertPosition] = valueToInsert;
    }


  }

  static <T extends Comparable<T>> void sort(T[] array) {
    for (int i = 1; i < array.length; i++) {
      T valueToInsert = array[i];
      int insertPosition = i;

      while (insertPosition > 0
          && valueToInsert.compareTo(array[insertPosition - 1]) == -1) {

        array[insertPosition] = array[insertPosition - 1];
        insertPosition--;

      }

      array[insertPosition] = valueToInsert;
    }
  }
}
