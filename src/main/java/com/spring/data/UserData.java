package com.spring.data;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.domain.User;

@Component
public interface UserData {
	
	List<User> parceUserMainInfo(String fileName);

}
