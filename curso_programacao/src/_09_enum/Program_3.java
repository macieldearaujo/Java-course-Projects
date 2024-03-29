package _09_enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Comment;
import model.entities.Post;

public class Program_3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:18"), "Travelling to New Zealand", "I'm going to visit this wonderful country!", 12);
		p1.addComment(new Comment("Have a nice trip!"));
		p1.addComment(new Comment("How that's awesome!"));
		
		Post p2 = new Post(sdf.parse("26/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		p2.addComment(new Comment("Good night!"));
		p2.addComment(new Comment("May the Force be with you!"));
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
