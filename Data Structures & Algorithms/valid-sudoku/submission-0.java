class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashMap<Integer,HashSet<Character>>r=new HashMap<>();
    HashMap<Integer,HashSet<Character>>c=new HashMap<>();
    HashMap<String,HashSet<Character>>rc=new HashMap<>();
    for(int i=0; i<board.length;i++)
    {   
        
        for(int j=0;j<board[i].length;j++)
        {
            if(board[i][j]=='.')
            {
                continue;
            }
            String rck= (i/3)+"-"+(j/3);
            if((r.containsKey(i) && r.get(i).contains(board[i][j])) || (c.containsKey(j) && c.get(j).contains(board[i][j]))||(rc.containsKey(rck) && rc.get(rck).contains(board[i][j])))
            {
                return false;
            }
            r.computeIfAbsent(i,k->new HashSet<>()).add(board[i][j]);
            c.computeIfAbsent(j,k->new HashSet<>()).add(board[i][j]);
            rc.computeIfAbsent(rck,k->new HashSet<>()).add(board[i][j]);

            
            
        }
    }
    
        return true;
    }
}
