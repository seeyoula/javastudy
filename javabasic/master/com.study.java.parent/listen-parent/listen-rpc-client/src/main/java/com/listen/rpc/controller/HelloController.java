package com.listen.rpc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.listen.rpc.client.RpcProxy;
import com.listen.rpc.entity.User;
import com.listen.rpc.service.IHelloService;

@Controller
public class HelloController {

	@Autowired
	private RpcProxy rpcProxy;
	@RequestMapping("/hello")
	public void hello(String name){
		IHelloService service = rpcProxy.create(IHelloService.class);
		String result = service.hello(name);
		System.out.println(result);
	}
	
	@RequestMapping("/getUser")
	public void getUser(String name){
		IHelloService service = rpcProxy.create(IHelloService.class);
		System.out.println(service.getUser(name).toString());
	}
	
	@RequestMapping("/getUsers")
	public void getUsers(int size){
		IHelloService service = rpcProxy.create(IHelloService.class);
		List<User> list = service.getUsers(size);
		for(User user : list){
			System.out.println(user.toString());
		}
	}
	
	@RequestMapping("/updateUser")
	public void updateUser(String name){
		User user = new User(name, new Date(), true);
		IHelloService service = rpcProxy.create(IHelloService.class);
		user = service.updateUser(user);
		System.out.println(user.toString());
	}
}
