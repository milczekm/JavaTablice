package tablice;

import java.util.Arrays;

public class KonkatenacjaTablic {

    static int[] konkatenacja(int[] tab1, int[] tab2) {

        int[] tab3 = new int[tab1.length + tab2.length];

        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tab3[tab1.length + i] = tab2[i];
        }
        return tab3;
    }

    public static void main(String[] args) {

        int[] tab1 = {0, 1, 2, 3, 5, 5, 5, 5, 5, 5};
        int[] tab2 = {4, 5, 6, 7, 8};

        System.out.println("Polaczone tablice: " + Arrays.toString(konkatenacja(tab1, tab2)));

    }

}
