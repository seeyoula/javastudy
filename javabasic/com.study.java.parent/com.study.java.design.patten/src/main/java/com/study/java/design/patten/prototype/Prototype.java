/*
 * 文件名：Prototype.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Prototype.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
public class Prototype implements Cloneable, Serializable
{
    /**
     * TODO 添加字段注释
     */
    private static final long serialVersionUID = 1L;
    
    private String string;
    
    private SerializableObject obj;
    
    /** 
     * 浅复制
     * {@inheritDoc} 
     */
    @Override
    public Object clone()
        throws CloneNotSupportedException
    {
        Prototype proto = (Prototype)super.clone();
        return proto;
    }
    
    /**
     * 深复制。
     * 
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone()
        throws IOException, ClassNotFoundException
    {
        //  写入当前对象的二进制流 
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        
        // 读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
    
    public String getString()
    {
        return string;
    }
    
    /**
     * 设置obj
     * 
     * @return 返回obj
     */
    public SerializableObject getObj()
    {
        return obj;
    }
    
    /**
     * 获取obj
     * 
     * @param obj 要设置的obj
     */
    public void setObj(SerializableObject obj)
    {
        this.obj = obj;
    }
    
    /**
     * 获取string
     * 
     * @param string 要设置的string
     */
    public void setString(String string)
    {
        this.string = string;
    }
}
