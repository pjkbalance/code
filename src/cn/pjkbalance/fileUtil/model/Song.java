package cn.pjkbalance.fileUtil.model;

/**
 * Created by jiakang on 2018/5/11.
 */
public class Song {
    private String name;
    private String singger;
    private String type;

    public Song(String name, String singger, String type) {
        this.name = name.trim();
        this.singger = singger.trim();
        this.type = type.trim().toLowerCase();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingger() {
        return singger;
    }

    public void setSingger(String singger) {
        this.singger = singger;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", singger='" + singger + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String toFileName() {
        return name+" - "+singger+"."+type;
    }

    public String toFileName(String splitChar) {
        return name+splitChar+singger+"."+type;
    }
}
