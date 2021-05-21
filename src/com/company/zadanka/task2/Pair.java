package com.company.zadanka.task2;

public class Pair<L, R> {
    private L left;
    private R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getL() {
        return left;
    }

    public R getR() {
        return right;
    }
}
