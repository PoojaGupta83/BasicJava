//Day 1:Find Missing Number in the given array(05-01-2026)
class MissingNumber{
public static void main(String args[]){
int a[]={1,2,4,5};
int n=5;
int expectedSum=(n*(n+1))/2;
int actualSum=0;
for(int num:a){
actualSum+=num;
}

int missingNumber=expectedSum-actualSum;
System.out.println("MissingNumber="+missingNumber);
}
}