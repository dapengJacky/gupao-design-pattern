package gupao.template.course;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public abstract class AbstractCourse {

    public final void teachCourse(){
        //1.上传预习资料
        preResource();

        //2.直播
        liveTeach();
        //3.上传课后资料
        postResource();

        //4.课后作业
        postHomework();

        if(needCheck()){
            checkHomework();
        }

    }

    protected abstract void checkHomework();

    //钩子方法
    protected boolean needCheck(){
        return false;
    }

    protected void postHomework() {
        System.out.println("布置课后作业");
    }

    protected void liveTeach() {
        System.out.println("直播授课");
    }

    protected void postResource() {
        System.out.println("上传课后资料");
    }

    protected void preResource() {
        System.out.println("上传预习资料");
    }


}
