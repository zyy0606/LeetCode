public class Solution {
    public int islandPerimeter(int[][] grid) {
        int permeter = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    if(i==0 || grid[i-1][j] == 0) permeter++;
                    if(i==n-1 || grid[i+1][j] == 0) permeter++;
                    if(j==0 || grid[i][j-1] == 0) permeter++;
                    if(j==m-1 || grid[i][j+1] == 0) permeter++;
                }
            }
        }
        return permeter;
    }
}


public class Solution2 {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            if (grid[i][j] == 0) {
                continue;
            }

            if (grid[i][j] == 1) {
                perimeter += 4;

                if (i > 0 && grid[i - 1][j] == 1)
                    perimeter -= 2;

                if (j > 0 && grid[i][j - 1] == 1)
                    perimeter -= 2;
            }
        }
    }
    return perimeter;
    }
}