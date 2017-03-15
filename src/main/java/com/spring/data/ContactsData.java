package com.spring.data;

import java.util.Set;

import com.spring.domain.Contacts;

public interface ContactsData {
	Set<Contacts> parceContactInfo(String fileName);
}
