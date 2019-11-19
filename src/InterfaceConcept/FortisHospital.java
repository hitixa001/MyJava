package InterfaceConcept;

//for class to class we use extends
//for class to interface we use implements.
//for interface to interface extends.

public class FortisHospital implements USmedical, UKmedical, INDIAmedical{

	@Override	//writing @Override is not compulsory but its a good practice
	public void embulanceServices() {
		System.out.println("FortisHospital --- embulanceServices");
		
	}

	@Override
	public void orthoservices() {
		System.out.println("FortisHospital --- orthoservices");
		
	}

	@Override
	public void pediatricianServices() {
		System.out.println("FortisHospital --- pediatricianServices");
		
	}
	@Override
	public void radiologyServices() {
		System.out.println("US --- radiologyServices ");
	}
	//@Override --here this billing method can be access as separate method.
	public static void billing() {
		System.out.println("US --- billing");
	}
	

	@Override
	public void dentalServices() {
		System.out.println("FortisHospital --- dentalServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FortisHospital --- physioServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FortisHospital --- emergencyServices");
		
	}

	@Override
	public void OPDservices() {
		System.out.println("FortisHospital --- OPDservices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FortisHospital --- cardioServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FortisHospital --- neuroServices");
		
	}
	
	//these are Forties hospital's own methods -- non-overridden method
	public void UrologyServices() {
		System.out.println("FortisHospital --- UrologyServices");
	}
	
	public void PathologyServices() {
		System.out.println("FortisHospital --- PathologyServices");
	}

	@Override
	public void polioServices() {
		System.out.println("WHO --- polioServices");
		
	}

	
	
}
