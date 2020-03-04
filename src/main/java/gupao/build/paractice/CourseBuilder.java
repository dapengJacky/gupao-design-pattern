package gupao.build.paractice;

import lombok.Data;
import org.apache.ibatis.cache.CacheException;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/4
 */
@Data
public class CourseBuilder {

    private String note;

    private String video;

    private String homework;

    private String review;

    private Class<? extends AbstractCourse> implementation;

    public CourseBuilder implementation(Class<? extends AbstractCourse> implementation) {
        this.implementation = implementation;
        return this;
    }

    public CourseBuilder addNote(String note){
        this.note = note;
        return this;
    }

    public CourseBuilder addVideo(String video){
        this.video = video;
        return this;
    }


    public CourseBuilder addHomework(String homework){
        this.homework = homework;
        return this;
    }


    public CourseBuilder addReview(String review){
        this.review = review;
        return this;
    }

    public AbstractCourse build(Class<? extends AbstractCourse> clazz){
        if(clazz ==null){
            this.setDefaultImplement();//JavaCourse
        }else{
            this.implementation=clazz;
        }
        AbstractCourse course=newBaseCourseInstance(this.implementation);
        this.setProperties(course);
        return course;
    }

    /**
     * 工厂模式
     * @param implementation
     * @return
     */
    private AbstractCourse newBaseCourseInstance(Class<? extends AbstractCourse> implementation) {
        try {
            Constructor<? extends AbstractCourse> constructor = implementation.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new CacheException("Invalid base cache implementation (" + implementation + ").  Base cache implementations must have a constructor that takes a String id as a parameter.");
        }
    }

    /**
     * 原型模式copy属性
     * @param course
     */
    private void setProperties(AbstractCourse course) {
        BeanUtils.copyProperties(this,course);//浅拷贝
    }

    /**
     * 设置默认实现类
     */
    private void setDefaultImplement() {
        if(this.implementation==null){
            this.implementation = JavaCourse.class;
        }
    }

    @Override
    public String toString() {
        return "CourseBuilder{" +
                "note='" + note + '\'' +
                ", video='" + video + '\'' +
                ", homework='" + homework + '\'' +
                ", review='" + review + '\'' +
                ", implementation=" + implementation +
                '}';
    }

}
