package com.ameet.xml.service;

import com.ameet.xml.model.QuotePolicyListType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import org.apache.avro.Schema;

public class AvroMaker {
    public Schema generateSchema() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper(new AvroFactory());
        AvroSchemaGenerator gen = new AvroSchemaGenerator();
        mapper.acceptJsonFormatVisitor(QuotePolicyListType.class, gen);
        AvroSchema schemaWrapper = gen.getGeneratedSchema();
        return schemaWrapper.getAvroSchema();
    }
}
