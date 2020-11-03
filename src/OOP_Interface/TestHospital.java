//***************** Nov 2-p5*******************
package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh=new FortisHospital();
		fh.audiologyServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.audiologyServices();
		fh.oncologyServices();
		fh.OPDServices();//independent method
		fh.neuroServices();//independent method
		fh.pathalogy();
		USMedical.minFee();
		System.out.println(USMedical.admission_fee);
		//USMedical.admission_fee=100;
		
		
		
		//Top casting
		USMedical us=new FortisHospital();
		//WebDriver dr=new ChromeDriver();
		us.audiologyServices();
		us.emergencyServices();
		us.orthoServices();
		us.physioServices();
		
		//Cant create object of an interface
		//new USMedical();
		
		UKMedical uk=new FortisHospital();
		uk.emergencyServices();
		uk.ENTServices();
		uk.gyncServices();
		
		//down casting
		//FortisHospital fhh=(FortisHospital)new UKMedical(); 
		
		
	}

}
