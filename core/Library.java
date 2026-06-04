package org.snad;

import java.util.List;

public class Library {
	private String name;
	private String location;
	private List<Books> books;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", location=" + location + ", books=" + books + "]";
	}

}
