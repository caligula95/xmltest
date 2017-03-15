package com.spring.data;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.domain.Address;
import com.spring.domain.User;
import com.spring.domain.Work;

@Component
public interface UserData {

	List<User> parceUserMainInfo(String fileName);

	List<com.spring.domain.Document> parceDocumentUserInfo(String fileName);

	List<Address> parceUserAddressInfo(String fileName);

	List<Work> parceUserWorkInfo(String fileName);

}
