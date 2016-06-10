# javarepo

Project Desc:
This is to generate the client based on the wsdl file given.
This approach is based on the JAXWS based WS client generation.

Steps:

1. Create a src folder
2. Create a wsdl folder under src

or Run maven goal >> mvn:generated-soruces

3. Copy the wsdl file in to your/project/path/src/wsdl/file.wsdl
4. Make sure that, pom.xml file should be in the root of the project
5. run maven clean through eclipse
6. run maven install through eclipse
7. On eclipse, select the pom.xml file >> run as >> maven build.. >> enter goals "jaxws:wsimport" >> click "Run"
7. For security reason, the xxxx, yyyy arepart of package, CCCC=prefix of the project and yyyy=
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for com.xxxx.wsdl.client.tutorial:xxxx-wsdl-client-tutorial:jar:0.0.1-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 55, column 12
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] Using the builder org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder with a thread count of 1
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building xxxx-wsdl-client-tutorial 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[WARNING] The POM for com.sun.istack:istack-commons-runtime:jar:1.1 is missing, no dependency information available
[WARNING] The POM for woodstox:wstx-asl:jar:3.2.1 is missing, no dependency information available
[INFO] 
[INFO] --- jaxws-maven-plugin:2.4.1:wsimport (default-cli) @ born-wsdl-client-tutorial ---
[INFO] Processing: file:/D:/users/CCCC/git/javarepo/src/wsdl/WSReservationService.wsdl
[WARNING] Using platform encoding (Cp1252), build is platform dependent!
[INFO] jaxws:wsimport args: [-keep, -s, 'D:\users\CCCC\git\javarepo\src\main\java', -d, 'D:\users\CCCC\git\javarepo\target\classes', -verbose, -extension, -Xnocompile, "file:/D:/users/CCCC/git/javarepo/src/wsdl/WSReservationService.wsdl"]
parsing WSDL...



Generating code...

com\yyyy\publicinterfaces\service\BoxSize.java
com\yyyy\publicinterfaces\service\CallerInfo.java
com\yyyy\publicinterfaces\service\CancelReservation.java
com\yyyy\publicinterfaces\service\CancelReservationResponse.java
com\yyyy\publicinterfaces\service\ComfortZone.java
com\yyyy\publicinterfaces\service\DeviceType.java
com\yyyy\publicinterfaces\service\DtAddress.java
com\yyyy\publicinterfaces\service\DtAvailableBoxes.java
com\yyyy\publicinterfaces\service\DtBox.java
com\yyyy\publicinterfaces\service\DtBoxGroup.java
com\yyyy\publicinterfaces\service\DtDeliveryMachine.java
com\yyyy\publicinterfaces\service\DtDevice.java
com\yyyy\publicinterfaces\service\DtMachineAddress.java
com\yyyy\publicinterfaces\service\DtMachineBoxesOverview.java
com\yyyy\publicinterfaces\service\DtMachineProperty.java
com\yyyy\publicinterfaces\service\DtReservation.java
com\yyyy\publicinterfaces\service\DtTag.java
com\yyyy\publicinterfaces\service\GetAllMachines.java
com\yyyy\publicinterfaces\service\GetAllMachinesResponse.java
com\yyyy\publicinterfaces\service\GetAvailableBoxSizes.java
com\yyyy\publicinterfaces\service\GetAvailableBoxSizesResponse.java
com\yyyy\publicinterfaces\service\GetAvailableFreeBoxesForMachine.java
com\yyyy\publicinterfaces\service\GetAvailableFreeBoxesForMachineResponse.java
com\yyyy\publicinterfaces\service\GetAvailableProductCodes.java
com\yyyy\publicinterfaces\service\GetAvailableProductCodesResponse.java
com\yyyy\publicinterfaces\service\GetAvailableTags.java
com\yyyy\publicinterfaces\service\GetAvailableTagsResponse.java
com\yyyy\publicinterfaces\service\GetCurrentMachineBoxesOverview.java
com\yyyy\publicinterfaces\service\GetCurrentMachineBoxesOverviewResponse.java
com\yyyy\publicinterfaces\service\GetCurrentMachineBoxesState.java
com\yyyy\publicinterfaces\service\GetCurrentMachineBoxesStateResponse.java
com\yyyy\publicinterfaces\service\GetMachineDetails.java
com\yyyy\publicinterfaces\service\GetMachineDetailsResponse.java
com\yyyy\publicinterfaces\service\GetMachineDetailsWithTagAndLifecycleStatus.java
com\yyyy\publicinterfaces\service\GetMachineDetailsWithTagAndLifecycleStatusResponse.java
com\yyyy\publicinterfaces\service\GetMachinesWithTag.java
com\yyyy\publicinterfaces\service\GetMachinesWithTagResponse.java
com\yyyy\publicinterfaces\service\MachineConstructionType.java
com\yyyy\publicinterfaces\service\MachineLifecycleStatus.java
com\yyyy\publicinterfaces\service\MachineLocationType.java
com\yyyy\publicinterfaces\service\ObjectFactory.java
com\yyyy\publicinterfaces\service\PublicServiceException.java
com\yyyy\publicinterfaces\service\PublicServiceException_Exception.java
com\yyyy\publicinterfaces\service\ReservationServiceException.java
com\yyyy\publicinterfaces\service\ReservationServiceException_Exception.java
com\yyyy\publicinterfaces\service\ReserveCompartment.java
com\yyyy\publicinterfaces\service\ReserveCompartmentResponse.java
com\yyyy\publicinterfaces\service\TagType.java
com\yyyy\publicinterfaces\service\WSReservationService.java
com\yyyy\publicinterfaces\service\WSReservationService_Service.java
com\yyyy\publicinterfaces\service\package-info.java
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 5.157 s
[INFO] Finished at: 2016-06-08T14:03:25+05:30
[INFO] Final Memory: 7M/123M
[INFO] ------------------------------------------------------------------------
