package com.april.web.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.april.web.util.Messenger;
@Component
public interface UserDao {

	Messenger insert(User user);

	List<User> selectAll();

	Messenger selectOne(String userid);

	void update();

	void delete();

}
