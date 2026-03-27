import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {

        // Creating SortedSet using TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // 1. INSERTION
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);
        System.out.println("After Insertion: " + set);

        // 2. DELETION
        set.remove(20);
        System.out.println("After Deletion: " + set);

        // 3. UPDATE (remove + add)
        if (set.contains(40)) {
            set.remove(40);
            set.add(60);
        }
        System.out.println("After Update: " + set);

        // 4. SEARCHING
        if (set.contains(10)) {
            System.out.println("10 found in set");
        } else {
            System.out.println("10 not found");
        }

        // 5. TRAVERSAL

        // for-each loop
        System.out.println("Traversal (for-each):");
        for (int num : set) {
            System.out.println(num);
        }

        // lambda
        System.out.println("Traversal (lambda):");
        set.forEach(num -> System.out.println(num));
    }
}
