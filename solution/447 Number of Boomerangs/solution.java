public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if(points.length<3) return 0;
        int num=0;
        int dist=0;
        for(int i=0;i<points.length;i++){
            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            for(int j=0;j<points.length;j++){
                dist=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
                if(!map.containsKey(dist)) map.put(dist,0);
                num+=map.get(dist)*2;
                map.put(dist,map.get(dist)+1);
            }
        }
        return num;
    }
}