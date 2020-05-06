package com.april.web.lost;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.april.web.util.Data;
@Repository
public class LostDaoImpl implements LostDao {

	@Override
	public List<Lost> selectAll() {
		List<Lost>list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			File file = new File(Data.LOST_PATH+"lost_list.csv");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message  ="";
			while((message = reader.readLine())!= null) {
				temp.add(message);
			}

			reader.close();
		}catch(Exception e){
			System.out.println("파일 읽기에서 에러발생");
			
		}
		Lost l = null;
		for(int i=0;i<temp.size();i++) {
			l = new Lost();
			String[] arr = temp.get(i).split(",");
			l.setId(arr[0]);
			l.setName(arr[1]);
			l.setDate(arr[2]);
			l.setCategory(arr[3]);
			l.setLocation(arr[4]);
			list.add(l);
		}
		return list;
	}

	@Override
	public Lost selectOne(String id) {
		List<Lost> list = selectAll();
		Lost findLost = null;
		for(Lost l : list) {
			if(id.equals(l.getId())) {
				findLost = l;
				break;
			}
		}
		return findLost;
	}

}
