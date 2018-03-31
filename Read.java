package M1;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFileChooser;

public class Read {
	
	public void readFile() {
		String path="";
		JFileChooser file=new JFileChooser();
		int returned = file.showOpenDialog(null);
		if(returned==JFileChooser.APPROVE_OPTION)
		 path=file.getSelectedFile().getAbsolutePath();
		try {
			FileReader f= new FileReader(path);
		}
		catch(FileNotFoundException e ) {
			System.out.println("Wrong format, or missing File");
		}
		PdfWriter.getInstance()
	}

}
