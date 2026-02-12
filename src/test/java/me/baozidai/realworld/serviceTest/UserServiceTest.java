package me.baozidai.realworld.serviceTest;

import me.baozidai.realworld.model.RealworldUsers;
import me.baozidai.realworld.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testRegister() {
		String username = "testuser" + System.currentTimeMillis();
		String email = username + "@example.com";
		String password = "password123";
		RealworldUsers user = userService.register(username, email, password);
		Assertions.assertNotNull(user);
		Assertions.assertEquals(username, user.getUsername());
		Assertions.assertEquals(email, user.getEmail());
		Assertions.assertEquals(password, user.getPassword());
	}
	@Test
	public void testLogin() {
		String username = "loginuser" + System.currentTimeMillis();
		String email = username + "@example.com";
		String password = "password456";
		userService.register(username, email, password);
		RealworldUsers user = userService.login(username, password);
		Assertions.assertNotNull(user);
		Assertions.assertEquals(username, user.getUsername());
		Assertions.assertEquals(email, user.getEmail());
	}

	@Test
	public void testGetUsersByUsername() {
		String username = "queryuser" + System.currentTimeMillis();
		String email = username + "@example.com";
		String password = "password789";
		userService.register(username, email, password);
		RealworldUsers user = userService.getUsersByUsername(username);
		Assertions.assertNotNull(user);
		Assertions.assertEquals(username, user.getUsername());
		Assertions.assertEquals(email, user.getEmail());
	}
	@Test
	public void testGetUsersProfile() {
		String username = "profileuser" + System.currentTimeMillis();
		String email = username + "@example.com";
		String password = "password999";
		userService.register(username, email, password);
		RealworldUsers user = userService.getUsersProfile(username);
		Assertions.assertNotNull(user);
		Assertions.assertEquals(username, user.getUsername());
		Assertions.assertEquals(email, user.getEmail());
		Assertions.assertNull(user.getPassword(), "Profile should not contain password");
	}
}
