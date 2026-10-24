class Solution {
    public static int ConvertDays(String date)
    {
        int[]  days = { 
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int total = day;
        for(int i=0; i<month-1; i++)
        {
            total += days[i];
        }
        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {


        int val1 = ConvertDays(leaveBob);
        int val2 = ConvertDays(leaveAlice);
        int val3 = ConvertDays(arriveAlice);
        int val4 = ConvertDays(arriveBob);
        int res = Math.max(0, Math.min(val1, val2)- Math.max(val3,val4)+1);
        return res;
        
    }
}