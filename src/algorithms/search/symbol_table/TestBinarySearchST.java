package algorithms.search.symbol_table;


/**
 * Created by Yann.Xia on 2015/6/2.
 */
public class TestBinarySearchST {

    public static void main(String[] args) {
        BinarySearchST<Integer, Integer> binarySearchST = new BinarySearchST(20);

        for (int i = 0; i < 20; i++) {
            binarySearchST.put(i, i);
        }

        System.out.println("Size: " + binarySearchST.size());
        System.out.println("Min Key: " + binarySearchST.min());
        System.out.println("Max Key: " + binarySearchST.max());

        for (int i = 8; i < 12; i++) {
            binarySearchST.delete(i);
        }

        System.out.println("Size: " + binarySearchST.size());
        System.out.println("Min Key: " + binarySearchST.min());
        System.out.println("Max Key: " + binarySearchST.max());


        binarySearchST.delete(0);
        binarySearchST.delete(19);
        System.out.println("Size: " + binarySearchST.size());
        System.out.println("Min Key: " + binarySearchST.min());
        System.out.println("Min Value: " + binarySearchST.get(binarySearchST.min()));
        System.out.println("Max Key: " + binarySearchST.max());
        System.out.println("Max Value: " + binarySearchST.get(binarySearchST.max()));
        System.out.println("Max Key: " + binarySearchST.max());

        Iterable<Integer> integers = binarySearchST.keys();
        for(Integer integer : integers){
            System.out.print(integer + " ");
        }
    }

}
