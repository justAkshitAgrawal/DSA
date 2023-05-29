/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int finish = n;
        int med;

        while (start < finish)
        {
            med = start + (finish - start) / 2;
            if (isBadVersion(med))
                finish = med;
            else
                start = med + 1;
        }
        
        return start;
    }
}