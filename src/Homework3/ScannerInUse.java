package Homework3;

public class ScannerInUse {
	public String getScannerUse(String age) {
		String whatage = "";
		switch (age) {
		
		case "10": whatage = "Innocent"; break;
		case "20": whatage = "suffering to understand"; break;
		case "30": whatage = "more pain"; break;
		case "40": whatage = "Understand life"; break;
		case "50": whatage = "worry about financial needs"; break;
		case "60": whatage = "Can't workout much"; break;
		case "70": whatage = "often sick"; break;
		case "80": whatage = "very tired"; break;
		case "90": whatage = "too tired to do anyhting"; break;
		case  "100": whatage = "waiting to meet God"; break;
		default: whatage = "Life, Death, Hereater: Type your age"; break;
		
		}
		return whatage;
	}

}
