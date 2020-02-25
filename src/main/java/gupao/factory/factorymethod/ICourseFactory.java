package gupao.factory.factorymethod;

import gupao.factory.simple.ICourse;

/**
 * 工厂方法模式顶层接口
 */
public interface ICourseFactory {

    ICourse create();
}
