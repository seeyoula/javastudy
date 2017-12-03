/*
 * 文件名：RpcBootstrap.java
 * 版权：Copyright 2015-2017 SBS Tech. Co. Ltd. All Rights Reserved. 
 * 描述： RpcBootstrap.java
 * 修改人：Administrator
 * 修改时间：2017年7月30日
 * 修改内容：新增
 */
package com.listen.rpc.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
 * @version    SBS V001R001 2017年7月30日
 * @since      SBS V001R001C00
 */
public class RpcBootstrap
{
    public static void main(String[] args)
    {
        new ClassPathXmlApplicationContext("spring.xml");
    }
}
