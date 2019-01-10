/**
 * Copyright (c) 2002 sinosoft  Co. Ltd.
 * All right reserved.
 */
package com.example.excel.utils;

/**
 ****************************************************************
 *               Program NAME: ϵͳ������
 *                 programmer: Ouyangsheng
 *                Create DATE: 2002.04.17
 *             Create address: Beijing
 *                Modify DATE:
 *             Modify address:
 *****************************************************************
 *
 *                    ����ϵͳ�еĳ�����
 *
 *****************************************************************
 */
public class SysConst
{
    /* ϵͳ��Ϣ */
    public static final int FAILURE = -1;
    public static final int SUCCESS = 0;
    public static final int NOTFOUND = 100;

    /* ϵͳ���� */
    public static final String EMPTY = null;
    public static final boolean CHANGECHARSET = false; // Unicode to GBK

    /* ��Ϣ�ָ��� */
    public static final String PACKAGESPILTER = "|";
    public static final String RECORDSPLITER = "^";
    public static final String ENDOFPARAMETER = "^";
    public static final String EQUAL = "=";
    public static final String CONTAIN = "*";

    /* ��ѯ��ʾ���� */
    public static final int MAXSCREENLINES = 10; //ÿһҳ�����ʾ������
    public static final int MAXMEMORYPAGES = 100; //�ڴ��д洢������ҳ��

    /* ������Ϣ */
    public static final String ZERONO = "00000000000000000000"; //����û�к�����ֶε�Ĭ��ֵ
    public static final String POOLINFO = "poolname";
    public static final String PARAMETERINFO = "parameterbuf";
    public static final String POOLTYPE = "pooltype";
    public static final String MAXSIZE = "maxsize";
    public static final String MINSIZE = "minsize";

    public static final String USERLOGPATH = "userlogpath";
    public static final String SYSLOGPATH = "syslogpath";

    public static final String COMP = "comp";
    public static final String ENCRYPT = "encrypt";
    public static final String MACFLAG = "macflag";
    public static final String SIGNFLAG = "signflag";
    public static final String SRC = "src";
    public static final String SND = "snd";
    public static final String RCV = "rcv";
    public static final String PRIOR = "prior";

    /* ���Ѽ�� */
    public static final String PayIntvMonth = "�½�";
    public static final String PayIntvQuarter = "����";
    public static final String PayIntvHalfYear = "���꽻";
    public static final String PayIntvYear = "�꽻";

    /*����������ͬ��*/
    public static final int Number = 5000;

    /*����ϵͳ���չ�˾����*/
    public static final String CorpCode = "000085";

    /**
     * һ�������
     * ��PubFun��AccountManage�м�����Ϣʱ�õ�
     */
    public static final String DAYSOFYEAR = "365";

    /*ϵͳ����������ͣ�SysMaxNoʵ����ĺ�׺����������ʵ����ΪSysMaxNoMinSheng*/
    public static final String MAXNOTYPE = "PENSION";

    /*���ݿ����ͣ�DB2��ORACLE��*/
//    public static final String DBTYPE = "DB2";
//    public static final String DBTYPE = "ORACLE";
    public static final String DBTYPE = "INFORMIX";

    //���������ݲ�ѯʱ��ʹ�õĻ�������С
    public static final int FETCHCOUNT = 5000;

    //�������γ���ɸѡ������ɸѡ���ͻ����еĸ������κ͸������θ���
    public static String GETDUTYGET = "GetDutyGetImpl";

    //�Զ�����ƥ��
    public static String AUTOCHOOSEDUTY = "AutoClaimDutyMapImpl";

}
