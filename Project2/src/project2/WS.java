package project2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WS {
    public WS() {
        super();
    }

    @WebMethod
    public String getWS(@WebParam(name = "arg0") String s){
        return "Respuesta -> " + s;
    }
}
