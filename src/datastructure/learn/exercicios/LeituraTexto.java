package datastructure.learn.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraTexto {
    public static String decode(String messageFile) {
        List<String> pyramid = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(messageFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s");
                pyramid.add(parts[1]);
            }
        } catch (IOException e) {
            System.out.printf("ERRO: " + e.getMessage());
        }
        List<String> decodedWords = new ArrayList<>();
        int index = 0;
        for (int i = 1; index < pyramid.size(); i++) {
            decodedWords.add(pyramid.get(index));
            index += i;
        }
        return String.join(" ", decodedWords);
    }

    public static void main(String[] args) {
        String filePath = "/Users/victorleandro/Desktop/texto-teste.txt"; // Replace with the actual path to your file
        String result = decode(filePath);
        System.out.println("MENSAGEM: " + result);
    }

}
