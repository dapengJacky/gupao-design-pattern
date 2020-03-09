package gupao.composite.homework;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class Test {

    public static void main(String[] args) {
        Branch root = new Branch("根目录",1);

        Branch branch1 = new Branch("初中",2);
        Branch branch2 = new Branch("高中",2);
        Branch branch3 = new Branch("大学",2);

        Leaf leaf1 = new Leaf("初中语文");
        Leaf leaf2 = new Leaf("初中英语");
        Leaf leaf3 = new Leaf("高中数学");
        Leaf leaf4 = new Leaf("高等数学");

        branch1.addChild(leaf1);
        branch1.addChild(leaf2);
        branch2.addChild(leaf3);
        branch3.addChild(leaf4);

        root.addChild(branch1);
        root.addChild(branch2);
        root.addChild(branch3);

        root.show();
    }
}
