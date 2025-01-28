package secao12.Comparable;

import java.util.TreeSet;

public class ComparableTeste {
    //põe em ordem os números automaticamente
    public static void main(String[] args) {
        
    
    TreeSet<Integer> nums = new TreeSet<>();

    nums.add(10);
    nums.add(8);
    nums.add(4);
    nums.add(22);
    nums.add(6);    
    nums.add(3);

    for(Integer n: nums){
        System.out.println(n);
    }
    }
}
