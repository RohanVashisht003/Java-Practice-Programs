package Practice_Recursion;

public class mazePath {

	public static void maze(int currRow, int currCol,int endRow, int endCol, String ans) {
		if(currRow==endRow && currCol==endCol) {
			System.out.println(ans);
			return;
		}
		if(currCol>endCol || currRow>endRow) {
			return;
		}
		maze(currRow,currCol+1,endRow,endCol,ans+"H" );
		maze(currRow+1,currCol,endRow,endCol,ans+"V" );
		
//		forDiagonal
//		maze(currRow+1, currCol+1, endRow, endCol, ans+"D");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
maze(0, 0, 2, 2, "");
	}

}
