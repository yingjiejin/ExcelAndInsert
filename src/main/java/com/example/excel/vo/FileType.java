package com.example.excel.vo;

/**
 * @Description:
 * @Date: 2019/1/9 13:37
 * @Author:jyj
 */
public enum FileType {

    DOCTYPEGROUPCONFIG("DOCTYPE", "文件组配置"),
    AUTOSENDCONFIG("AUTOSEND", "自动发送配置");


    private String type;
    private String description;


    FileType(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
