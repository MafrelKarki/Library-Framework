package edu.mum.asd.libraryframework.dbaccess;

import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.mum.asd.libraryframework.model.NewUserBuilder;
import edu.mum.asd.libraryframework.model.User;
import edu.mum.asd.libraryframework.model.UserDirector;

public class Test {
	public static void main(String...args) {
//		Author a=new AuthorDao().find(4);
//		a.setBiography("BBB  IIII");
//		a.setDateOfBirth(new Date());
//		a.setLastName("KARKI");
//		a.setFirstName("MAFREL");
//		new AuthorDao().delete(a.getId());
		
		NewUserBuilder builder = new NewUserBuilder();
		UserDirector director = new UserDirector(builder);
		director.buildUserNamingInfo("mafrel", "Karki");
		director.buildUserContactInfo("mafrelkc@mail.com", "2408778080", "1000N 4th Street, Fairfield Iowa");
		director.buildUserPassword("mafrel");
		director.buildCreationAndUpdationInfo(new Date(), new Date());
		director.buildUserEligibilityStatus(1);
		
		
		User user = director.getUser();
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		System.out.println(user.getPassword());
//		System.out.println(passwordEncoder.encode("mafrel"));
		
		System.out.println(passwordEncoder.matches("mafrels", user.getPassword()));
		
		System.out.println(user);
	}
}