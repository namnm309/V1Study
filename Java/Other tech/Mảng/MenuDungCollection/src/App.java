import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner sc=new Scanner(System.in);
    public  void run () {
        //Dùng ArrayList để tạo menu 
        ArrayList<String> menu=new ArrayList<>();// nhớ import thư viện 
       
        //Dùng phương thức có sẵn add để add phần tử vào menu 
        menu.add("Option 1");
        menu.add("Option 2");
        menu.add("Option 3");
        menu.add("Option 4 : Thoát");

        //Dùng vòng while để hiển thị menu 
        while (true){
            System.out.println("======================Menu===================");
            int choice = getChoice(menu);
            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn option 1");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn option 2");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn option 3");
                    break;
                case 4:
                   System.out.println("Bạn đã chọn option 4 : Thoát ");
                   System.exit(0);
                    break;
        }
    }
    }
    //Tạo phương thức để hiển thị ArrayList và nhập lựa chọn option 
        public int getChoice(ArrayList<String> list){
            for (int i=0;i<list.size();i++){
                System.out.println((i+1)+" - "+list.get(i));
            }
            System.out.println("==============================");
            System.out.println("Mời bạn chọn các option : ");
            int choose=sc.nextInt();
            return choose;
        }

    public static void main(String[] args) {
        App obj=new App();
        obj.run();
    }

    
}
