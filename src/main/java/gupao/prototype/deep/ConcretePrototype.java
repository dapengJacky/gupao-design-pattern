package gupao.prototype.deep;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
@Data
public class ConcretePrototype implements Cloneable, Serializable {

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

    public ConcretePrototype deepClone(){
        try {
            ObjectInputStream ois = serialDeepClone(this);
            return (ConcretePrototype)ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static ObjectInputStream serialDeepClone(Object obj) throws IOException {
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        return new ObjectInputStream(bis);
    }

    public ConcretePrototype jsonClone(){
        ConcretePrototype prototype=this;
        ConcretePrototype cloneObj = JSON.toJavaObject((JSON) JSONObject.toJSON(prototype), ConcretePrototype.class);
        return cloneObj;
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
