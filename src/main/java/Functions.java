import java.io.*;
import java.util.*;

public class Functions
{
    private static final int ARR_SIZE = 1000000;
    private int[] arr;
    private int size;
    
	Functions(String[] args) {
        try {
            init(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private void init(String filename) throws Exception {
	    
	    File file = new File(filename);
        if (!file.isFile()) {
            throw new Exception("File doesn't exist!");
        }
        
        Scanner scanner = new Scanner(file);
        
        arr = new int[ARR_SIZE];
        size = 0;
        while(scanner.hasNextInt())
        {
            arr[size++] = scanner.nextInt();
        }
	}
	
	public int _max() {
	    int _max = arr[0];
	    for (int i = 1; i < size; ++i) _max = Math.max(_max, arr[i]);
	    return _max;
	}
	
    public int _min() {
        int _min = arr[0];
	    for (int i = 1; i < size; ++i) 
	        _min = Math.min(_min, arr[i]);
        return _min;
        
    }
    public int _sum() throws Exception{
        long _sum = 0;
        for (int i = 0; i < size; ++i) {
            _sum += arr[i];
            if (_sum > Integer.MAX_VALUE) throw new Exception("Overflow!");
        }
        return (int)_sum;
    }
    
    public int _mult() throws Exception{
        long _mult = 1;
        for (int i = 0; i < size; ++i) {
            _mult *= arr[i];
            if (_mult > Integer.MAX_VALUE) throw new Exception("Overflow!");
        }
        return (int)_mult;
    }
}
