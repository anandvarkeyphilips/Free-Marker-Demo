package io.javabrains;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;

@SpringBootApplication
public class FreeMarkerDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FreeMarkerDemoApplication.class, args);

	}

	@Override
	public void run(String... args) {

		Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);

		try {

			// Load template Path Option 1 - Class Path
			cfg.setClassForTemplateLoading(FreeMarkerDemoApplication.class, "/templates");

			// Load template Path Option 2 - Directory
			cfg.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));

			// Encoding
			cfg.setDefaultEncoding("UTF-8");
			Template template = cfg.getTemplate("jsonRequest.ftl");

			// Create data for template
			Map<String, Object> templateData = new HashMap<String, Object>();

			Header headerData = new Header("headerDetailName", new SomeClass(1, "ClassName"));
			templateData.put("headerData", headerData);

			List<RequestData> requests = Arrays.asList(new RequestData(1l, "Java Honk", 111),
					new RequestData(2l, "DB Monk", 222));
			templateData.put("requestList", requests);

			// Write output on console example 1
			StringWriter stringWriter = new StringWriter();
			template.process(templateData, stringWriter);
			System.out.println(stringWriter.getBuffer().toString());
			stringWriter.flush();

			// Write output on console example 2
			Writer writer = new OutputStreamWriter(System.out);
			template.process(templateData, writer);
			writer.flush();

			// Write data to the file
			Writer file = new FileWriter(
					new File("C:\\Users\\anand\\Desktop\\" + "transactionId" + ".json"));
			template.process(templateData, file);
			file.flush();
			file.close();

			// Make String Output from template
			String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, templateData);
			System.out.println(text);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}