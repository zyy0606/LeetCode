public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> row=new HashSet<Character>();
            HashSet<Character> col=new HashSet<Character>();
            HashSet<Character> cube=new HashSet<Character>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&&!row.add(board[i][j])) return false;
                if(board[j][i]!='.'&&!col.add(board[j][i])) return false;
                int cubeRow=i/3*3+j/3;
                int cubeCol=(i*3)%9+j%3;
                if(board[cubeRow][cubeCol]!='.'&&!cube.add(board[cubeRow][cubeCol])) return false;
            }
        }
        return true;
    }
}