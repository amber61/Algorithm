package first.assignment1;

import java.util.Scanner;

public class Frame {

	private String portCode;
	private MACAddress destMacAddress;
	private MACAddress srcMacAddress;
	private String frameData;

	public Frame() {
		this.portCode = new String();
		this.destMacAddress = new MACAddress();
		this.srcMacAddress = new MACAddress();
		this.frameData = new String();
	}

	@SuppressWarnings("resource")
	public boolean readFrame(Scanner input) { // ???
		boolean isOK = true;
		portCode = input.next();

		isOK = destMacAddress.readAddress(input);
		if (isOK) {
			isOK = srcMacAddress.readAddress(input);
			if (isOK)
				frameData = input.next();
		}
		return isOK;
	}

	public String getPortCode() {
		return portCode;
	}

	public MACAddress getDestMacAddress() {
		return destMacAddress;
	}

	public MACAddress getSrcMacAddress() {
		return srcMacAddress;
	}

	public String getFrameData() {
		return frameData;
	}

	public String toString() {
		return "Port: " + portCode + ", destMacAddress: " + destMacAddress + ", srcMacAddress: " + srcMacAddress
				+ ", FrameData: " + frameData;
	}

}
