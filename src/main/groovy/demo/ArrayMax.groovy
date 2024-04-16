package demo

import groovy.transform.CompileStatic

@CompileStatic
class ArrayMax {
    static int max(int[] nums) {
        nums.max()
    }

    static int maxAbs(int[] nums) {
        nums.max((i, j) -> i.abs() <=> j.abs())
    }

    static int maxAbs2(int[] nums) {
        nums.maxComparing(Comparator.<Integer,Integer>comparing(n -> n.abs()))
    }
}
