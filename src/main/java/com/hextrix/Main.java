package com.hextrix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String christmasTree (int height) {
        StringBuilder tree = new StringBuilder();

        for (int i = 0; i < height; i++) {
            String indent = " ".repeat(Math.max(height - (i + 1), 0));
            String x = "X".repeat((i * 2) + 1);
            tree.append(indent);
            tree.append(x);
            tree.append("\n");
        }

        tree.append(height > 0 ? " ".repeat(height - 1) : "");
        tree.append("I");

        return tree.toString();
    }
}