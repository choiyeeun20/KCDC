package com.april.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.april.web.util.Data;
import com.april.web.util.Messenger;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public Messenger insert(User user) {	
		try {
			
	}catch(Exception e){
	}
	return null;
	}


	@Override
	public List<User> selectAll() {
		List<User>list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			File file = new File(Data.ADMIN_PATH+"user_list.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while((message = reader.readLine())!= null) {
				temp.add(message);
			}
			reader.close();
		}catch(Exception e){
			System.out.println("파일 읽기에서 에러 발생");
			
		}
		User u = null;
		for(int i=0;i<temp.size();i++) {
			u = new User();
			String[] arr = temp.get(i).split(",");
			u.setUserid(arr[0]);
			u.setPasswd(arr[1]);
			u.setName(arr[2]);
			u.setSsn(arr[3]);
			u.setAddr(arr[4]);
			u.setProfile(arr[5]);
			u.setEmail(arr[6]);
			u.setPhoneNumber(arr[7]);
			u.setRegisterDate(arr[8]);
			list.add(u);
		}
		return list;
	}

	@Override
	public User selectOne(String userid) {
		List<User> list = selectAll() ;
		User findUser = null;
		for(User u : list) {
			if(userid.equals(u.getUserid())) {
				findUser = u;
				break;
			}
		}
		return findUser;
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
