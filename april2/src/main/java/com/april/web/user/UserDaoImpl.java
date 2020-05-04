package com.april.web.user;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.april.web.util.Data;
import com.april.web.util.Messenger;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public Messenger insert(User user) {	
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter(
							new File(Data.USER_PATH.toString()+Data.LIST+Data.CSV),true));
							writer.write(user.toString());
							writer.newLine();
							writer.flush();
	}catch(Exception e){
		System.out.println(Messenger.FILE_INSERT_ERROR);
	}
	return null;
	}


	@Override
	public List<User> selectAll() {
		List<User>list = null;
		try {
			
		}catch(Exception e){
			
		}return list;
	}

	@Override
	public Messenger selectOne(String userid) {
		try {
			
		}catch(Exception e){
			
		}
		return null;
	}

	@Override
	public void update() {
		try {
			
		}catch(Exception e){
			
		}
		
	}

	@Override
	public void delete() {
		try {
			
		}catch(Exception e){
			
		}
	}

}
