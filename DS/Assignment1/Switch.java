package first.assignment1;

/**
 * It represents the switch.
 * 
 * @author ZHE
 *
 */
public class Switch {

	private SwitchEntry[] camTable;
	private int camTableNum;
	private int camTableMaxNum;

	public Switch() {
		this.camTable = new SwitchEntry[100];
		this.camTableNum = 0;
		this.camTableMaxNum = 100;
		System.out.println("The size of cam table is " + camTableMaxNum);
	}

	public Switch(int camTableMaxNum) {
		this.camTable = new SwitchEntry[camTableMaxNum];
		this.camTableNum = 0;
		this.camTableMaxNum = camTableMaxNum;
		System.out.println("The size of cam table is " + camTableMaxNum);
	}

	public void displayTable() {
		for (int i = 0; i < camTableNum; i++)
			System.out.println(camTable[i]);
	}

	public void processFrame(Frame frame) {
		MACAddress frameSrcAddress = frame.getSrcMacAddress();
		String framePortCode = frame.getPortCode();
		int foundSrc = find(frameSrcAddress);
		if (foundSrc == -1) {
			if (camTableNum >= camTableMaxNum) {
				System.out.println("The cam table is full, cannot add more.");
			} else {
				camTable[camTableNum++] = new SwitchEntry(frameSrcAddress, framePortCode);
				System.out.println("Add the source address " + frameSrcAddress + " and the port " + framePortCode
						+ " to the cam table.");
			}
		} // not found src add in cam, to add it

		MACAddress frameDestAddress = frame.getDestMacAddress();
		int foundDest = find(frameDestAddress);
		if (foundDest != -1) {
			System.out.println("It is sending the data " + frame.getFrameData() + " from the source address "
					+ frameSrcAddress + " to the destination address " + frameDestAddress + " out port "
					+ camTable[foundDest].getPort());
		} else {
			System.out.println("It is flooding the data " + frame.getFrameData() + " from the source address "
					+ frameSrcAddress + " to the destination address " + frameDestAddress + " out all ports");
		}
	}

	public int find(MACAddress macAddress) {
		int found = -1;
		for (int i = 0; i < camTableNum; i++) {
			if (camTable[i].getAddress().isEqual(macAddress))
				return i;
		}
		return found;
	}

}
