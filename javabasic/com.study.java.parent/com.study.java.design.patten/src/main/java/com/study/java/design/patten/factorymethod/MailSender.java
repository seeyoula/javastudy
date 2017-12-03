/*
 * 文件名：MailSender.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： MailSender.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.factorymethod;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     Administrator
 * @version    SBS V001R001 2016年5月2日
 * @since      SBS V001R001C00
 */
public class MailSender implements Sender
{
    /** 
     * {@inheritDoc} 
     */
    public void send()
    {
        System.out.println("This is a Mail Sender.");
    }

    /** 
     * {@inheritDoc} 
     */
    public String getType()
    {
        return SENDER_MAIL;
    }
}
