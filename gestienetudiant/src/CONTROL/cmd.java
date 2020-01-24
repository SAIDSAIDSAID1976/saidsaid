package CONTROL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cmd {
	
	    public static void main(String[] args) throws Exception {
	        ProcessBuilder builder = new ProcessBuilder(  "cmd.exe", "/c", "cd \"C:\" && dir");
	        builder.redirectErrorStream(true);
	        Process p = builder.start();
	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        String line;
	        while (true) {
	            line = r.readLine();
	            if (line == null) { break; }
	            System.out.println(line);
	        }
	    }
	
}
