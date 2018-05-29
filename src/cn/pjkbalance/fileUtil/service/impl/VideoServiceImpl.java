package cn.pjkbalance.fileUtil.service.impl;

import cn.pjkbalance.common.constant.SystemEnum;
import cn.pjkbalance.common.util.FileUtil;
import cn.pjkbalance.common.util.Print;
import cn.pjkbalance.fileUtil.model.Video;
import cn.pjkbalance.fileUtil.service.FileNameService;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jiakang.peng on 2018/5/12.
 */
public class VideoServiceImpl implements FileNameService {
    private final static String seasonSplit = ".S";
    private final static String typeFlat = ".";
    private final static Set<String> typeSet = new HashSet<String>() {
        {
            add("mp4".toLowerCase());
            add("mkv".toLowerCase());
            add("ass".toLowerCase());
            add("rmvb".toLowerCase());
            add("str".toLowerCase());
        }
    };

    @Override
    public void formatName(SystemEnum system, String... pathStrs) {
        String path = FileUtil.getPath(system, pathStrs);
        Print.print("video change name: "+path);
        File file = new File(path);
        if (!file.isDirectory()) {
            Print.print("根文件需要是文件夹==="+path);
            return;
        }

        for (File subFile : new File(path).listFiles()) {
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
            int lastFileNameChar = fileName.lastIndexOf(seasonSplit);
            if (lastFileNameChar == -1) {
                Print.print("文件名格式有误==="+fileName);
                continue;
            }
            Video video = new Video(fileName.substring(0, lastFileNameChar),
                    fileName.substring(lastFileNameChar+seasonSplit.length(), lastFileNameChar+seasonSplit.length()+2),
                    fileName.substring(lastFileNameChar+seasonSplit.length()+3, lastFileNameChar+seasonSplit.length()+5),
                    type);
            if (video.toFileName().equalsIgnoreCase(fileName)) {
                Print.print(fileName + " ===>>> 无需转换");
            } else {
                Print.print(fileName + " ===>>> " + video.toFileName());
                subFile.renameTo(new File(subFile.getParent()+File.separator+video.toFileName()));
            }
        }
    }
}