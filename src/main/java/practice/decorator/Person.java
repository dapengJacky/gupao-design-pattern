package practice.decorator;

import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
@Data
public class Person {

    protected String name;


    protected String dress(){
        return this.name+"白衬衫，牛仔裤，板鞋";
    }

}
