import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        System.out.println("Mời bạn nhập kích thước cho mảng : "); 
        int kichthuongmang=sc.nextInt();
        int manga[]=new int[kichthuongmang];

        //Tạo vòng lặp để nhập giá trị vào mảng 
        for (int i=0;i<manga.length;i++){
            System.out.println("Mời bạn nhập giá trị cho ví trị "+i+" của mảng : ");
            manga[i]=sc.nextInt();
        }

        //Hiển thị mảng 
        for (int i=0;i<manga.length;i++){
            System.out.println("Vị trí "+i+" của mảng có giá trị là : "+manga[i]);
          
        }

        //Sắp xếp mảng , sử dụng lớp Arrays để sử dụng method sort 
        Arrays.sort(manga);
        //In ra mảng đã sắp xếp , in ra bằng toString để in ra toàn bộ mảng 
        System.out.println("Mảng sau khi sắp xếp là : "+Arrays.toString(manga));

        //Loại bỏ các phần tử giống nhau sao cho chỉ xuất hiện 1 lần 
        //Cách 1 : dùng vòng lặp , mảng chỉ in ra các phần tử 1 lần 
            //dùng vòng lặp nâng cao 
            for ()



    }
}
