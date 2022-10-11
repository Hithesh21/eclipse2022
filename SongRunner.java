package com.xworkz.copy.boot;
import com.xworkz.copy.*;
public class SongRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song ref=new Song();
		System.out.println(ref.language);
		System.out.println(ref.name);
		System.out.println(ref.singer);
		System.out.println(ref.lyricst);
		System.out.println(ref.type);
		ref.language="kannada";
		ref.name="america america";
		ref.singer="chitra";
		ref.lyricst="rrrr";
		ref.type="retro";
		System.out.println(ref.language);
		System.out.println(ref.name);
		System.out.println(ref.singer);
		System.out.println(ref.lyricst);
		System.out.println(ref.type);

	}

}
