package com.orange.summer.ioc.spring.writer.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.orange.summer.ioc.spring.writer.Writer;

@Component("htmlWriter")
public class HtmlWriter implements Writer {

	public boolean write(List<String[]> data) {
		System.out.println("I am HTML writer");
		return true;
	}

}
