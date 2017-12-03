/*
 * 文件名：TestPrototype.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestPrototype.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.prototype;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import com.study.java.design.patten.prototype.Prototype;
import com.study.java.design.patten.prototype.SerializableObject;

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
public class TestPrototype
{
    @Test
    public void test_Prototype_001()
    {
        Prototype pt = new Prototype();
        pt.setString("hello");
        try
        {
            Prototype pt1 = (Prototype)pt.clone();
            Assert.assertEquals(pt1.getString(), pt.getString());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
    
    @Test
    public void test_Prototype_002()
    {
        Prototype pt = new Prototype();
        pt.setString("hello");
        
        SerializableObject obj = new SerializableObject();
        pt.setObj(obj);
        Prototype pt1;
        try
        {
            pt1 = (Prototype)pt.deepClone();
            
            Assert.assertEquals(pt1.getString(), pt.getString());
            Assert.assertFalse(pt1.getObj().equals(pt.getObj()));
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
