package org.example;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {
        String archName="C:\\Users\\sleep\\Downloads\\3001НС.zip";

        List<String> fileNames=unZip(archName);
        List<String> mainMass;
        for (int f=0;f<fileNames.size();f++){
            mainMass=getData(fileNames.get(f));
            if(fileNames.get(f).contains("ZR9")){
                String[] temp=mainMass.get(mainMass.size()-1).split("\\|");
                String kbk=temp[3];
                System.out.println(kbk);
                List<Integer> indexesOfZR=new ArrayList<>();
                for (int i=0;i<mainMass.size();i++){
                    if(mainMass.get(i).contains("ZR|")){
                        indexesOfZR.add(i);
                    }
                }
                if (archName.contains("алименты")){
                    //TODO
                }
                else {
                for (int i=1;i<indexesOfZR.size();i++) {
                    String[] targetString = mainMass.get(indexesOfZR.get(i - 1)).split("\\|");
                    if (i % 2 != 0) {
                        if (archName.contains("осужденный")) {
                            //TODO
                        } else {
                            //TODO
                            // изменить строку по кбк
                    }
                }
                    else {
                        //TODO
                        // изменить строку 29 по кбк + 'n'
                        }
                    String editedStringWithZR="";
                    for (String str: targetString){
                        editedStringWithZR=editedStringWithZR+str+"|";
                    }
                    editedStringWithZR=editedStringWithZR+"|||||";
                    System.out.println(editedStringWithZR);
                    mainMass.set(indexesOfZR.get(i-1),editedStringWithZR);
                    }
                }

            }
        }
    }
public static List<String> unZip(String archName){// распаковка архива
        try {
            ZipInputStream zin = new ZipInputStream(new FileInputStream(archName), Charset.forName("windows-1251"));
            ZipEntry entry;
            List<String> fileNames=new ArrayList<>();
            int numDoc=0;
            while ((entry = zin.getNextEntry()) != null) {
                if (entry.getName().contains("ZR")){
                    fileNames.add(entry.getName());
                }
                else {
                    fileNames.add(entry.getName());
                }
                FileOutputStream fout = new FileOutputStream(fileNames.get(numDoc));
                numDoc=numDoc+1;
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
            }
            return fileNames;
        }
        catch (Exception e){
        return null;
        }
    }
    public static List<String> getData(String fileName) {
        try {
        List<String> list=new ArrayList<>();
        BufferedReader br;
        String line;
        br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "windows-1251"));
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        return list;}
        catch (Exception e){
            return null;
        }
    }
}