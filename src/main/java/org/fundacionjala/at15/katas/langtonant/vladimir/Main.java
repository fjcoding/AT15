package org.fundacionjala.at15.katas.langtonant.vladimir;

import java.util.*;

public class Main {
private static String[][] mat;
private static final int COLS = 11;
private static final int ROWS = 11;
public static void main(String[] args) {
mat = new String[COLS][ROWS];
for (int cols = 0; cols < COLS; cols++)
{
		for (int j = 0; j <ROWS; j++)
		{
			mat[cols][j] = "W";
		}
}
int posx = 5;
int posy = 5;
String dir = "U";
int rep = 10;
for (int i = 0; i < rep; i++)
{
	if (mat[posx][posy] == "W")
	{
		switch (dir)
		{
			case "U":
				dir = "R";
				mat[posx][posy] = "B";
				posy += 1;
				break;
			case "D":
				dir = "L";
				mat[posx][posy] = "B";
				posy -= 1;
				break;
			case "L":
				dir = "U";
				mat[posx][posy] = "B";
				posx -= 1;
				break;
			case "R":
				dir = "D";
				mat[posx][posy] = "B";
				posx += 1;
				break;
		}
	}
	else if (mat[posx][posy] == "B")
	{
		switch (dir)
		{
			case "U":
				dir = "L";
				mat[posx][posy] = "W";
				posy -= 1;
				break;
			case "D":
				dir = "R";
				mat[posx][posy] = "W";
				posy += 1;
				break;
			case "L":
				dir = "D";
				mat[posx][posy] = "W";
				posx += 1;
				break;
			case "R":
				dir = "U";
				mat[posx][posy] = "W";
				posx -= 1;
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

