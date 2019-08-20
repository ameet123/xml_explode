package com.ameet.xml.service;

import com.ameet.xml.config.Constants;
import com.ameet.xml.model.QuotePolicyListType;
import com.ameet.xml.util.GenUtils;
import org.apache.avro.Schema;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class AvroMakerTest {
    private String XML_FILE = "xml_hier3.xml";
    private XMLParser parser;
    private AvroMaker avroMaker;

    @Before
    public void setUp() throws Exception {
        parser = new XMLParser();
        avroMaker = new AvroMaker();
    }

    @Test
    public void generateSchema() throws IOException {
        AvroMaker maker = new AvroMaker();
        Schema schema = maker.generateSchema();
        String asJson = schema.toString(true);
        System.out.println(asJson);
        GenUtils.writeAvroSchema(asJson);
    }

    @Test
    public void writeAvro() throws JAXBException, IOException {
        QuotePolicyListType quotePolicyList = parser.fromFile(XML_FILE);
        System.out.println(quotePolicyList.getQuotePolicy().getPolicyNumber().getCurValue());
        AvroMaker avromaker = new AvroMaker();
        avromaker.writeAvro(quotePolicyList, Constants.OUTPUT_AVRO_FILE);
    }

    @Test
    public void readAvro() throws IOException {
        QuotePolicyListType quotePolicy = avroMaker.readAvro();
        System.out.println("Policy no:" + quotePolicy.getQuotePolicy().getPolicyNumber().getCurValue());
    }
}