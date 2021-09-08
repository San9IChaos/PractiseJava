package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code he
short z[][] = new short[5][];
z[0] = new short[5];
z[1] = new short[4];
z[2] = new short[2];
z[3] = new short[3];
z[4] = new short[1];

short cnt = 1;
for (int i=0; i<z.length; i++)
    for(int j=0; j<z[i].length; j++){
        z[i][j] = cnt;
        cnt++;
    }
for(int i =0; i<z.length; i++){
    for (short val : z[i])
        System.out.print(val + " ");

    System.out.print("\n");
}
    }
    }

