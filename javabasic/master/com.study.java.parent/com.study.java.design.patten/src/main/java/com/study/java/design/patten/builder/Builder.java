/*
 * 文件名：Builder.java
 * 版权：Copyright 2015-2016 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Builder.java
 * 修改人：Administrator
 * 修改时间：2016年5月2日
 * 修改内容：新增
 */
package com.study.java.design.patten.builder;

import java.util.ArrayList;
import java.util.List;

import com.study.java.design.patten.factorymethod.MailSender;
import com.study.java.design.patten.factorymethod.Sender;
import com.study.java.design.patten.factorymethod.SmsSender;

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
public class Builder
{
    private List<Sender> list = new ArrayList<Sender>();
    
    public void produceMailSenders(int count)
    {
        for (int i = 0; i < count; i++)
        {
            list.add(new MailSender());
        }
    }
    
    public void produceSmsSenders(int count)
    {
        for (int i = 0; i < count; i++)
        {
            list.add(new SmsSender());
        }
    }
    
    public List<Sender> getSenders()
    {
        return list;
    }
}
