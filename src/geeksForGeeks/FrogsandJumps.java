package geeksForGeeks;

public class FrogsandJumps {

	public static void main(String[] args) {
		int N = 3;
				int leaves = 4;
				int frogs[] = {3, 2, 4};
				System.out.println(unvisitedLeaves(N, leaves, frogs));

	}
	public static int unvisitedLeaves(int N, int leaves, int frogs[]) {
        int count=0;
        boolean  leaf[]=new boolean[leaves+1];
        boolean[] used = new boolean[leaves + 1];
       for(int i=0;i<N;i++)
       {
    	 //  int j=frogs[i];
    	   //used[jump] = true;
    	   int jump = frogs[i];

           if (jump <= leaves && !used[jump]) {  // ✅ correct duplicate check
               used[jump] = true;  // mark jump as used
               int j = jump;
    	   if(j<=leaves && !leaf[j])
    	   {
    		   while(j<=leaves)
    		   {
    			   leaf[j]=true;
    			   j=j+frogs[i];
    		   }
    	   }
           }
       }
       for(int i=1;i<leaf.length;i++)
       {
    	   if(!leaf[i])
    	   {
    		   count++;
    	   }
       }
        
        return count;
        
    }

}
