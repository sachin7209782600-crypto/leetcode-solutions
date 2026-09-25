class Solution {
    public int[] findArray(int[] pref) {
        int cal=pref[0],org=0;
        for(int i=1;i<pref.length;i++)
        {
            org=pref[i];
            pref[i]=cal^pref[i];
            cal=org;
        }
        return pref;
    }
}