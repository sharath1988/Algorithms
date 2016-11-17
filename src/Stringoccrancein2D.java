public class Stringoccrancein2D {
    public static void main(String... args){
       /* char[][] map = {{ 'S', 'N', 'B', 'S', 'N' },
                        { 'B', 'A', 'K', 'E', 'A' }, 
                        { 'B', 'K', 'B', 'B', 'K' },
                        { 'S', 'E', 'B', 'S', 'E' }};*/
        
        char[][] map= 
        	{
        	{'B', 'B', 'A', 'B', 'B', 'N'},
        	{'B', 'B', 'M', 'B', 'B', 'O'},
        	{'B', 'B', 'A', 'B', 'B', 'Z'},
        	{'N', 'O', 'Z', 'A', 'M', 'A'},
        	{'B', 'B', 'B', 'B', 'B', 'M'},
        	{'B', 'B', 'B', 'B', 'B', 'A'} };

        System.out.println(findPath(map, "AMAZON"));
    }
    
    public static int findPath(char[][] map, String target){
        int count = 0;
        for(int i = 0; i < map.length ; i++){
            for(int j = 0; j < map[i].length; j++){
                count += findPath(map, target, i, j, 0);
            }
        }
        return count;
    }
    
    public static int findPath(char[][] map, String target, int startX, int startY, int targetIndex){
        
        if(startX < 0 || startY < 0 || startX >= map.length || startY >= map[startX].length){
            return 0;
        }
        
        char original = map[startX][startY];
        
        if(original != target.charAt(targetIndex))
            return 0;
        
        if(targetIndex == target.length() - 1)
            return 1;

        int count = 0;
        map[startX][startY] = '\0';         // avoid return back to visited node

        count += findPath(map, target, startX+1, startY, targetIndex+1);
        count += findPath(map, target, startX, startY+1, targetIndex+1);
        count += findPath(map, target, startX-1, startY, targetIndex+1);
        count += findPath(map, target, startX, startY-1, targetIndex+1);
        
      map[startX][startY] = original;
        return count;
    }
}