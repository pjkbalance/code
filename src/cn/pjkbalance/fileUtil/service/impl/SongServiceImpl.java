package cn.pjkbalance.fileUtil.service.impl;

import cn.pjkbalance.common.constant.SystemEnum;
import cn.pjkbalance.common.util.FileUtil;
import cn.pjkbalance.common.util.Print;
import cn.pjkbalance.fileUtil.model.Song;
import cn.pjkbalance.fileUtil.service.FileNameService;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jiakang.peng on 2018/5/12.
 */
public class SongServiceImpl implements FileNameService {
    private final static String splitChar = " - ";
    private final static String typeFlat = ".";
    private final static Set<String> singgerNameSet = new HashSet<String>() {
        {
            add("吴奇隆".toLowerCase());
            add("钟盛忠".toLowerCase());
            add("叶振棠".toLowerCase());
            add("黄宗泽".toLowerCase());
            add("黄家驹".toLowerCase());
            add("玄觞".toLowerCase());
            add("龚淑均".toLowerCase());
            add("龚玥".toLowerCase());
        }
    };
    private final static Set<String> typeSet = new HashSet<String>() {
        {
            add("flac".toLowerCase());
            add("mp3".toLowerCase());
            add("lrc".toLowerCase());
        }
    };

    @Override
    public void formatName(SystemEnum system, String... pathStrs) {
        String path = FileUtil.getPath(system, pathStrs);
        String transferFilePath = path+File.separator+"transfer";
        File transferFile = new File(transferFilePath);
        if (!transferFile.exists()) {
            transferFile.mkdir();
        } else if (!transferFile.isDirectory()) {
            Print.print("输出地址格式有误 ===>>> " + transferFilePath);
            return;
        }

        for (File subFile : new File(path).listFiles()) {
            Song song;
            String fileName = subFile.getName();
            if (subFile.isDirectory()) {
                Print.print("文件为文件夹==="+fileName);
                continue;
            }
            String type = fileName.substring(fileName.lastIndexOf(typeFlat)+typeFlat.length());
            if (type == null || type == "" || !typeSet.contains(type.toLowerCase())) {
                Print.print("文件类型有误==="+fileName);
                continue;
            }

            String[] nameArray = fileName.indexOf(splitChar) >= 0 ?
                    fileName.substring(0, fileName.lastIndexOf(typeFlat)).split(splitChar) :
                    fileName.substring(0, fileName.lastIndexOf(typeFlat)).split(splitChar.trim());
            if (nameArray.length == 2) {
                if (singgerNameSet.contains(nameArray[0])) {
                    song = new Song(nameArray[1], nameArray[0], type);
                } else if (singgerNameSet.contains(nameArray[1])) {
                    song = new Song(nameArray[0], nameArray[1], type);
                } else {
                    Print.print("未收录歌手===" + subFile.getName());
                    continue;
                }
            } else {
                Print.print("重命名失败===" + subFile.getName());
                continue;
            }
            Print.print(fileName + " ===>>> " + transferFilePath+File.separator+song.toFileName());
            //subFile.renameTo(new File(transferFilePath+File.separator+song.toFileName()));
        }
    }
}