/*
 * 文件名：Sender.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Sender.java
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
public interface Sender
{
    /**
     * 邮件类型
     */
    public static final String SENDER_MAIL = "mail";
    
    /**
     * SMS类型
     */
    public static final String SENDER_SMS = "sms";
    
    /**
     * 定义工厂放法  发送消息
     */
    void send();
    
    /**
     * 获取发送类型。
     * 
     * @return 发送类型
     */
    String getType();
}
