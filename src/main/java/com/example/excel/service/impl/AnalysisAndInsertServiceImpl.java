package com.example.excel.service.impl;

import com.example.excel.common.SaveTemplate;
import com.example.excel.service.IAnalysisAndInsertService;
import com.example.excel.vo.FileType;
import com.example.excel.vo.Tsdoctypegroupconfig;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/9 10:44
 * @Author:jyj
 */
@Service
public class AnalysisAndInsertServiceImpl implements IAnalysisAndInsertService {
    @Override
    public List<String[]> readExcel(String path, String fileType) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        List list = new ArrayList();
        try {
            Tsdoctypegroupconfig tsdoctypegroupconfig = null;
            File excelFile = new File(path);
            FileInputStream fis = new FileInputStream(excelFile);
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis);
            //循环excel中sheet
            for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
                HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
                if (hssfSheet == null) {
                    continue;
                }
                // 循环每一行
                for (int rowNum = 0; rowNum < hssfSheet.getLastRowNum(); rowNum++) {
                    HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow != null) {
                        SaveTemplate saveTemplate = new SaveTemplate();
                        if (FileType.DOCTYPEGROUPCONFIG.getType().equals(fileType)) {
                            list = saveTemplate.doctypeTemplate(hssfRow);
                        } else if (FileType.AUTOSENDCONFIG.getType().equals(fileType)) {
                            //todo
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Object o) {

    }

}
