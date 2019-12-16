package com.zero.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.system.config.Server;

/**
 * 服务器监控
 *
 */
@Controller
@RequestMapping("/manager")
public class ServerController {

	/**
	 * 服务器监控首页
	 * 
	 * @throws Exception
	 **/
	  @GetMapping("/server")
	 public String server(ModelMap mmap) throws Exception
	    {
	        Server server = new Server();
	        server.copyTo();
	        mmap.put("server", server);
	        return "manager/server/server";
	    }
}
