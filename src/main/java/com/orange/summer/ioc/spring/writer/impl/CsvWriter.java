package com.orange.summer.ioc.spring.writer.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.orange.summer.ioc.spring.writer.Writer;

@Component("csvWriter")
public class CsvWriter implements Writer {

	private String seperator = ",";

	public boolean write(List<String[]> data) {
		System.out.println("I am CSV writer with seperator = '"
				+ this.seperator + "'");
		return true;
	}

	public void setSeperator(String seperator) {
		this.seperator = seperator;
	}

	public CsvWriter(String seperator) {
		this.seperator = seperator;
	}

	public CsvWriter() {
		super();
	}

}
