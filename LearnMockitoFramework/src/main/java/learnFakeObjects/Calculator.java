package learnFakeObjects;

public class Calculator {
	
	
	CalService service;
	
//	DBService dbService;
	
	public Calculator(CalService service) {
	
		this.service = service;
	}
	
	public int add() {
		
		return (service.inputX()+service.inputY())*2;
	
	}
	
	
	
	
}
