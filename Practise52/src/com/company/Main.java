package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
    //Создаём file
		FileWriter fw = new FileWriter("file.txt");
		fw.write("линия");
		fw.write("ещё одна линия");
		fw.write("и ещё одна линия");
		fw.write("линий много не бывает");
		fw.close();
	//Читаем file
		List<String> lines = new ArrayList<>();
		Path path = Paths.get("file.txt");
		try(Stream<String> fileStream = Files.newBufferedReader(path).lines()){
			lines = fileStream.collect(Collectors.toList());
		}
		catch (IOException ignored){}
		System.out.println(lines);

    }
}
