package com.nmuzychuk;

import java.util.Stack;

public final class TowerOfHanoi {
    private TowerOfHanoi() {
    }

    public static void solve(final Stack<Integer> source,
                             final Stack<Integer> extra,
                             final Stack<Integer> target) {
        move(source.size(), source, extra, target);
    }

    private static void move(final int n, final Stack<Integer> source,
                             final Stack<Integer> extra,
                             final Stack<Integer> target) {
        if (n == 1) {
            target.push(source.pop());
        } else {
            move(n - 1, source, target, extra);
            target.push(source.pop());
            move(n - 1, extra, source, target);
        }
    }
}
