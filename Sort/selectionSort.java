/**
 * 选择排序
 * @param arr
 * @return arr
 */
public static int[] selectionSort(int[] arr){
  for(int i = 0; i < arr.length; i++){
    int minIndex = i;
    for(int j = i + 1; j < arr.length;
