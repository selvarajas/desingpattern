/**
 * 
 */
package com.agimatec.publicinterfaces.service.impl;

/**
 * @author savarimuthu.s
 *
 */ 

import com.agimatec.publicinterfaces.service.CallerInfo;
import com.agimatec.publicinterfaces.service.CancelReservation;
import com.agimatec.publicinterfaces.service.CancelReservationResponse;
import com.agimatec.publicinterfaces.service.GetAllMachines;
import com.agimatec.publicinterfaces.service.GetAllMachinesResponse;
import com.agimatec.publicinterfaces.service.GetAvailableBoxSizes;
import com.agimatec.publicinterfaces.service.GetAvailableBoxSizesResponse;
import com.agimatec.publicinterfaces.service.GetAvailableFreeBoxesForMachine;
import com.agimatec.publicinterfaces.service.GetAvailableFreeBoxesForMachineResponse;
import com.agimatec.publicinterfaces.service.GetAvailableProductCodes;
import com.agimatec.publicinterfaces.service.GetAvailableProductCodesResponse;
import com.agimatec.publicinterfaces.service.GetAvailableTags;
import com.agimatec.publicinterfaces.service.GetAvailableTagsResponse;
import com.agimatec.publicinterfaces.service.GetCurrentMachineBoxesOverview;
import com.agimatec.publicinterfaces.service.GetCurrentMachineBoxesOverviewResponse;
import com.agimatec.publicinterfaces.service.GetCurrentMachineBoxesState;
import com.agimatec.publicinterfaces.service.GetCurrentMachineBoxesStateResponse;
import com.agimatec.publicinterfaces.service.GetMachineDetails;
import com.agimatec.publicinterfaces.service.GetMachineDetailsResponse;
import com.agimatec.publicinterfaces.service.GetMachineDetailsWithTagAndLifecycleStatus;
import com.agimatec.publicinterfaces.service.GetMachineDetailsWithTagAndLifecycleStatusResponse;
import com.agimatec.publicinterfaces.service.GetMachinesWithTag;
import com.agimatec.publicinterfaces.service.GetMachinesWithTagResponse;
import com.agimatec.publicinterfaces.service.PublicServiceException_Exception;
import com.agimatec.publicinterfaces.service.ReservationServiceException_Exception;
import com.agimatec.publicinterfaces.service.ReserveCompartment;
import com.agimatec.publicinterfaces.service.ReserveCompartmentResponse;
import com.agimatec.publicinterfaces.service.WSReservationService;
import com.agimatec.publicinterfaces.service.WSReservationService_Service;

/**
 * @author savarimuthu.s
 * 
 */
public class WSReservationServiceProxyClient implements
		WSReservationService {
	private WSReservationService_Service reservationService;
	
	public GetMachinesWithTagResponse getMachinesWithTag(
			GetMachinesWithTag parameters, CallerInfo callerInfo) {
		reservationService=new WSReservationService_Service();
		return reservationService.getWSReservationServiceImplPort().getMachinesWithTag(parameters, callerInfo);
	}

	public GetAvailableBoxSizesResponse getAvailableBoxSizes(
			GetAvailableBoxSizes parameters, CallerInfo callerInfo) {
		return reservationService.getWSReservationServiceImplPort().getAvailableBoxSizes(parameters, callerInfo);
	}

	public GetAvailableTagsResponse getAvailableTags(
			GetAvailableTags parameters, CallerInfo callerInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetCurrentMachineBoxesOverviewResponse getCurrentMachineBoxesOverview(
			GetCurrentMachineBoxesOverview parameters, CallerInfo callerInfo)
			throws PublicServiceException_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public CancelReservationResponse cancelReservation(
			CancelReservation parameters, CallerInfo callerInfo)
			throws ReservationServiceException_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ReserveCompartmentResponse reserveCompartment(
			ReserveCompartment parameters, CallerInfo callerInfo)
			throws ReservationServiceException_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public GetMachineDetailsWithTagAndLifecycleStatusResponse getMachineDetailsWithTagAndLifecycleStatus(
			GetMachineDetailsWithTagAndLifecycleStatus parameters,
			CallerInfo callerInfo) throws PublicServiceException_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public GetAvailableFreeBoxesForMachineResponse getAvailableFreeBoxesForMachine(
			GetAvailableFreeBoxesForMachine parameters, CallerInfo callerInfo)
			throws ReservationServiceException_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public GetAllMachinesResponse getAllMachines(GetAllMachines parameters,
			CallerInfo callerInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetCurrentMachineBoxesStateResponse getCurrentMachineBoxesState(
			GetCurrentMachineBoxesState parameters, CallerInfo callerInfo)
			throws PublicServiceException_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public GetAvailableProductCodesResponse getAvailableProductCodes(
			GetAvailableProductCodes parameters, CallerInfo callerInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetMachineDetailsResponse getMachineDetails(
			GetMachineDetails parameters, CallerInfo callerInfo)
			throws PublicServiceException_Exception {
		// TODO Auto-generated method stub
		return null;
	} }
