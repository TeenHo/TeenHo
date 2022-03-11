package my_lessons;

public class random_maze {

	public static void main(String[] args) {
		//length of the maze
		int a = 30;
		//width of the maze
		int b = 30;
		String[][] maze = new String[a][b];
		String[] element1 = new String[] {"+", "-", "|", " "};
		String[] element2 = new String[] {"+", "-"};
		String[] element3 = new String[] {"-", " "};
		String[] element4 = new String[] {"|", "+"};
		String[] element5 = new String[] {"|", " "};
	
		//generation start element of the maze
		maze[0][0] = element1[(int)(Math.random() * 10) / 3];
		System.out.print(maze[0][0]);
		
		//generation first row of the maze
		for (int i = 1; i < a; i++) {
			if (maze[i - 1][0] == " ")
				maze[i][0] = "+";
			else if (maze[i - 1][0] == "|")
				maze[i][0] = " ";
			else if (maze[i - 1][0] == "-")
				maze[i][0] = element2[(int)(Math.random() * 10) / 5];
			else if (maze[i - 1][0] == "+")
				maze[i][0] = element3[(int)(Math.random() * 10) / 5];
			System.out.print(maze[i][0]);
		}
		
		System.out.println();
		
		//generation first column of the maze
		for (int j = 1; j < b; j++) {
			if (maze[0][j - 1] == " ")
				maze[0][j] = element2[(int)(Math.random() * 10) / 5];
			else if (maze[0][j - 1] == "|")
				maze[0][j] = element4[(int)(Math.random() * 10) / 5];
			else if (maze[0][j - 1] == "-")
				maze[0][j] = " ";
			else if (maze[0][j - 1] == "+")
				maze[0][j] = element5[(int)(Math.random() * 10) / 5];
		}
		
		//generation others elements of the maze
		for (int j = 1; j < b; j++) {
			for (int i = 0; i < a; i++) {
				if (i > 0) {
					if (maze[i][j - 1] == " ") {
						if (maze[i - 1][j] == " ") {
							if (maze[i - 1][j - 1] == " ")
								maze[i][j] = "+";
							else
								maze[i][j] = " ";
						}
						else if (maze[i - 1][j] == "|")
							maze[i][j] = " ";
						else if (maze[i - 1][j] == "-")
							maze[i][j] = element2[(int)(Math.random() * 10) / 5];
						else if (maze[i - 1][j] == "+")
							maze[i][j] = element3[(int)(Math.random() * 10) / 5];
					}
					
					else if (maze[i][j - 1] == "|") {
						if (maze[i - 1][j] == " ")
							maze[i][j] = element4[(int)(Math.random() * 10) / 5];
						else if (maze[i - 1][j] == "|")
							maze[i][j] = "|";
						else
							maze[i][j] = "+";
					}
					
					else if (maze[i][j - 1] == "-") {
						if (maze[i - 1][j] == "-")
							maze[i][j] = "-";
						else
							maze[i][j] = " ";
					}
					
					else if (maze[i][j - 1] == "+"){
						if (maze[i - 1][j] == " ")
							maze[i][j] = element5[(int)(Math.random() * 10) / 5];
						else if (maze[i - 1][j] == "|")
							maze[i][j] = " ";
						else
							maze[i][j] = "+";		
					}
				}
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}

	}

}
