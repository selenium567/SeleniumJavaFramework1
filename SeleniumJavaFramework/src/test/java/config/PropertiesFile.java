package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo_Referingpropfile;

public class PropertiesFile {
	static Properties prop=new Properties();
	static String ProjectPath=System.getProperty("user.dir");

	public static void main(String[] args) {
		getPropeties();
		setProperties();
		getPropeties();
	}

	public static void getPropeties() {
		try{
			InputStream input=new FileInputStream(ProjectPath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println("browser is: "+browser);
			TestNG_Demo_Referingpropfile.browserName=browser;

		}

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void setProperties() {
		try {
			OutputStream output=new FileOutputStream(ProjectPath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			//prop.setProperty("result", "pass");
			prop.store(output, null);

		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
