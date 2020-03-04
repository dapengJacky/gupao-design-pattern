package gupao.build.paractice;

import lombok.Data;

@Data
public abstract class AbstractCourse {

    protected String note;

    protected String video;

    protected String homework;

    protected String review;

    @Override
    public String toString() {
        return "AbstractCourse{" +
                "note='" + note + '\'' +
                ", video='" + video + '\'' +
                ", homework='" + homework + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
