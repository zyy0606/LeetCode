public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int lhouse=houses.length;
        int lheater=heaters.length;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        if(lhouse==0) return 0;
        int res=0;
        int heater_index=0;
        for(int i=0;i<lhouse;i++){
            while(heater_index<lheater-1&&houses[i]>heaters[heater_index+1]) heater_index++;
            int tmp=Math.abs(heaters[heater_index]-houses[i]);
            for(int j=heater_index+1;j<lheater;j++){
                if(tmp<Math.abs(heaters[j]-houses[i])) break;
                else{
                    tmp=Math.abs(heaters[j]-houses[i]);
                }
            }
            res=Math.max(res,tmp);
        }
        return res;
    }
}