package j60iopackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

class FileFilterImpl implements FileFilter {

	private String ext = null;

	public FileFilterImpl(String ext) {
		this.ext = ext;
	}

	@Override
	public boolean accept(File pathname) {
		String fileName = pathname.getName();
		return fileName.endsWith(ext);
	}
}

class FileNameFilterImpl implements FilenameFilter {

	private String ext = null;

	public FileNameFilterImpl(String ext) {
		this.ext = ext;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(ext);
	}
}

public class Prog3ListingOnlyTxtFilesFromDir {

	public static void main(String[] args) {
		File dirPath = new File("C:\\Users\\Reddys\\Desktop");
		System.out.println(dirPath);

//		String[] files = dirPath.list(new FileNameFilterImpl("txt"));

		File[] files = dirPath.listFiles(new FileFilterImpl("txt"));

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
