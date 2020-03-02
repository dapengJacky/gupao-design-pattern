package gupao.prototype.deep;

import jdk.nashorn.internal.parser.JSONParser;
import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
@Data
public class ConcretePrototypeJsonParse implements Cloneable {

    private int age;

    private String name;

    private List<String> hobbies;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototypeJsonParse deepClone(){
        JSONParser parser
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
