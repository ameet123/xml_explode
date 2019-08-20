package com.ameet.xml.service;

import com.ameet.xml.util.GenUtils;
import org.apache.avro.Schema;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class AvroMakerTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void generateSchema() throws IOException {
        AvroMaker maker = new AvroMaker();
        Schema schema = maker.generateSchema();
        String asJson = schema.toString(true);
        System.out.println(asJson);
        GenUtils.writeAvroSchema(asJson);
    }
}