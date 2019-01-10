package com.example.excel.controller;

import com.example.excel.service.IAnalysisAndInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/9 10:33
 * @Author:jyj
 */
@Controller
@RequestMapping("/excel")
public class ExcelController {

    @Autowired
    private IAnalysisAndInsertService iAnalysisAndInsertService;

    @RequestMapping("/analysisAndInsert")
    public String analysisAndInsert() {
        String rootpath = "E:\\test\\test.xls";
        String fileType = "test";
        List<String[]> excellist = iAnalysisAndInsertService.readExcel(rootpath, fileType);
        System.out.println(excellist.size());
        return null;
    }

}
