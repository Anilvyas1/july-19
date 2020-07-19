package att.code.start;

import java.util.Date;

public class Table {
	static int a=3;

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Date:::  "+d);
		for(int i=1;i<11;i++) {
		System.out.println("Table::  "+ i*a);
		}

	}

}
