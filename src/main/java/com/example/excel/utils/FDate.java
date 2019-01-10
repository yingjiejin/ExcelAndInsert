/**
 * Copyright (c) 2002 sinosoft  Co. Ltd.
 * All right reserved.
 */
package com.example.excel.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * <p>Title: ���Ѽ����� </p>
 * <p>Description: ͨ������ı�����Ϣ��������Ϣ������������Ϣ����ȡ��Ϣ </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: sinosoft</p>
 * @author HST
 * @version 1.0
 * @date 2002-07-01
 */
public class FDate implements Cloneable {

    private final String pattern = "yyyy-MM-dd";
    private final String pattern1 = "yyyyMMdd";
    private SimpleDateFormat df;
    private SimpleDateFormat df1;

    // @Constructor
    public FDate() {
        df = new SimpleDateFormat(pattern);
        df1 = new SimpleDateFormat(pattern1);
    }

    /**
     * ��¡FDate����
     * 2005��04��15 ��������
     *
     * @return Object
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone()
            throws CloneNotSupportedException {
        FDate cloned = (FDate) super.clone();
        return cloned;
    }

    // @Method

    /**
     * ������ϸ�ʽҪ��������ַ����������������ͱ���
     * <p><b>Example: </b><p>
     * <p>getDate("2002-10-8") returns "Tue Oct 08 00:00:00 CST 2002"<p>
     *
     * @param dateString �����ַ���
     * @return �������ͱ���
     */
    public Date getDate(String dateString) {
        Date tDate = null;
        try {
            if (dateString.indexOf("-") != -1) {
                tDate = df.parse(dateString);
            } else {
                tDate = df1.parse(dateString);
            }
        } catch (Exception e) {
        }

        return tDate;
    }

    /**
     * �����������ͱ��������������ַ���
     * <p><b>Example: </b><p>
     * <p>getString("Tue Oct 08 00:00:00 CST 2002") returns "2002-10-8"<p>
     *
     * @param mDate �������ͱ���
     * @return �����ַ���
     */
    public String getString(Date mDate) {
        String tString = null;
        if (mDate != null) {
            tString = df.format(mDate);
        }
        return tString;
    }

    /**
     * MAIN������������
     *
     * @param args String[]
     */
    public static void main(String[] args) {
//        FDate tFDate = new FDate();
//        log.debug(tFDate.getDate("2002-10-8"));
    }
}
