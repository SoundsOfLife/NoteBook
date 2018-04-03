class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> msi = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] record = cpdomains[i].split(" ");
            String[] domains = record[1].split("\\.");
            StringBuffer sb = new StringBuffer();
            for (int j = domains.length - 1; j >= 0; j--) {
                sb.insert(0, domains[j]);
                if (msi.containsKey(sb.toString())) {
                    msi.put(sb.toString(), msi.get(sb.toString()) + Integer.valueOf(record[0]));
                } else {
                    msi.put(sb.toString(), Integer.valueOf(record[0]));
                }
                sb.insert(0, ".");
            }
        }
        List<String> ans = new ArrayList<>();
        for (String s : msi.keySet()) {
            String temp = String.valueOf(msi.get(s)) + " " + s;
            ans.add(temp);
        }
        return ans;
    }
}