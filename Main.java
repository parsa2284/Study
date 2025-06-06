import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 4, 3, 2));

        System.out.println("لیست اصلی: " + list);
        System.out.println("لیست بدون بیشترین مقدار: " + MyCollection.removeMax(new ArrayList<>(list)));
        System.out.println("آیا لیست مرتب است؟ " + MyCollection.isSorted(new ArrayList<>(Arrays.asList(5, 4, 3))));
        System.out.println("تکرار لیست ۳ بار: " + MyCollection.repeat(list, 3));
        System.out.println("آیا لیست قرینه است؟ " + MyCollection.isSymmetric(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1))));
        System.out.println("حذف عناصر تکراری: " + MyCollection.removeDuplicates(new ArrayList<>(list)));
        System.out.println("تعداد تکرار عدد 2: " + MyCollection.frequency(list, 2));
        System.out.println("تغییر زوج به فرد و بالعکس: " + MyCollection.change(new ArrayList<>(list)));
    }
}
