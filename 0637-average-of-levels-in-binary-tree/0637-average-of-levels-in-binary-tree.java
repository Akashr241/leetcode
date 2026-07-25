class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> ans = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            Double sum = 0.00;
            for(int i=0;i<n;i++)
            {
                TreeNode temp = q.poll();
                sum = sum+temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            Double avg = sum/n;
            ans.add(avg);
        }
        return ans;
    }
}