import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public void run() {
        Method obj = new Method();
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1.Tạo nút button");
        menu.add("2.Tạo textfield để nhập văn bản");
        menu.add("3.Tạo thanh cuộn ngang và dọc scrollbar");
        menu.add("4.Tạo container để chứa các đối tượng GUI JPanel ví dụ là button và textfield");
        menu.add("5.Tạo menu ");
        menu.add("6.Tạo list");
        menu.add("7.Hàm đặt văn bản trong vùng chứa");
        menu.add("8.Hàm tạo menu bật lên");
        menu.add("9.FlowLayoutManagement");
        menu.add("50.Exit");
        while (true) {
            System.out.println("=========== Menu ============");
            int choice = checkDk(menu);
            switch (choice) {
                case 1:
                    obj.taoButton();
                    break;
                case 2:
                    obj.taoTextField();
                    break;
                case 3:
                    obj.thanhcuon();
                    break;
                case 4:
                    obj.Jpanel();
                    break;
                case 5:
                    obj.Menu();
                    break;
                case 6:
                    obj.TaoList();
                    ;
                    break;
                case 7:
                    obj.textInVungChua();
                    break;
                case 8:
                    obj.menuBat();
                    break;
                case 9:
                    obj.FlowLayoutManagemer();
                    break;
                case 10:
                    break;
                case 50:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
            }
        }
    }

    public int checkDk(ArrayList<String> list) {

        boolean checkdk = false;
        while (true) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + "." + list.get(i));
                }
                System.out.println("Mời bạn chọn : ");
                int bientrave = input.nextInt();
                return bientrave;

            } catch (Exception e) {
                System.out.println("Vui lòng nhập đúng số ");
                input.nextLine();
            }
        }

    }

    public static void main(String args[]) {
        App menu = new App();
        menu.run();
    }

}
