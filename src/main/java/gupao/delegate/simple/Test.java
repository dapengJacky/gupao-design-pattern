package gupao.delegate.simple;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        new Boss().command("programming",new Leader());
        new Boss().command("crawl",new Leader());
        new Boss().command("drawing",new Leader());
    }
}
