package com.company;
import DAL.DataSeed;
import Business.Library;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Library library = new Library();
        DataSeed dataSeed = new DataSeed();
        dataSeed.SeedData();
        library.Init();
    }

}
