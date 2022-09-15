package com.flekdh.start;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlRepository {

	@Autowired
	@Resource(name="sqlSessionFactory")
	protected SqlSessionFactory sqlSessionFactory;
	

	@Autowired
	@Resource(name="sqlSessionTemplate")
	protected SqlSessionTemplate sqlSession;
	
}
