class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
         int SI=0;
        int count=0;
        if(ruleKey=="color"){
            SI=1;
        }
        else if(ruleKey=="name")
        {
            SI=2;
        }
        for(int i=0;i<items.size();i++)
        {
            if(items[i][SI]==ruleValue)
            {
                count++;
            }
        }
        return count;
    }
};