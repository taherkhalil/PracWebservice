package com.globalpay.ws.uk.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomResource {

	@Autowired
	private Resource resourceLoader;

	public void setResourceLoader(Resource resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	public Resource getResourceLoader() {
		return resourceLoader;
	}

	// public void showResourceData() throws IOException {
	// // This line will be changed for all versions of other examples
	// Resource banner = resourceLoader
	// .getResource("classpath:/WebContent/WEB-INF/XMLConfig/CurrentConnection.xml");
	// InputStream in = banner.getInputStream();
	//
	// BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	// while (true) {
	// String line = reader.readLine();
	// if (line == null)
	// break;
	// System.out.println(line);
	// }
	// reader.close();
	// }
}
