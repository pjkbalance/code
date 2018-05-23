package cn.pjkbalance.fileUtil.model;

/**
 * Created by jiakang.peng on 2018/5/12.
 */
public class Video {
    public Video(String name, String season, String episode, String type) {
        this.name = name;
        this.season = season;
        this.episode = episode;
        this.type = type;
    }

    private String name;
    private String season;
    private String episode;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", season='" + season + '\'' +
                ", episode='" + episode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String toFileName() {
        return name+".S"+season+"E"+episode+"."+type;
    }
}
