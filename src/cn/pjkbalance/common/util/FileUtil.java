package cn.pjkbalance.common.util;

import cn.pjkbalance.common.constant.SystemEnum;
import com.sun.xml.internal.ws.util.StringUtils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiakang on 2018/5/11.
 */
public class FileUtil {
    private static String getWindowsPath(String... strs) {
        StringBuffer sb = new StringBuffer("");
        for (int index = 0; index < strs.length; index++) {
            sb.append(strs[index].trim());
            if (index < strs.length - 1)
                sb.append(File.separator);
        }
        String result = sb.toString();
        Print.print("FileUtil.getWindowsPath result: "+result);
        return result;
    }

    public static String getLinuxPath(String... strs) {
        StringBuffer sb = new StringBuffer("");
        for (int index = 0; index < strs.length; index++)
            sb.append(File.separator + strs[index].trim());
        String result = sb.toString();
        Print.print("FileUtil.getLinux result: "+result);
        return result;

    }

    public static String getPath(SystemEnum systemType, String... strs) {
        String path = "";
        if(strs.length <= 0) return path;
        switch (systemType) {
            case WINDOWS:
                path = getWindowsPath(strs);
                break;
            case LINUX:
                path = getLinuxPath(strs);
                break;
        }
        return path;
    }

    public static String[] getFileNames(String path) {
        File file = new File(path);
        String[] fileNames = file.list();
        return fileNames;
    }

    public static Map<String, String[]> getAllFileNames(String path) {
        Map<String, String[]> result = new HashMap<>();
        File file = new File(path);
        //获取目录下所有文件的名称
        result.put(path, file.list());
        //获取子文件，若子文件为目录，则获取子文件下的文件名
        File[] subFiles = file.listFiles();
        for (File subFile : subFiles) {
            if (subFile.isDirectory())
                result.putAll(getAllFileNames(subFile.getPath()));
        }
        return result;
    }
}
