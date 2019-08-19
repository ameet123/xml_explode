package com.ameet.xml;

import com.ameet.xml.csvmodel.CSDCsv;
import com.ameet.xml.model.PolicyUnderwriterType;
import com.ameet.xml.model.QuotePolicyListType;
import com.ameet.xml.service.BeanCreator;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class TestLoad {
    private String XML_FILE = "xml_hier2.xml";
    private String POLICY_UNDERWRITER_CSV = "out/policy_under.csv";
    private String CSD_CSV = "out/coverage_structure.csv";

    @Test
    public void load1() throws JAXBException {
        QuotePolicyListType quotePolicy = fromFile();
        System.out.println(quotePolicy.getQuotePolicy().getPolicyNumber().getCurValue());
    }

    private QuotePolicyListType fromFile() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(QuotePolicyListType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return
                (QuotePolicyListType) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(new File(XML_FILE)));
    }

    @Test
    public void tocsv() throws JAXBException, IOException, CsvDataTypeMismatchException,
            CsvRequiredFieldEmptyException {
        QuotePolicyListType quotePolicy = fromFile();
        Writer writer = new FileWriter(POLICY_UNDERWRITER_CSV);

        StatefulBeanToCsv<PolicyUnderwriterType> sbc = new StatefulBeanToCsvBuilder<PolicyUnderwriterType>(writer).
                withSeparator(CSVWriter.DEFAULT_SEPARATOR).build();
        List<PolicyUnderwriterType> underwriterTypes = new ArrayList<>();
        underwriterTypes.add(quotePolicy.getQuotePolicy().getPolicyUnderwriterList().getPolicyUnderwriter());
        sbc.write(underwriterTypes);
        writer.close();
    }

    @Test
    public void Listtocsv() throws JAXBException, IOException, CsvDataTypeMismatchException,
            CsvRequiredFieldEmptyException {
        QuotePolicyListType quotePolicy = fromFile();
        Writer writer = new FileWriter(CSD_CSV);

        StatefulBeanToCsv<CSDCsv> sbc =
                new StatefulBeanToCsvBuilder<CSDCsv>(writer).
                        withSeparator(CSVWriter.DEFAULT_SEPARATOR).build();
        sbc.write(BeanCreator.getCSDList(quotePolicy));
        writer.close();
    }
}
