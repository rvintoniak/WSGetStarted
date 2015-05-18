package com.osf.romanvintonyak.WSDummy;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;

import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalog.AssessmentCatalogType.CatalogQueryStatus;
import com.osf.romanvintonyak.WSDummy.AssessmentCatalogQuery.AssessmentCatalogQueryType;
/**
 * A simple Web Service which receive a xml on input
 * and reply with other xml
 * created for education goals
 * @author Roman Vintonyak
 * @version 1.1 Based on Map<AssessmentCatalogQueryType, AssessmentCatalogType> data mock
 */
@WebService(endpointInterface = "com.osf.romanvintonyak.WSDummy.Endpoint")
public class EndpointImpl implements Endpoint {
	/**
	 * Error status message
	 */
	public static final String ERROR_STATUS = "ERROR";
	/**
	 * Error details message
	 */
	public static final String PROVIDER_NOT_FOUND = "Provider is not found";
	/**
	 * Returns a xml structure based on input param
	 * 
	 * @param  query input AssessmentCatalogQuery xml 
	 * @return the AssessmentCatalog output xml
	 * @exception (@throws javax.xml.bind.JAXBException) 
	 */
	@Override
	public AssessmentCatalogType processXML(AssessmentCatalogQueryType query) throws JAXBException {

		CatalogDatasourceMock datasource = new CatalogDatasourceMock();
		AssessmentCatalogType assessmentCatalog = datasource.getData().get(query);
		if (assessmentCatalog == null) {
			assessmentCatalog = new AssessmentCatalogType();
			CatalogQueryStatus catalogQueryStatus = new CatalogQueryStatus();
			catalogQueryStatus.setStatus(ERROR_STATUS);
			catalogQueryStatus.setDetails(PROVIDER_NOT_FOUND);
			assessmentCatalog.setCatalogQueryStatus(catalogQueryStatus);
			return assessmentCatalog;
		}
		return assessmentCatalog;
	}

}