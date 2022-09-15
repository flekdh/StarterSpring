package com.flekdh.hello.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.flekdh.start.SqlRepository;

@Repository
public class HelloMapper extends SqlRepository{
	public List<Map<String, Object>> selectUserList(){
		return this.sqlSession.selectList("HelloMapper.selectUserList");
	}
}
