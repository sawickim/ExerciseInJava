package com.connectis.programator.demo.zajecia_09_01.a_kolekcje.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewAllegro {

	private final Map<Integer, User> userMap;

	public NewAllegro() {
		userMap = new HashMap<>();
	}

	public void createUser(String userName) {
		Integer nextId = getNextId();
		User user = new User(nextId, userName);
		userMap.put(user.getId(), user);
	}

	public User getUser(Integer id) {
		return userMap.get(id);
	}

	public Set<User> getAllUsers() {
		return new HashSet<>(userMap.values());
	}

	private Integer getNextId() {
		Set<Integer> allIds = userMap.keySet();
		if (allIds.isEmpty()) {
			return 1;
		}

		return Collections.max(allIds) + 1;
	}
}
