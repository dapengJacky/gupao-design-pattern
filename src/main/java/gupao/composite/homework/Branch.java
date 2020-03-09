package gupao.composite.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class Branch extends Tree{
    private List<Tree> trees;

    private Integer level;

    public Branch(String name,Integer level) {
        super(name);
        this.level = level;
        this.trees = new ArrayList<Tree>();
    }

    @Override
    public void show() {
        System.out.println(this.name);

        for (Tree tree:trees){
            for(int  i = 0; i < this.level; i ++){
                //打印空格控制格式
                System.out.print("  ");
            }
            for(int  i = 0; i < this.level; i ++){
                //每一行开始打印一个+号
                if(i == 0){ System.out.print("+"); }
                System.out.print("-");
            }
            tree.show();
        }

    }

    public void addChild(Tree node){
        this.trees.add(node);
    }
}
