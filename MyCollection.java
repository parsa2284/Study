import java.util.*;

public class MyCollection {

    public static ArrayList<Integer> removeMax(ArrayList<Integer> list) {
        if (list.isEmpty()) return list;
        int maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }
        list.remove(maxIndex);
        return list;
    }

    public static boolean isSorted(ArrayList<Integer> list) {
        if (list.size() < 2) return true;
        boolean ascending = true, descending = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) descending = false;
            if (list.get(i) < list.get(i - 1)) ascending = false;
        }
        return ascending || descending;
    }

    public static ArrayList<Integer> repeat(ArrayList<Integer> list, int num) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.addAll(list);
        }
        return result;
    }

    public static boolean isSymmetric(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list); // حفظ ترتیب
        return new ArrayList<>(set);
    }

    public static int frequency(ArrayList<Integer> list, Integer item) {
        int count = 0;
        for (Integer element : list) {
            if (element.equals(item)) count++;
        }
        return count;
    }

    public static ArrayList<Integer> change(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int r = list.get(i);
            if (r % 2 == 0) {
                list.set(i, r + 1);
            } else {
                list.set(i, r - 1);
            }
        }
        return list;
    }
}
