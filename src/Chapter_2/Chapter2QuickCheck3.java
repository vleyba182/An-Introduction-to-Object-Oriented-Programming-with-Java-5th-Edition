package Chapter_2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Chapter2QuickCheck3 {

	public static void main(String[] args) {

		Date             today;
	    SimpleDateFormat sdf;
	    
	    today = new Date( );
	    sdf = new SimpleDateFormat("MM-dd-yyyy");
	    System.out.println(sdf.format(today));
		
	}
}

