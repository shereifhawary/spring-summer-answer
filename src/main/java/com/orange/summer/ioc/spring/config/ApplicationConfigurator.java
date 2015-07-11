package com.orange.summer.ioc.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.orange.summer.ioc.spring.reader.Reader;
import com.orange.summer.ioc.spring.writer.Writer;
import com.orange.summer.ioc.spring.writer.impl.CsvWriter;
import com.orange.summer.ioc.spring.writer.impl.HtmlWriter;

@Configuration
public class ApplicationConfigurator {

	@Bean(name = "csvWriter")
	public Writer getCsvWriter() {
		CsvWriter writer = new CsvWriter();
		writer.setSeperator("|");
		return writer;
	}

	@Bean(name = "htmlWriter")
	public Writer getHtmlWriter() {
		HtmlWriter writer = new HtmlWriter();
		return writer;
	}

	@Bean(name = "reader")
	public Reader getReader() {
		Reader reader = new Reader();
		reader.setWriter(getCsvWriter());
		return reader;
	}
}
