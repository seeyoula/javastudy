/*
 * 文件名：TestBuilder.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestBuilder.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.builder;

import junit.framework.Assert;

import org.junit.Test;

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
public class TestBuilder
{
    @Test
    public void test_Builder_001()
    {
        Builder builder = new Builder();
        builder.produceMailSenders(5);
        
        Assert.assertEquals(5, builder.getSenders().size());
        
        Builder builder1 = new Builder();
        builder1.produceSmsSenders(15);
        
        Assert.assertEquals(15, builder1.getSenders().size());
    }
}
