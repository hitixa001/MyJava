package InterfaceConcept;

public class TestHospital extends FortisHospital{

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital();
		fs.cardioServices();
		fs.dentalServices();
		fs.embulanceServices();
		fs.emergencyServices();
		fs.neuroServices();
		fs.OPDservices();
		fs.orthoservices();
		fs.PathologyServices();
		fs.pediatricianServices();
		fs.physioServices();
		fs.UrologyServices();
		fs.radiologyServices();
		fs.polioServices();
		
		System.out.println("****************************************************************************************************");
		
		//Top-Casting (childclass object) --here we cannot access any other services apart from USmedical -- the reason is ref. type signature check
		USmedical us= new FortisHospital();
		us.embulanceServices();
		us.orthoservices();
		us.pediatricianServices();
		us.radiologyServices();
		USmedical.billing(); 	//directly calling by interface name because you can not create object for this.
		System.out.println(USmedical.min_fee);
		
		System.out.println("****************************************************************************************************");
		UKmedical uk = new FortisHospital();
		uk.dentalServices();
		uk.emergencyServices();
		uk.physioServices();
		
		//here strictly not possible Down-Casting even at the compile time also.(because not possible to create object of interface)
		
		
	}

}
