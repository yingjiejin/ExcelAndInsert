/**
 * Copyright (c) 2002 sinosoft  Co. Ltd.
 * All right reserved.
 */
package com.example.excel.utils;

/**
 * <p>Title: Webҵ��ϵͳ</p>
 * <p>Description: ϵͳ�������ӿ�</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Sinosoft</p>
 * @author Liuqiang
 * @version 1.0
 */

public interface SysMaxNo
{

    /**
     *<p>������ˮ�ŵĺ���<p>
     *<p>������򣺻�������  ������  У��λ   ����    ��ˮ��<p>
     *<p>          1-6     7-10   11     12-13   14-20<p>
     * @param cNoType Ϊ��Ҫ���ɺ��������
     * @param cNoLimit Ϊ��Ҫ���ɺ��������������Ҫô��SN��Ҫô�ǻ������룩
     * @param cNoLength ��ˮ�ŵĳ���
     * @return ���ɵķ�����������ˮ�ţ��������ʧ�ܣ����ؿ��ַ���""
     */
    public String CreateMaxNo(String cNoType, String cNoLimit, int cNoLength);
    public String CreateMaxNo(String cNoType, String cNoLimit);
}
