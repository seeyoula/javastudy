/*
 * 文件名：TestMultiFactoryMethod.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestMultiFactoryMethod.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.factorymethod;

import junit.framework.Assert;

import org.junit.Test;

import com.study.java.design.patten.factorymethod.MultiFactoryMethod;
import com.study.java.design.patten.factorymethod.Sender;

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
public class TestMultiFactoryMethod
{
    @Test
    public void test_MultiFactoryMethod_001()
    {
        MultiFactoryMethod mfm = new MultiFactoryMethod();
        Sender sender = mfm.produceMailSender();
        
        Assert.assertEquals(Sender.SENDER_MAIL, sender.getType());
    }
    
    @Test
    public void test_MultiFactoryMethod_002()
    {
        MultiFactoryMethod mfm = new MultiFactoryMethod();
        Sender sender = mfm.produceSmsSender();
        
        Assert.assertEquals(Sender.SENDER_SMS, sender.getType());
    }
}
