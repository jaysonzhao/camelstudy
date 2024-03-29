package org.fuse.usecase.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-730040-redhat-00001
  * 2019-07-10T16:39:46.396+08:00
 * Generated source version: 3.2.7.fuse-730040-redhat-00001
 *
 */
@WebServiceClient(name = "CustomerWSService",
                  wsdlLocation = "http://soap-service-jaysonfusetest.apps.6dff.openshift.opentlc.com/ws/customerService?wsdl",
                  targetNamespace = "http://service.usecase.fuse.org/")
public class CustomerWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.usecase.fuse.org/", "CustomerWSService");
    public final static QName CustomerWSPort = new QName("http://service.usecase.fuse.org/", "CustomerWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://soap-service-jaysonfusetest.apps.6dff.openshift.opentlc.com/ws/customerService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerWSService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://soap-service-jaysonfusetest.apps.6dff.openshift.opentlc.com/ws/customerService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerWSService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns CustomerWS
     */
    @WebEndpoint(name = "CustomerWSPort")
    public CustomerWS getCustomerWSPort() {
        return super.getPort(CustomerWSPort, CustomerWS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerWS
     */
    @WebEndpoint(name = "CustomerWSPort")
    public CustomerWS getCustomerWSPort(WebServiceFeature... features) {
        return super.getPort(CustomerWSPort, CustomerWS.class, features);
    }

}
