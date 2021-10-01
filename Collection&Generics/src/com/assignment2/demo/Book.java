package com.assignment2.demo;

public class Book {
	private Integer bookId;
	private String bookName;
	private int pages;
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", pages=" + pages + "]";
	}
	public Book(Integer bookId, String bookName, int pages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.pages = pages;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + pages;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}	
	
}
