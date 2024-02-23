package model.entities;

public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public String print(String doc) {
		return "Combo printing" + doc;
	}

}
