public class BinarySearch {

    static int[] list ={2,4,6,8,10,45,56,78,89,95,99};

    static int binarySearch(int[] list, int key){
        int low;
        int high;
        low=0;
         high = list.length-1;

        int mid = (high+low)/2;
        if (key ==list[mid]){
            return mid;
        }
        if (key<list[mid]){
            high =mid-1;
            binarySearch(list,key);
        }else if (key>list[mid]){
            low =mid+1;
            binarySearch(list,key);
        }
            return -1;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
