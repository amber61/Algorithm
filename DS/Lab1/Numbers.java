package first.lab1;

import java.util.Random;

public class Numbers {

    private Integer[] arr;
    private int size;
    private int[] counter = new int[100];

    public Numbers() {

    }

    public Numbers(int size) {
	this.size = size;
	this.arr = new Integer[size];
    }

    public void generateNumbers() {
	Random random = new Random();
	int randomNum = 0;
	for (int i = 0; i < size; i++) {
	    randomNum = random.nextInt(100);
	    arr[i] = randomNum;
	    counter[randomNum]++;
	}
    }

    public int count(int value) {
	long startTime = System.currentTimeMillis();

	int count = 0;
	for (int element : arr) {
	    if (element == value) {
		count++;
	    }
	} // The slowest way to searching number

	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println(totalTime);
	return count;
    }

    public int countFastest(int value) {
	long startTime = System.currentTimeMillis();

	int count = counter[value]; // fastest way to count number of occurrence
				    // based on a prepared array counter
	// This way is a typical map, is used when the key has limited value and
	// sequentially, like between 1 and 100

	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println(totalTime);
	return count;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();
	for (int element : arr) {
	    str.append(element).append(" ");
	}
	return str.toString();
    }

}
