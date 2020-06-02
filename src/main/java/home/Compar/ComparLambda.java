package home.Compar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparLambda {

    public static void main(String... arg) throws Exception {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList <>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        Comparator<String[]> sortByLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        };

        Comparator<String[]> sortByWordsLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int length1 = 0;
                int length2 = 0;
                for (String s : o1) {
                    length1 += s.length();
                }
                for (String s : o2) {
                    length2 += s.length();
                }
                return length1 - length2;
            }
        };

        arrays.sort(sortByLength);
        System.out.println(arrays);

        for (int a =  arrays.size()-1;  a >=     0; a--) {
            for (int b =  arrays.get(a).length-1;  b >=0; b--)
            {
                System.out.print(arrays.get(a)[b]+" ");
            }
            System.out.println();
        }

    }
}
