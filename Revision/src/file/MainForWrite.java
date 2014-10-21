package file;

public class MainForWrite
{
	public static void main(String[] args) {
		WriteIntoAFile cF=new WriteIntoAFile();
		
		cF.openFile();
		cF.addToFile();
		cF.again();
	}
}
