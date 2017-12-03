/*
 * 文件名：NormalFactoryMethod.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： NormalFactoryMethod.java
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
public class NormalFactoryMethod
{
    /**
     *  生产发送消息实例 Sender。
     * 
     * @param type Sender类型
     * @return Sender实例
     */
    public Sender produceSender(String type)
    {
        if (Sender.SENDER_MAIL.equals(type))
        {
            return new MailSender();
        }
        else if (Sender.SENDER_SMS.equals(type))
        {
            return new SmsSender();
        }
        else
        {
            return new MailSender();
        }
    }
}
