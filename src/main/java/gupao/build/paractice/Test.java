package gupao.build.paractice;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/4
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        AbstractCourse course = builder.addHomework("设计模式的七大设计规则")
                .addNote("总结JDK和Cglib的区别")
                .addReview("作业评论区提问")
                .addVideo("录播视频稍候上传百度云盘")
                .build(PythonCourse.class);
        System.out.println(course);
    }
}
