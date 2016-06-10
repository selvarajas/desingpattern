
package com.agimatec.publicinterfaces.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSReservationService", targetNamespace = "http://service.publicinterfaces.agimatec.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSReservationService {


    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetMachinesWithTagResponse
     */
    @WebMethod
    @WebResult(name = "getMachinesWithTagResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetMachinesWithTagResponse getMachinesWithTag(
        @WebParam(name = "getMachinesWithTag", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetMachinesWithTag parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo);

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetAvailableBoxSizesResponse
     */
    @WebMethod
    @WebResult(name = "getAvailableBoxSizesResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetAvailableBoxSizesResponse getAvailableBoxSizes(
        @WebParam(name = "getAvailableBoxSizes", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetAvailableBoxSizes parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo);

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetAvailableTagsResponse
     */
    @WebMethod
    @WebResult(name = "getAvailableTagsResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetAvailableTagsResponse getAvailableTags(
        @WebParam(name = "getAvailableTags", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetAvailableTags parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo);

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetCurrentMachineBoxesOverviewResponse
     * @throws PublicServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "getCurrentMachineBoxesOverviewResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetCurrentMachineBoxesOverviewResponse getCurrentMachineBoxesOverview(
        @WebParam(name = "getCurrentMachineBoxesOverview", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetCurrentMachineBoxesOverview parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo)
        throws PublicServiceException_Exception
    ;

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.CancelReservationResponse
     * @throws ReservationServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "cancelReservationResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "result")
    public CancelReservationResponse cancelReservation(
        @WebParam(name = "cancelReservation", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        CancelReservation parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo)
        throws ReservationServiceException_Exception
    ;

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.ReserveCompartmentResponse
     * @throws ReservationServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "reserveCompartmentResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public ReserveCompartmentResponse reserveCompartment(
        @WebParam(name = "reserveCompartment", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        ReserveCompartment parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo)
        throws ReservationServiceException_Exception
    ;

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetMachineDetailsWithTagAndLifecycleStatusResponse
     * @throws PublicServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "getMachineDetailsWithTagAndLifecycleStatusResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetMachineDetailsWithTagAndLifecycleStatusResponse getMachineDetailsWithTagAndLifecycleStatus(
        @WebParam(name = "getMachineDetailsWithTagAndLifecycleStatus", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetMachineDetailsWithTagAndLifecycleStatus parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo)
        throws PublicServiceException_Exception
    ;

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetAvailableFreeBoxesForMachineResponse
     * @throws ReservationServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "getAvailableFreeBoxesForMachineResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetAvailableFreeBoxesForMachineResponse getAvailableFreeBoxesForMachine(
        @WebParam(name = "getAvailableFreeBoxesForMachine", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetAvailableFreeBoxesForMachine parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo)
        throws ReservationServiceException_Exception
    ;

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetAllMachinesResponse
     */
    @WebMethod
    @WebResult(name = "getAllMachinesResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetAllMachinesResponse getAllMachines(
        @WebParam(name = "getAllMachines", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetAllMachines parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo);

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetCurrentMachineBoxesStateResponse
     * @throws PublicServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "getCurrentMachineBoxesStateResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetCurrentMachineBoxesStateResponse getCurrentMachineBoxesState(
        @WebParam(name = "getCurrentMachineBoxesState", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetCurrentMachineBoxesState parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo)
        throws PublicServiceException_Exception
    ;

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetAvailableProductCodesResponse
     */
    @WebMethod
    @WebResult(name = "getAvailableProductCodesResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetAvailableProductCodesResponse getAvailableProductCodes(
        @WebParam(name = "getAvailableProductCodes", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetAvailableProductCodes parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo);

    /**
     * 
     * @param parameters
     * @param callerInfo
     * @return
     *     returns com.agimatec.publicinterfaces.service.GetMachineDetailsResponse
     * @throws PublicServiceException_Exception
     */
    @WebMethod
    @WebResult(name = "getMachineDetailsResponse", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
    public GetMachineDetailsResponse getMachineDetails(
        @WebParam(name = "getMachineDetails", targetNamespace = "http://service.publicinterfaces.agimatec.com", partName = "parameters")
        GetMachineDetails parameters,
        @WebParam(name = "CallerInfo", targetNamespace = "http://service.publicinterfaces.agimatec.com", header = true, partName = "CallerInfo")
        CallerInfo callerInfo)
        throws PublicServiceException_Exception
    ;

}
