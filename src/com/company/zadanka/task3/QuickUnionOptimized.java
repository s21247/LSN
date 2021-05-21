package com.company.zadanka.task3;

import java.util.stream.Stream;

public class QuickUnionOptimized {
    private int parent[];
    private int size[];

    private int count;


    public QuickUnionOptimized(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = i;
        }
    }

    public int count() {
        return count;
    }

        public int find(int element) {
            validate(element);
            int root = element;
            while(root != parent[root])
                root = parent[root];
            while(element != root) {
                int newParent = parent[element];
                parent[element] = root;
                element = newParent;
            }
            return root;
        }

        private void validate(int element) {
            int n = parent.length;
            if(element < 0 || element >= n)
                throw new IllegalArgumentException("index " + element + "is not between 0 and" + (n-1));
        }

        public boolean connected(int element, int element2) {
            return find(element) == find(element2);
        }

        public void union(int element,int element2) {
            int rootOfElement = find(element);
            int rootOfElement2 = find(element2);
            if(rootOfElement == rootOfElement2) return;
            if(size[rootOfElement] < size[rootOfElement2]) {
                parent[rootOfElement] = rootOfElement2;
                size[rootOfElement2] += size[rootOfElement];
            }else {
                parent[rootOfElement] = rootOfElement;
                size[rootOfElement] += size[rootOfElement2];
            }
            count --;
        }


}
