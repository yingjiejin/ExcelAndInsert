package com.example.excel.vo;

import com.example.excel.utils.FDate;

import java.util.Date;

/**
 * @Description: 文件组
 * @Date: 2019/1/9 13:33
 * @Author:jyj
 */
public class Tsdoctypegroupconfig {

    private FDate fDate = new FDate();

    /**
     * 文件配置序列号
     */
    private String DocTypeConfigSN;
    /**
     * 文件组id
     */
    private String FileGroupId;
    /**
     * 文件类型
     */
    private String DocType;
    /**
     * 是否必须
     */
    private String ForceFlag;
    /**
     * 节点编号
     */
    private String ActivityID;
    /**
     * 状态
     */
    private String State;
    /**
     * 归属机构
     */
    private String ManageCom;
    /**
     * 操作机构
     */
    private String OperateCom;
    /**
     * 操作员
     */
    private String Operator;
    /**
     * 入机日期
     */
    private Date MakeDate;
    /**
     * 入机时间
     */
    private String MakeTime;
    /**
     * 最后一次操作员
     */
    private String ModifyOperator;
    /**
     * 最后一次修改日期
     */
    private Date ModifyDate;
    /**
     * 最后一次修改时间
     */
    private String ModifyTime;
    /**
     * 备注
     */
    private String Remark;
    /**
     * 文件组别名
     */
    private String FileGroupAlias;
    /**
     * 业务子类型
     */
    private String GetBusiType;

    public void setDocTypeConfigSN(String docTypeConfigSN) {
        DocTypeConfigSN = docTypeConfigSN;
    }

    public void setFileGroupId(String fileGroupId) {
        FileGroupId = fileGroupId;
    }

    public void setDocType(String docType) {
        DocType = docType;
    }

    public void setForceFlag(String forceFlag) {
        ForceFlag = forceFlag;
    }

    public void setActivityID(String activityID) {
        ActivityID = activityID;
    }

    public void setState(String state) {
        State = state;
    }

    public void setManageCom(String manageCom) {
        ManageCom = manageCom;
    }

    public void setOperateCom(String operateCom) {
        OperateCom = operateCom;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public void setMakeTime(String makeTime) {
        MakeTime = makeTime;
    }

    public void setModifyOperator(String modifyOperator) {
        ModifyOperator = modifyOperator;
    }

    public void setModifyTime(String modifyTime) {
        ModifyTime = modifyTime;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public void setFileGroupAlias(String fileGroupAlias) {
        FileGroupAlias = fileGroupAlias;
    }

    public void setGetBusiType(String getBusiType) {
        GetBusiType = getBusiType;
    }

    public void setMakeDate(String aMakeDate) {
        if (aMakeDate != null && !aMakeDate.equals("")) {
            MakeDate = fDate.getDate(aMakeDate);
        } else {
            MakeDate = null;
        }
    }

    public void setModifyDate(String aModifyDate) {
        if (aModifyDate != null && !aModifyDate.equals("")) {
            ModifyDate = fDate.getDate(aModifyDate);
        } else {
            ModifyDate = null;
        }
    }
}
