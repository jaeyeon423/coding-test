package level0;

public class Test44 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 1},
                         {0, 1, 0, 1, 0},
                         {0, 1, 0, 0, 0},
                         {0, 0, 1, 0, 0},
                         {0, 1, 0, 0, 0}};
        
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        
        int width = board.length;
        int height = board[0].length;

        int[][] check_board = new int[height][width];

        for(int i = 0 ; i < height ; i ++){
            for(int j = 0 ; j < width; j++){
                if(board[j][i] == 1){
                    check_board[j][i] = 1;
                    for(int k = 0 ; k < 8 ; k++){
                        int x = j + dx[k];
                        int y = i + dy[k];

                        if(x >= 0 && x < width && y >= 0 && y < width){
                            check_board[x][y] = 1;
                        }
                    }
                }
            }

        }
        int answer = 0;
        for(int y = 0 ; y < height; y++){
            for(int x = 0 ; x < width ; x++){
                System.out.print(check_board[y][x] + " ");
                if(check_board[y][x] == 0)
                    answer++;
            }
            System.out.println();
        }
        
    }
}
