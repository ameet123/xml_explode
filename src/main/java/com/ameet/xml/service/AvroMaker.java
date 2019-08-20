package com.ameet.xml.service;

import com.ameet.xml.config.Constants;
import com.ameet.xml.model.QuotePolicyListType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import org.apache.avro.Schema;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AvroMaker {
    private ObjectMapper avroObjectMapper;
    private AvroMapper avroMapper;
    private Schema quotePolicySchema;
    private AvroSchema quoteAvroSchema;

    public AvroMaker() {
        avroObjectMapper = new ObjectMapper(new AvroFactory());
        avroMapper = new AvroMapper();
    }

    public Schema generateSchema() throws JsonMappingException {
        if (quotePolicySchema != null) {
            return quotePolicySchema;
        }
        AvroSchemaGenerator gen = new AvroSchemaGenerator();
        avroObjectMapper.acceptJsonFormatVisitor(QuotePolicyListType.class, gen);
        AvroSchema schemaWrapper = gen.getGeneratedSchema();
        quoteAvroSchema = schemaWrapper;
        quotePolicySchema = schemaWrapper.getAvroSchema();
        return quotePolicySchema;
    }

    public void writeAvro(QuotePolicyListType quoteInstance, String outputFile) throws IOException {
        if (quoteAvroSchema == null) {
            generateSchema();
        }
        byte[] avroData = avroMapper.writer(quoteAvroSchema)
                .writeValueAsBytes(quoteInstance);
        Path path = Paths.get(outputFile);
        Files.write(path, avroData);
    }

    public QuotePolicyListType readAvro() throws IOException {
        if (quoteAvroSchema == null) {
            generateSchema();
        }
        InputStream targetStream = new FileInputStream(Constants.OUTPUT_AVRO_FILE);
        return avroMapper.readerFor(QuotePolicyListType.class)
                .with(quoteAvroSchema)
                .readValue(targetStream);
    }
}
