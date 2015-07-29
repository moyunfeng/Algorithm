/**
 * Created by xiaoying on 15/7/29.
 */
public class HuiWen {
    int huiwen(char a,char b) {  if(a==b)   return 0;   else    return 1; }

    public static void main(String args[]) {
        char t[1024];
        int len,i,j,k;
        cin>>t;
        len=strlen(t);
        for(i=0,j=len-1;i<j;i++,j--)
        {   k=huiwen(t[i],t[j]);   if(k)
        {    cout<<t<<" is not huiwen."<<endl;    return 0;    }   }   cout<<t<<" is huiwen."<<endl;  return 0
    }
}
