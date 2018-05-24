package cn.pjkbalance.fileUtil;

import cn.pjkbalance.common.constant.SystemEnum;
import cn.pjkbalance.common.util.FileUtil;
import cn.pjkbalance.common.util.Print;
import cn.pjkbalance.fileUtil.service.FileNameService;
import cn.pjkbalance.fileUtil.service.impl.SongServiceImpl;
import cn.pjkbalance.fileUtil.service.impl.VideoServiceImpl;
import com.sun.javafx.scene.shape.PathUtils;

/**
 * Created by jiakang.peng on 2018/5/12.
 */
public class FileUtilTest {
    private final static SystemEnum system = SystemEnum.WINDOWS;
    //private final static String[] pathStrs = {"G:", "music", "music_bak"};
    //G:\music\music_bak
    private final static String[] pathStrs = {"G:", "music", "music_bak"};
    //private final static String[] pathStrs = {"Users", "jiakang.peng", "Music", "虾米音乐"};

    public static void main(String... args) {
        Print.print("begin");
//        FileNameService videoService = new VideoServiceImpl();
//        FileNameService songService = new SongServiceImpl();
//        songService.formatName(system, pathStrs);
        /*String[] paths = FileUtil.getFileNames(FileUtil.getPath(system, pathStrs));
        for(String path : paths) {
            String[] pathArray = {"Users", "jiakang.peng", "Movies", path};
            videoService.changeName(system, pathArray);
        }*/
    }
}