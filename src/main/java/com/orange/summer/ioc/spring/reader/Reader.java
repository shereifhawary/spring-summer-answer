package com.orange.summer.ioc.spring.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.orange.summer.ioc.spring.writer.Writer;

@Service
public class Reader {
	
	
	@Autowired
	@Qualifier("csvWriter")
	//@Qualifier("csvWriterWithConstractor")
	private Writer writer;
	
	
	
	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public void readData(){
		/*******************************/
		
		writer.write(null);
	}
	
}
