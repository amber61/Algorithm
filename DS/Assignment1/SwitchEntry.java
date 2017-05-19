package first.assignment1;

public class SwitchEntry {

	private MACAddress destMacAddress;
	private String portCode;

	public SwitchEntry() {
		this.destMacAddress = new MACAddress();
		this.portCode = new String();
	}

	public SwitchEntry(MACAddress destMacAddress, String portCode) {
		this.destMacAddress = destMacAddress;
		this.portCode = portCode;
	}

	public String toString() {
		return "Port: " + portCode + ", MacAddress: " + this.destMacAddress.toString();

	}

	public boolean isEqual(MACAddress destMacAddress) {
		return this.destMacAddress.equals(destMacAddress);
	}

	public MACAddress getAddress() {
		return destMacAddress;
	}

	public String getPort() {
		return portCode;
	}

}
