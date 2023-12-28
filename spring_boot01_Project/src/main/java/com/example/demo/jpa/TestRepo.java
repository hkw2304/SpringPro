package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.vo.TestVo;

public interface TestRepo extends JpaRepository<TestVo, String>{

}
