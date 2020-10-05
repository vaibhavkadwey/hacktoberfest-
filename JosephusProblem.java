/*Given n people in a circle, every kth person is killed. find the survivor. */
public class JosephusProblem {
    public static void main(String[] args) {
        int n =8;
        int k=2;
        System.out.println(jos(n,k));
    }

    private static int jos(int n, int k) {
        if (n==1)
            return n;

        return (jos(n-1,k)+k-1)%n+1;    //when k==n, it becomes n%n. so to handle that  its k-1)%n+1;
    }
}

/*Note- After the first person (kth from beginning) is killed, n-1 persons are left.
So we call josephus(n – 1, k) to get the position with n-1 persons. As we are in a
circle so the count should not be more that the number of people. so
(jos(n-1,k)+k)%n. when k==n, n%n will be zero. so to ensure value from zero to
n-1 , this -> k-1 and n+1.
*/
