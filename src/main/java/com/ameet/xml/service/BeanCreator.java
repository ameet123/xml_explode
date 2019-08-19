package com.ameet.xml.service;

import com.ameet.xml.csvmodel.CSDCsv;
import com.ameet.xml.model.CoverageStructureDetailsType;
import com.ameet.xml.model.QuotePolicyListType;

import java.util.ArrayList;
import java.util.List;

/**
 * construct appropriate wrapper class for attributes
 * so that they can be flattened
 */
public class BeanCreator {

    public static List<CSDCsv> getCSDList(QuotePolicyListType quotePolicy) {
        List<CSDCsv> csvBeans = new ArrayList<>();
        for (CoverageStructureDetailsType csd : quotePolicy.getQuotePolicy().getProduct().getMLPL().
                getMediaLiabilityList().getMediaLiability().getMDCoverageStructureList().
                getMDCoverageStructure().getCoverageStructureDetailsList().getCoverageStructureDetails()) {
            System.out.println(csd.getId());
            CSDCsv c = new CSDCsv();
            c.setId(csd.getId());
            c.setGid(csd.getGid());
            c.setCovCode(csd.getCCovCode().getCurValue());
            csvBeans.add(c);
        }
        return csvBeans;
    }
}
