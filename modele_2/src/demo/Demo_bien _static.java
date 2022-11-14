package demo;


 class Counter2{
     static int count= 0;

     public static void setCount(int count) {
         Counter2.count = count;
     }

     // int count =0 ;
        Counter2(){
            count++;
            System.out.println(count);
        }

     public static void main(String args[]){
//creating objects
            Counter2 c1=new Counter2();
            Counter2 c2=new Counter2();
            Counter2 c3=new Counter2();
//            int count =0; có kết quả là :1/1/1 Khi gọi contructor giá trị count
//            reset về lại gái trị ban đầu sau đó thực hiện lệnh trong contructor
//            là về giá trị count =0+1;



//            static int count = 0; có kết quả là:1/2/3 Khi gọi contructor giá trị count thay đổi
//            lần 1 count = 1
//            lần 2 count =2
//            lần 3 count =3 ;
        }
    }