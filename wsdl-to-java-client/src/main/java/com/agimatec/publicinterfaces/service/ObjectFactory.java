
package com.agimatec.publicinterfaces.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.agimatec.publicinterfaces.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelReservation_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "cancelReservation");
    private final static QName _ReserveCompartmentResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "reserveCompartmentResponse");
    private final static QName _GetCurrentMachineBoxesOverview_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getCurrentMachineBoxesOverview");
    private final static QName _ReservationServiceException_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "ReservationServiceException");
    private final static QName _PublicServiceException_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "PublicServiceException");
    private final static QName _GetAvailableFreeBoxesForMachine_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableFreeBoxesForMachine");
    private final static QName _GetAllMachinesResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAllMachinesResponse");
    private final static QName _GetMachineDetails_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getMachineDetails");
    private final static QName _GetAvailableFreeBoxesForMachineResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableFreeBoxesForMachineResponse");
    private final static QName _GetMachineDetailsWithTagAndLifecycleStatus_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getMachineDetailsWithTagAndLifecycleStatus");
    private final static QName _GetAvailableBoxSizes_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableBoxSizes");
    private final static QName _CancelReservationResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "cancelReservationResponse");
    private final static QName _GetAvailableTags_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableTags");
    private final static QName _GetCurrentMachineBoxesOverviewResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getCurrentMachineBoxesOverviewResponse");
    private final static QName _ReserveCompartment_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "reserveCompartment");
    private final static QName _CallerInfo_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "CallerInfo");
    private final static QName _GetAvailableTagsResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableTagsResponse");
    private final static QName _GetAvailableBoxSizesResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableBoxSizesResponse");
    private final static QName _GetAvailableProductCodesResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableProductCodesResponse");
    private final static QName _GetAllMachines_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAllMachines");
    private final static QName _GetMachinesWithTag_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getMachinesWithTag");
    private final static QName _GetCurrentMachineBoxesState_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getCurrentMachineBoxesState");
    private final static QName _GetMachineDetailsResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getMachineDetailsResponse");
    private final static QName _GetMachineDetailsWithTagAndLifecycleStatusResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getMachineDetailsWithTagAndLifecycleStatusResponse");
    private final static QName _GetAvailableProductCodes_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getAvailableProductCodes");
    private final static QName _GetCurrentMachineBoxesStateResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getCurrentMachineBoxesStateResponse");
    private final static QName _GetMachinesWithTagResponse_QNAME = new QName("http://service.publicinterfaces.agimatec.com", "getMachinesWithTagResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.agimatec.publicinterfaces.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAvailableFreeBoxesForMachineResponse }
     * 
     */
    public GetAvailableFreeBoxesForMachineResponse createGetAvailableFreeBoxesForMachineResponse() {
        return new GetAvailableFreeBoxesForMachineResponse();
    }

    /**
     * Create an instance of {@link GetMachineDetails }
     * 
     */
    public GetMachineDetails createGetMachineDetails() {
        return new GetMachineDetails();
    }

    /**
     * Create an instance of {@link CancelReservationResponse }
     * 
     */
    public CancelReservationResponse createCancelReservationResponse() {
        return new CancelReservationResponse();
    }

    /**
     * Create an instance of {@link GetAvailableTags }
     * 
     */
    public GetAvailableTags createGetAvailableTags() {
        return new GetAvailableTags();
    }

    /**
     * Create an instance of {@link GetAvailableBoxSizes }
     * 
     */
    public GetAvailableBoxSizes createGetAvailableBoxSizes() {
        return new GetAvailableBoxSizes();
    }

    /**
     * Create an instance of {@link GetMachineDetailsWithTagAndLifecycleStatus }
     * 
     */
    public GetMachineDetailsWithTagAndLifecycleStatus createGetMachineDetailsWithTagAndLifecycleStatus() {
        return new GetMachineDetailsWithTagAndLifecycleStatus();
    }

    /**
     * Create an instance of {@link ReserveCompartmentResponse }
     * 
     */
    public ReserveCompartmentResponse createReserveCompartmentResponse() {
        return new ReserveCompartmentResponse();
    }

    /**
     * Create an instance of {@link GetCurrentMachineBoxesOverview }
     * 
     */
    public GetCurrentMachineBoxesOverview createGetCurrentMachineBoxesOverview() {
        return new GetCurrentMachineBoxesOverview();
    }

    /**
     * Create an instance of {@link CancelReservation }
     * 
     */
    public CancelReservation createCancelReservation() {
        return new CancelReservation();
    }

    /**
     * Create an instance of {@link GetAllMachinesResponse }
     * 
     */
    public GetAllMachinesResponse createGetAllMachinesResponse() {
        return new GetAllMachinesResponse();
    }

    /**
     * Create an instance of {@link GetAvailableFreeBoxesForMachine }
     * 
     */
    public GetAvailableFreeBoxesForMachine createGetAvailableFreeBoxesForMachine() {
        return new GetAvailableFreeBoxesForMachine();
    }

    /**
     * Create an instance of {@link ReservationServiceException }
     * 
     */
    public ReservationServiceException createReservationServiceException() {
        return new ReservationServiceException();
    }

    /**
     * Create an instance of {@link PublicServiceException }
     * 
     */
    public PublicServiceException createPublicServiceException() {
        return new PublicServiceException();
    }

    /**
     * Create an instance of {@link GetMachineDetailsWithTagAndLifecycleStatusResponse }
     * 
     */
    public GetMachineDetailsWithTagAndLifecycleStatusResponse createGetMachineDetailsWithTagAndLifecycleStatusResponse() {
        return new GetMachineDetailsWithTagAndLifecycleStatusResponse();
    }

    /**
     * Create an instance of {@link GetMachineDetailsResponse }
     * 
     */
    public GetMachineDetailsResponse createGetMachineDetailsResponse() {
        return new GetMachineDetailsResponse();
    }

    /**
     * Create an instance of {@link GetMachinesWithTagResponse }
     * 
     */
    public GetMachinesWithTagResponse createGetMachinesWithTagResponse() {
        return new GetMachinesWithTagResponse();
    }

    /**
     * Create an instance of {@link GetAvailableProductCodes }
     * 
     */
    public GetAvailableProductCodes createGetAvailableProductCodes() {
        return new GetAvailableProductCodes();
    }

    /**
     * Create an instance of {@link GetCurrentMachineBoxesStateResponse }
     * 
     */
    public GetCurrentMachineBoxesStateResponse createGetCurrentMachineBoxesStateResponse() {
        return new GetCurrentMachineBoxesStateResponse();
    }

    /**
     * Create an instance of {@link ReserveCompartment }
     * 
     */
    public ReserveCompartment createReserveCompartment() {
        return new ReserveCompartment();
    }

    /**
     * Create an instance of {@link CallerInfo }
     * 
     */
    public CallerInfo createCallerInfo() {
        return new CallerInfo();
    }

    /**
     * Create an instance of {@link GetAvailableTagsResponse }
     * 
     */
    public GetAvailableTagsResponse createGetAvailableTagsResponse() {
        return new GetAvailableTagsResponse();
    }

    /**
     * Create an instance of {@link GetCurrentMachineBoxesOverviewResponse }
     * 
     */
    public GetCurrentMachineBoxesOverviewResponse createGetCurrentMachineBoxesOverviewResponse() {
        return new GetCurrentMachineBoxesOverviewResponse();
    }

    /**
     * Create an instance of {@link GetCurrentMachineBoxesState }
     * 
     */
    public GetCurrentMachineBoxesState createGetCurrentMachineBoxesState() {
        return new GetCurrentMachineBoxesState();
    }

    /**
     * Create an instance of {@link GetAllMachines }
     * 
     */
    public GetAllMachines createGetAllMachines() {
        return new GetAllMachines();
    }

    /**
     * Create an instance of {@link GetMachinesWithTag }
     * 
     */
    public GetMachinesWithTag createGetMachinesWithTag() {
        return new GetMachinesWithTag();
    }

    /**
     * Create an instance of {@link GetAvailableBoxSizesResponse }
     * 
     */
    public GetAvailableBoxSizesResponse createGetAvailableBoxSizesResponse() {
        return new GetAvailableBoxSizesResponse();
    }

    /**
     * Create an instance of {@link GetAvailableProductCodesResponse }
     * 
     */
    public GetAvailableProductCodesResponse createGetAvailableProductCodesResponse() {
        return new GetAvailableProductCodesResponse();
    }

    /**
     * Create an instance of {@link DtMachineBoxesOverview }
     * 
     */
    public DtMachineBoxesOverview createDtMachineBoxesOverview() {
        return new DtMachineBoxesOverview();
    }

    /**
     * Create an instance of {@link DtAvailableBoxes }
     * 
     */
    public DtAvailableBoxes createDtAvailableBoxes() {
        return new DtAvailableBoxes();
    }

    /**
     * Create an instance of {@link DtBoxGroup }
     * 
     */
    public DtBoxGroup createDtBoxGroup() {
        return new DtBoxGroup();
    }

    /**
     * Create an instance of {@link DtDeliveryMachine }
     * 
     */
    public DtDeliveryMachine createDtDeliveryMachine() {
        return new DtDeliveryMachine();
    }

    /**
     * Create an instance of {@link DtMachineAddress }
     * 
     */
    public DtMachineAddress createDtMachineAddress() {
        return new DtMachineAddress();
    }

    /**
     * Create an instance of {@link DtAddress }
     * 
     */
    public DtAddress createDtAddress() {
        return new DtAddress();
    }

    /**
     * Create an instance of {@link DtMachineProperty }
     * 
     */
    public DtMachineProperty createDtMachineProperty() {
        return new DtMachineProperty();
    }

    /**
     * Create an instance of {@link DtTag }
     * 
     */
    public DtTag createDtTag() {
        return new DtTag();
    }

    /**
     * Create an instance of {@link DtDevice }
     * 
     */
    public DtDevice createDtDevice() {
        return new DtDevice();
    }

    /**
     * Create an instance of {@link DtBox }
     * 
     */
    public DtBox createDtBox() {
        return new DtBox();
    }

    /**
     * Create an instance of {@link DtReservation }
     * 
     */
    public DtReservation createDtReservation() {
        return new DtReservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "cancelReservation")
    public JAXBElement<CancelReservation> createCancelReservation(CancelReservation value) {
        return new JAXBElement<CancelReservation>(_CancelReservation_QNAME, CancelReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveCompartmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "reserveCompartmentResponse")
    public JAXBElement<ReserveCompartmentResponse> createReserveCompartmentResponse(ReserveCompartmentResponse value) {
        return new JAXBElement<ReserveCompartmentResponse>(_ReserveCompartmentResponse_QNAME, ReserveCompartmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentMachineBoxesOverview }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getCurrentMachineBoxesOverview")
    public JAXBElement<GetCurrentMachineBoxesOverview> createGetCurrentMachineBoxesOverview(GetCurrentMachineBoxesOverview value) {
        return new JAXBElement<GetCurrentMachineBoxesOverview>(_GetCurrentMachineBoxesOverview_QNAME, GetCurrentMachineBoxesOverview.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "ReservationServiceException")
    public JAXBElement<ReservationServiceException> createReservationServiceException(ReservationServiceException value) {
        return new JAXBElement<ReservationServiceException>(_ReservationServiceException_QNAME, ReservationServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "PublicServiceException")
    public JAXBElement<PublicServiceException> createPublicServiceException(PublicServiceException value) {
        return new JAXBElement<PublicServiceException>(_PublicServiceException_QNAME, PublicServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableFreeBoxesForMachine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableFreeBoxesForMachine")
    public JAXBElement<GetAvailableFreeBoxesForMachine> createGetAvailableFreeBoxesForMachine(GetAvailableFreeBoxesForMachine value) {
        return new JAXBElement<GetAvailableFreeBoxesForMachine>(_GetAvailableFreeBoxesForMachine_QNAME, GetAvailableFreeBoxesForMachine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMachinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAllMachinesResponse")
    public JAXBElement<GetAllMachinesResponse> createGetAllMachinesResponse(GetAllMachinesResponse value) {
        return new JAXBElement<GetAllMachinesResponse>(_GetAllMachinesResponse_QNAME, GetAllMachinesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachineDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getMachineDetails")
    public JAXBElement<GetMachineDetails> createGetMachineDetails(GetMachineDetails value) {
        return new JAXBElement<GetMachineDetails>(_GetMachineDetails_QNAME, GetMachineDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableFreeBoxesForMachineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableFreeBoxesForMachineResponse")
    public JAXBElement<GetAvailableFreeBoxesForMachineResponse> createGetAvailableFreeBoxesForMachineResponse(GetAvailableFreeBoxesForMachineResponse value) {
        return new JAXBElement<GetAvailableFreeBoxesForMachineResponse>(_GetAvailableFreeBoxesForMachineResponse_QNAME, GetAvailableFreeBoxesForMachineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachineDetailsWithTagAndLifecycleStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getMachineDetailsWithTagAndLifecycleStatus")
    public JAXBElement<GetMachineDetailsWithTagAndLifecycleStatus> createGetMachineDetailsWithTagAndLifecycleStatus(GetMachineDetailsWithTagAndLifecycleStatus value) {
        return new JAXBElement<GetMachineDetailsWithTagAndLifecycleStatus>(_GetMachineDetailsWithTagAndLifecycleStatus_QNAME, GetMachineDetailsWithTagAndLifecycleStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableBoxSizes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableBoxSizes")
    public JAXBElement<GetAvailableBoxSizes> createGetAvailableBoxSizes(GetAvailableBoxSizes value) {
        return new JAXBElement<GetAvailableBoxSizes>(_GetAvailableBoxSizes_QNAME, GetAvailableBoxSizes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "cancelReservationResponse")
    public JAXBElement<CancelReservationResponse> createCancelReservationResponse(CancelReservationResponse value) {
        return new JAXBElement<CancelReservationResponse>(_CancelReservationResponse_QNAME, CancelReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableTags }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableTags")
    public JAXBElement<GetAvailableTags> createGetAvailableTags(GetAvailableTags value) {
        return new JAXBElement<GetAvailableTags>(_GetAvailableTags_QNAME, GetAvailableTags.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentMachineBoxesOverviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getCurrentMachineBoxesOverviewResponse")
    public JAXBElement<GetCurrentMachineBoxesOverviewResponse> createGetCurrentMachineBoxesOverviewResponse(GetCurrentMachineBoxesOverviewResponse value) {
        return new JAXBElement<GetCurrentMachineBoxesOverviewResponse>(_GetCurrentMachineBoxesOverviewResponse_QNAME, GetCurrentMachineBoxesOverviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveCompartment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "reserveCompartment")
    public JAXBElement<ReserveCompartment> createReserveCompartment(ReserveCompartment value) {
        return new JAXBElement<ReserveCompartment>(_ReserveCompartment_QNAME, ReserveCompartment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "CallerInfo")
    public JAXBElement<CallerInfo> createCallerInfo(CallerInfo value) {
        return new JAXBElement<CallerInfo>(_CallerInfo_QNAME, CallerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableTagsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableTagsResponse")
    public JAXBElement<GetAvailableTagsResponse> createGetAvailableTagsResponse(GetAvailableTagsResponse value) {
        return new JAXBElement<GetAvailableTagsResponse>(_GetAvailableTagsResponse_QNAME, GetAvailableTagsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableBoxSizesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableBoxSizesResponse")
    public JAXBElement<GetAvailableBoxSizesResponse> createGetAvailableBoxSizesResponse(GetAvailableBoxSizesResponse value) {
        return new JAXBElement<GetAvailableBoxSizesResponse>(_GetAvailableBoxSizesResponse_QNAME, GetAvailableBoxSizesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableProductCodesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableProductCodesResponse")
    public JAXBElement<GetAvailableProductCodesResponse> createGetAvailableProductCodesResponse(GetAvailableProductCodesResponse value) {
        return new JAXBElement<GetAvailableProductCodesResponse>(_GetAvailableProductCodesResponse_QNAME, GetAvailableProductCodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMachines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAllMachines")
    public JAXBElement<GetAllMachines> createGetAllMachines(GetAllMachines value) {
        return new JAXBElement<GetAllMachines>(_GetAllMachines_QNAME, GetAllMachines.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachinesWithTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getMachinesWithTag")
    public JAXBElement<GetMachinesWithTag> createGetMachinesWithTag(GetMachinesWithTag value) {
        return new JAXBElement<GetMachinesWithTag>(_GetMachinesWithTag_QNAME, GetMachinesWithTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentMachineBoxesState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getCurrentMachineBoxesState")
    public JAXBElement<GetCurrentMachineBoxesState> createGetCurrentMachineBoxesState(GetCurrentMachineBoxesState value) {
        return new JAXBElement<GetCurrentMachineBoxesState>(_GetCurrentMachineBoxesState_QNAME, GetCurrentMachineBoxesState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachineDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getMachineDetailsResponse")
    public JAXBElement<GetMachineDetailsResponse> createGetMachineDetailsResponse(GetMachineDetailsResponse value) {
        return new JAXBElement<GetMachineDetailsResponse>(_GetMachineDetailsResponse_QNAME, GetMachineDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachineDetailsWithTagAndLifecycleStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getMachineDetailsWithTagAndLifecycleStatusResponse")
    public JAXBElement<GetMachineDetailsWithTagAndLifecycleStatusResponse> createGetMachineDetailsWithTagAndLifecycleStatusResponse(GetMachineDetailsWithTagAndLifecycleStatusResponse value) {
        return new JAXBElement<GetMachineDetailsWithTagAndLifecycleStatusResponse>(_GetMachineDetailsWithTagAndLifecycleStatusResponse_QNAME, GetMachineDetailsWithTagAndLifecycleStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableProductCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getAvailableProductCodes")
    public JAXBElement<GetAvailableProductCodes> createGetAvailableProductCodes(GetAvailableProductCodes value) {
        return new JAXBElement<GetAvailableProductCodes>(_GetAvailableProductCodes_QNAME, GetAvailableProductCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentMachineBoxesStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getCurrentMachineBoxesStateResponse")
    public JAXBElement<GetCurrentMachineBoxesStateResponse> createGetCurrentMachineBoxesStateResponse(GetCurrentMachineBoxesStateResponse value) {
        return new JAXBElement<GetCurrentMachineBoxesStateResponse>(_GetCurrentMachineBoxesStateResponse_QNAME, GetCurrentMachineBoxesStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMachinesWithTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.publicinterfaces.agimatec.com", name = "getMachinesWithTagResponse")
    public JAXBElement<GetMachinesWithTagResponse> createGetMachinesWithTagResponse(GetMachinesWithTagResponse value) {
        return new JAXBElement<GetMachinesWithTagResponse>(_GetMachinesWithTagResponse_QNAME, GetMachinesWithTagResponse.class, null, value);
    }

}
