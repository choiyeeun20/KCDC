package com.april.web.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.april.web.util.Messenger;
@Component
public interface UserDao {

	public Messenger insert(User user);

	public List<User> selectAll();

	public User selectOne(String userid);

	public void update();

	public void delete();

}
