package cn.pjkbalance.fileUtil.service;

import cn.pjkbalance.common.constant.SystemEnum;

/**
 * Created by jiakang.peng on 2018/5/12.
 */
public interface FileNameService {
    void formatName(SystemEnum system, String... pathStrs);
}
