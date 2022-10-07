package com.driver;

public class Main {

    static class Product{
        public int product(int x, int y) {  return 0;}
        public int product(int x, int y, int z) { return 1;}
        public double product(double x, double y) {
            return 0.0;
        }

    }

    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.product(1, 2);
        int ans2 = p.product(1, 2, 3);
        double ans3 = p.product(1.2, 2.1);
    }
}