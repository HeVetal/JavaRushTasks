package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Solution)){
            return false;
        }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) && Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    //    public boolean equals(Object o) {
//        if (o == null) {
//            System.out.println("false");
//            return false;
//        }
//        if (!(o instanceof Solution)){
//            System.out.println("inst");
//            return false;
//        }
//
//        Solution n = (Solution) o;
//        return this.first == n.first.intern();// && this.last.equals(((Solution) o).last);
//    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
