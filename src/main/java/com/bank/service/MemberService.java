package com.bank.service;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bank.dto.MemberDTO;


public interface MemberService {
	
	public MemberDTO idCheck(String userid);
	public int memberAdd(MemberDTO dto);
	public MemberDTO login(Map<String, String> map);
	public MemberDTO mypage(String userid);

}
