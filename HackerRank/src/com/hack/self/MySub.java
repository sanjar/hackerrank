package com.hack.self;

 abstract class MyAbstract {
    int x = 3;
    public MyAbstract() {
        x *= 2;
        System.out.print("-x" + method(3));
    }
    abstract int method();
    abstract int method(int i);
}
 class MySuper extends MyAbstract {
    int x = 2;
    public MySuper() {
        System.out.print("-x" + method());
    }
    int method() {
        x++;
        return (x * 5 + super.x);
    }
    int method(int i) {
        return (method() + i);
    }
}
public class MySub extends MySuper {
    MySub() {
        x += 3;
        System.out.print("-x" + x);
    }
    int method() {
        return x + 5;
    }
    public static void main(String[] args) {
        MySub sub = new MySub();
        System.out.println();
        System.out.println(sub.x);
    }
}
