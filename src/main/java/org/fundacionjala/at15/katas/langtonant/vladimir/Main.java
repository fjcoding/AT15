package org.fundacionjala.at15.katas.langtonant.vladimir;

import java.util.*;

public class Main {
private static String[][] mat;
private static final int COLS = 11;
private static final int ROWS = 11;
private static final int POSCOL = 5;
private static final int POSROW = 5;
private static final int REP = 10;
private static int posCol = POSCOL;
private static int posRow = POSROW;
private static int rep = REP;
public static void main(String[] args) {
mat = new String[COLS][ROWS];
for (int cols = 0; cols < COLS; cols++) {
for (int rows = 0; rows < ROWS; rows++) {
mat[cols][rows] = "W";
}
}
String dir = "U";
for (int i = 0; i < rep; i++)
{
	if (mat[posCol][posRow] == "W")
	{
		switch (dir)
		{
			case "U":
				dir = "R";
				mat[posCol][posRow] = "B";
				posRow += 1;
				break;
			case "D":
				dir = "L";
				mat[posCol][posRow] = "B";
				posRow -= 1;
				break;
			case "L":
				dir = "U";
				mat[posCol][posRow] = "B";
				posCol -= 1;
				break;
			case "R":
				dir = "D";
				mat[posCol][posRow] = "B";
				posCol += 1;
				break;
		}
	}
	else if (mat[posCol][posRow] == "B")
	{
		switch (dir)
		{
			case "U":
				dir = "L";
				mat[posCol][posRow] = "W";
				posRow -= 1;
				break;
			case "D":
				dir = "R";
				mat[posCol][posRow] = "W";
				posRow += 1;
				break;
			case "L":
				dir = "D";
				mat[posCol][posRow] = "W";
				posCol += 1;
				break;
			case "R":
				dir = "U";
				mat[posCol][posRow] = "W";
				posCol -= 1;
				break;
		}
	}
	print(COLS,ROWS);
}
}
	private static void print(int x, int y)
		{
			for (int i = 0; i < x; i++)
			{
				for (int j = 0; j < y; j++)
				{
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------");
			System.out.println();

		}
}

