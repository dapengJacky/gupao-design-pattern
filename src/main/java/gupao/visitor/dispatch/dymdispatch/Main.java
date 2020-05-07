package gupao.visitor.dispatch.dymdispatch;

/**
 * Created by Tom.
 * 动态分派
 */
public class Main {
    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new WoMan();

        man.test();
        woman.test();
    }
}
