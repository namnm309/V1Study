import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;

public class Method {
    public void NhapMang(){
            Scanner sc=new Scanner (System.in);
            
            System.out.println("Mời bạn nhập kích thước cho mảng : "); 
            int kichthuongmang=sc.nextInt();
            int manga[]=new int[kichthuongmang];
            
        //Tạo vòng lặp để nhập giá trị vào mảng 
            for (int i=0;i<manga.length;i++){
                System.out.println("Mời bạn nhập giá trị cho ví trị "+i+" của mảng : ");
                manga[i]=sc.nextInt();
            }
            System.out.println("");

        //Nhập bằng cách gán trực tiếp :
            int [] mangb= {1,2,3,4,5};
            
        //Nhập mảng 2 chiều dùng vòng lặp lồng : 
            System.out.print("Nhập số hàng: ");
            int rows = sc.nextInt();
            System.out.print("Nhập số cột: ");
            int cols = sc.nextInt();
    
            int[][] matrix = new int[rows][cols];
            System.out.println("Nhập các phần tử của ma trận:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Phần tử [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

        //Nhập mảng từ file
            //Dùng 2 lớp File và FileNotFoundException
            //Này là Java I/O : https://viettuts.vn/java-io
             try {
            File file = new File("C:\\Users\\Ngoc Lan\\OneDrive\\Máy tính\\Github\\V1Study\\Java\\Other tech\\Mảng\\BTMang");//tên của file 
            Scanner sc1 = new Scanner(file);

            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Mảng từ file:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            } catch (FileNotFoundException e) {
                System.out.println("File không tồn tại!");
            }




        
                            }

    public void HienThiMang(int mang[]){
        //Hiển thị mảng 
            //Cách 1:
            System.out.println("In mảng cách 1: ");
            for (int i=0;i<mang.length;i++){
                System.out.println("Vị trí "+i+" của mảng có giá trị là : "+mang[i]);
            
            }

            //Cách 2 : Dùng for cải tiến
            System.out.println("In mảng cách 2: "); 
            for (int mangx:mang){
                int count=0;
                System.out.println("Giá trị của mảng tại phần tử "+count+" là : "+mangx);
                count++;
            }
            //Cách 3 : Dùng gói Arrays để toString
            //Mảng đa chiều sử dụng Arrays.deepToString(array)
            System.out.println("In mảng cách 3 : ");
            System.out.println(Arrays.toString(mang));                 
                             }

    public void LopArrayList(){ //Link tìm hiểu https://viettuts.vn/java-collection
        
        //Dùng arraylist cho mảng động (kích thước random)
        //Lưu trữ nhiều kiểu dữ liệu 
        //Linh hoạt trong việc tăng giảm kích thước khi cần 
        //CUng cấp 1 số phương thức hữu dụng để thao tác với tập hợp 
        //Chèn và xóa dữ liệu dễ dàng 
        //Có thể truy xuất bằng vòng lặp for,for-each,...
        //Lưu các phần tử với các kiểu khác nhau gồm cả null 
            //Các phương thức sử dụng phổ biến 

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             


    }

    




















}
