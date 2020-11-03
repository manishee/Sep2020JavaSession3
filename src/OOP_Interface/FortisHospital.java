//***************** Nov 2-p4*******************
package OOP_Interface;

public class FortisHospital extends CentralizedHospital
							implements USMedical, UKMedical, IndianMedical{

	//US Medical
	@Override
	public void orthoServices() {
		System.out.println("FortisHospital -- orthoServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FortisHospital -- physioServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FortisHospital -- emergencyServices");
	}

	@Override
	public void audiologyServices() {
		System.out.println("FortisHospital -- audiologyServices");
	
	//UKMedical	
	}
	@Override
	public void ENTServices() {
		System.out.println("FortisHospital -- ENTServices");
		
	}

	@Override
	public void gyncServices() {
		System.out.println("FortisHospital -- gyncServices");
		
	}

	//IndianMedical
	@Override
	public void oncologyServices() {
	
		System.out.println("FortisHospital -- oncologyServices");
	}

	@Override
	public void pediaServices() {

		System.out.println("FortisHospital -- pediaServices");
	}
	
	//non-overridden or non- implemented methods
	public void OPDServices() {
		System.out.println("FortisHospital -- OPDServices");
	}
	
	public void neuroServices() {
		System.out.println("FortisHospital -- neuroServices");
	}

	@Override
	public void covidTest() {
		System.out.println("FortisHospital -- covidTest");
	}

	@Override
	public void pandemicControl() {
		System.out.println("FortisHospital -- pandemicControl");
	}
	

}
