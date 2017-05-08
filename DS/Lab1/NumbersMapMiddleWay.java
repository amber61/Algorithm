package first.lab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumbersMapMiddleWay {
    private Integer[] arr;
    private int size;
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public NumbersMapMiddleWay() {

    }

    public NumbersMapMiddleWay(int size) {
	this.size = size;
	this.arr = new Integer[size];
    }

    public void generateNumbers() {
	Random random = new Random();
	for (int i = 0; i < size; i++) {
	    int counter = 0;
	    arr[i] = random.nextInt(100);
	    map.put(arr[i], ++counter);
	}
    }

    public int count(int value) {
	if (map.containsKey(value))
	    return map.get(value);
	else
	    return 0;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();
	for (int element : arr) {
	    str.append(element).append(" ");
	}
	return str.toString();
    }
}
