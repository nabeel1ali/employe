package com.learning.employe.controller;

import java.io.File;

public class FileCheckController {

	public String checkFile(String filename) {
		String directoryPath = "C:\\employe";

		File directory = new File(directoryPath);
		File[] files = directory.listFiles();

		if (files != null) {
			for (File file : files) {
				if (file.exists()) {
					String fname = file.getName();
					final int dotIndex = fname.lastIndexOf(".");
					if (dotIndex != -1) {
						fname = fname.substring(0, dotIndex);
					}

					if (fname.equals(filename)) {
						return "File " + file.getName() + " exists in the directory for match \"" + filename + "\".";
					}
				}
			}
			return "File " + filename + " does not exist in the directory.";
		} else {
			return "Directory does not exist or is not a directory.";
		}
	}

	public static void main(String[] args) {
		FileCheckController checkController = new FileCheckController();
		System.out.println(checkController.checkFile("Abc"));
	}
}
