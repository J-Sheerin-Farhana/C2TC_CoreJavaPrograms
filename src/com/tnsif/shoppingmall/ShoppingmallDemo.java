package com.tnsif.shoppingmall;

public class ShoppingmallDemo {

	public static void main(String[] args) {
		shopping s;
		s= new Clothes();
		s.purchase();
		
		s= new Electronics();
		s.purchase();
	}
}