import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        int[] array;
        array = new int[5];
        int length = array.length - 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        System.out.print("The elements in array: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }

        int index_del = 0;
        int x;
        do {
            System.out.println("What element you want to remove?");
            x = sc.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == x) {
                    index_del = i;
                }
            }
            if (array[index_del] != x) {
                System.out.println("Wrong! Please Re-enter");
            }
        } while (array[index_del] != x);

        for (int index = index_del; index < array.length -1 ; index++) {
            array[index] = array[index + 1];
        }
        System.out.println("Array remaining after deleting element " + x + " is: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}