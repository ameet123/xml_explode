package com.ameet.xml.service;

import com.ameet.xml.model.QuotePolicyListType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLParser {
    private JAXBContext jaxbContext;
    private Unmarshaller jaxbUnmarshaller;

    public XMLParser() {
        try {
            jaxbContext = JAXBContext.newInstance(QuotePolicyListType.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException e) {
            System.out.println("Err: Unmarshalling-" + e.getMessage());
        }

    }

    public QuotePolicyListType fromFile(String file) throws JAXBException {
        return (QuotePolicyListType) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(new File(file)));
    }
}
