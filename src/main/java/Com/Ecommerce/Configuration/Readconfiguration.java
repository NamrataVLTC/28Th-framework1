package Com.Ecommerce.Configuration;

import java.io.File;	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfiguration {

Properties prop;
	
	public Readconfiguration() {
		
		File src = new File("\\Users\\User\\eclipse-workspace\\28Oct_Auto_Framework\\src\\test\\resources\\Configuration\\Config.properties");
		
		prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(src);
			try {
				prop.load(fis);
			}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
}
  }
	public  String getApplicationURL() {
		String URL = prop.getProperty("BaseURL");
		return URL;
	}
	public  String Username() {
		String Username = prop.getProperty("Username");
		return Username;
	}
	public  String Password() {
		String Password = prop.getProperty("Password");
		return Password;
	}
}

