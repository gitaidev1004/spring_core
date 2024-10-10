package com.example.myapp.member;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<Object> lists;
	private Set<Object> sets;
	private Map<String, Object> maps;
	private Properties props;
	
	private String name;
	private int age;
	
	public Person() { }
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
}