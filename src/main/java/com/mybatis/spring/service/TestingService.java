package com.mybatis.spring.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.spring.bean.Testing;
import com.mybatis.spring.mapper.MyMapper;

@Service
public class TestingService {
	@Autowired
	private MyMapper testingMapper;

	public void insert() {
		try {
			testingMapper.insert(new Testing("" + new Random().nextInt(), ""
					+ new Random().nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
