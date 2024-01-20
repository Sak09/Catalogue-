import java.util.*;
public class catalogue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="price";
        System.out.println("the product name is "+s);
        System.out.print("enter quantity of each product");
        int d=20,e=40,f=50;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int dis=0;
        int tot=(a*d)+(b*e)+(c*f);
        int T1=(a*d);
        int T2=(b*e); 
        int T3=(c*f);
        int p=0;
        int arr[]={0,0,0,0};
        System.out.println("total amount of product is "+tot);
        int dis1=0;
        if(tot>200){
            dis1=(tot*10)/100;
            arr[0]=dis1;
        }
        System.out.println("discount on cart total 200 is "+dis1);
        int ans[]={0,0,0};
        if(a>10){
            ans[0]=(T1*5)/100;
        }
        if(b>10){
            ans[1]=(T2*5)/100;
        }
        if(c>10){
            ans[2]=(T3*5)/100;
        }
        int dis2=Math.max(a,Math.max(b,c));
        arr[1]=dis2;
         System.out.println("discount if quantity exeeds 10 is "+dis2);
        int dis3=0;
        if((a+b+c)>30){
            if(a>15){
                dis3=((a-15)*50)/100;
                arr[2]=dis3;
            }
            if(b>15){
                dis3=((b-15)*50)/100;
                arr[2]=dis3;
            }
            if(c>15){
                dis3=((c-15)*50)/100;
                arr[2]=tot-dis3;
            }
        }
         System.out.println("discount if total quantity exceeds 30 unit is "+dis3);
        int dis4=0;
        if((a+b+c)>20){
            dis4=(tot*10)/100;
            arr[3]=dis4;
        }
        System.out.println("discount if total quantity exeeds 20 is "+dis4);
        int max=0;
        for(int i=0;i<4;i++){
            max=Math.max(max, arr[i]);
         }
        System.out.println("maximum discount is "+max);
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(dis1, "flat_10_discount");
        hm.put(dis2, "bulk_5_discount");
        hm.put(dis3,"tiered_50_discount");
        hm.put(dis4,"bulk_10_discount");
        if(hm.containsKey(max));
        System.out.println("discount available on product is "+hm.get(max));
        System.out.println("you want product wrapped as a gift");
        int giftwrap=sc.nextInt();
        if((a+b+c)%10==0){
            p=((a+b+c)/10)*5;
        }else{
            p=(((a+b+c)/10)+1)*5;
        }
        System.out.println("shipping fees is "+p);
        int price=0;
        if(giftwrap==1){
            price=(a+b+c);
        }
        System.out.println("gift wrapping fees is "+price);
        int totdis=max+p+price;
        int disprice=tot-totdis;
        System.out.println("Total price is"+  disprice);
   }
    
}
//enter the three numbers quatity of three products
//enter 0 for not wrapping and 1 for wrapping
