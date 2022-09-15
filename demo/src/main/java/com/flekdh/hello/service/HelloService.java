package com.flekdh.hello.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flekdh.hello.mapper.HelloMapper;

@Service
public class HelloService {

	@Autowired
	HelloMapper helloMapper;
	
	public List<Map<String, Object>> selectUserList(){
		return helloMapper.selectUserList();
	}
}
