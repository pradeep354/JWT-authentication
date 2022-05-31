package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	//fake contact service
	
	List<Contact> list=List.of(
			new Contact(1L,"pradeep@gmail.com","pradeep",1311L),
			new Contact(2L,"amit@gmail.com","amit",1311L),
			new Contact(3L,"rahul@gmail.com","rahul",1312L),
			new Contact(4L,"jay@gmail.com","jay",1313L)
			
			);
	
	@Override
	public List<Contact> getContactsofUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

	

	

}
