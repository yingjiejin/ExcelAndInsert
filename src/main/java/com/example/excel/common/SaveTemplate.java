package com.example.excel.common;

import com.example.excel.utils.DateUtil;
import com.example.excel.utils.Punfun;
import com.example.excel.vo.Tsdoctypegroupconfig;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2019/1/9 13:54
 * @Author:jyj
 */
public class SaveTemplate {

    /**
     * 文件组模板
     *
     * @param hssfRow
     * @return
     */
    public List<Tsdoctypegroupconfig> doctypeTemplate(HSSFRow hssfRow) {
        List<Tsdoctypegroupconfig> list = new ArrayList<Tsdoctypegroupconfig>();
        Tsdoctypegroupconfig tsdoctypegroupconfig = new Tsdoctypegroupconfig();
        HSSFCell filegroupid = hssfRow.getCell(0);
        HSSFCell filegroupAlias = hssfRow.getCell(1);
        HSSFCell getbusitype = hssfRow.getCell(2);
        HSSFCell doctype = hssfRow.getCell(3);

        Punfun punfun = new Punfun();
        String tDocTypeConfigSN = punfun.CreateMaxNo("DocTypeConfigSN", "SN", 14);
        tsdoctypegroupconfig.setDocTypeConfigSN(tDocTypeConfigSN);
        tsdoctypegroupconfig.setFileGroupId(getValue(filegroupid));
        tsdoctypegroupconfig.setDocType(getValue(doctype));
        tsdoctypegroupconfig.setForceFlag("Y");
        tsdoctypegroupconfig.setActivityID("6030000009");
        tsdoctypegroupconfig.setState("01");
        tsdoctypegroupconfig.setManageCom("000000");
        tsdoctypegroupconfig.setOperateCom("000000");
        tsdoctypegroupconfig.setOperator("batch");
        tsdoctypegroupconfig.setMakeDate(DateUtil.getCurrentDate());
        tsdoctypegroupconfig.setMakeTime(DateUtil.getCurrentTime());
        tsdoctypegroupconfig.setModifyOperator("batch");
        tsdoctypegroupconfig.setModifyDate(DateUtil.getCurrentDate());
        tsdoctypegroupconfig.setModifyTime(DateUtil.getCurrentTime());
        tsdoctypegroupconfig.setRemark("");
        tsdoctypegroupconfig.setFileGroupAlias(getValue(filegroupAlias));
        tsdoctypegroupconfig.setGetBusiType(getValue(getbusitype));
        list.add(tsdoctypegroupconfig);
        return list;
    }

    @SuppressWarnings("static-access")
    private String getValue(HSSFCell hssfCell) {
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            return String.valueOf(hssfCell.getNumericCellValue());
        } else {
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }


}
