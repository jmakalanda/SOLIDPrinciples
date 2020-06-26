package julz.solidgood.openclose;

public class ClaimApprovalManagerTest {

    @org.junit.Test
    public void processClaim() {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();

        ClaimApprovalManager claim1 = new ClaimApprovalManager();

        claim1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();

        ClaimApprovalManager claim2 = new ClaimApprovalManager();

        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}