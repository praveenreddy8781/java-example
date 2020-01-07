package j60iopackage;

import java.io.File;

public class Prog2ListFilesAndDirectories {

	public static void main(String[] args) {

		File dirPath = new File("C:\\Users\\Reddys\\Desktop");
		System.out.println(dirPath);

		if (dirPath.isDirectory()) {
			String[] arrayOfFilesOrSubDir = dirPath.list();

			for (String filesOrSubDirPath : arrayOfFilesOrSubDir) {
				File fileOrDir = new File(dirPath + "/" + filesOrSubDirPath);
				if (fileOrDir.isDirectory()) {
					System.out.println(filesOrSubDirPath + " is a directory");
				} else {
					System.out.println(filesOrSubDirPath + " is a file");
				}

			}
		}
	}
}
