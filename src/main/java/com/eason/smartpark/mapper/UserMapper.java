package com.eason.smartpark.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.eason.smartpark.bean.User;

@Repository
public interface UserMapper {
	User getManagerById(Integer id);

	public List<User> getUserList();

	public int add(User user);

	public int update(@Param("id") Integer id, @Param("user") User user);

	public int delete(Integer id);
	
	public User getUserByName(@Param("username") String username);
}
