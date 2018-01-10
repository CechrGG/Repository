package com.cechr.test.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")//prefix app
public class AppProperties {

	private String error;
	private List<Menu> menus = new ArrayList<Menu>();
	private Compiler compiler = new Compiler();
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Compiler getCompiler() {
		return compiler;
	}

	public void setCompiler(Compiler compiler) {
		this.compiler = compiler;
	}
	
	@Override
	public String toString() {
		return "AppProperties{error='" + error + "', <br>menus=[ <br>&nbsp;&nbsp;" + menus.get(0).toString() + ", <br>&nbsp;&nbsp;"
				+ menus.get(1).toString() + "<br>], <br> compiler=" + compiler.toString() + "<br>}<br>";
	}
	
	public static class Menu {
		
		private String title;
		private String name;
		private String path;
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		@Override
		public String toString() {
			return "Menu{name='" + name + "', path='" + path + "', title='" + title + "'}";
		}
	}
	
	public static class Compiler {
		
		private String timeout;
		private String outputFolder;
		
		public String getTimeout() {
			return timeout;
		}

		public void setTimeout(String timeout) {
			this.timeout = timeout;
		}

		public String getOutputFolder() {
			return outputFolder;
		}

		public void setOutputFolder(String outputFolder) {
			this.outputFolder = outputFolder;
		}

		@Override
		public String toString() {
			return "Compiler{thimeout='" + timeout + "', outputFolder='" + outputFolder + "'}";
		}
	}
}
