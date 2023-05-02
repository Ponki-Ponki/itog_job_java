import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterAdd {

	String path;

	public WriterAdd(String path) {
		this.path = path;
		String pathProject = System.getProperty("user.dir");
		path = pathProject.concat("/" + path);
	}

	public void saveData(Toy item) throws FileNotFoundException {
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(path, true));
			pw.println(item.toString());
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
