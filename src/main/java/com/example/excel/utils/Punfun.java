package com.example.excel.utils;

/**
 * @Description:
 * @Date: 2019/1/9 15:13
 * @Author:jyj
 */
public class Punfun {

    public  String CreateMaxNo(String cNoType, String cNoLimit, int cNoLength) {
        try {
            //动态载入类
            String className = "com.sinosoft.lis.pubfun.SysMaxNo" +
                    SysConst.MAXNOTYPE;
            Class cc = Class.forName(className);
            SysMaxNo tSysMaxNo = (
                    SysMaxNo) (cc.newInstance());
            return tSysMaxNo.CreateMaxNo(cNoType, cNoLimit, cNoLength);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
