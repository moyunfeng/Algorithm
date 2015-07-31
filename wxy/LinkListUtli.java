/**
 * Created by xiaoying on 15/7/31.
 */
public class LinkListUtli {

    public static boolean isIntersect(LNode L1,LNode L2){
        LNode p = L1;
        LNode q = L2;
        while (p.next!=null){
            p=p.next;
        }
        while (q.next!=null){
            q=q.next;
        }
        if (p==q)
            return true;
        return false;

    }

}

class  LNode{
    public int data;
    public  LNode next;
}


