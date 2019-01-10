package com.example.excel.service;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/9 10:43
 * @Author:jyj
 */
public interface IAnalysisAndInsertService {

    List<String[]> readExcel(String path, String fileType);

    void save(Object o);
}
