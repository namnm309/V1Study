import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;

public class Method {
    // 1.Hàm tạo thanh button
    public void taoButton() {
        // Tạo nút button click vào (JButton Class – Lớp JButton)
        // Tạo cửa sổ JFrame với tiêu đề
        JFrame a = new JFrame("Tên của chương trình-JButton");

        // Tạo nút bấm với nhãn "Click"
        JButton b = new JButton("Click");

        // Thiết lập vị trí và kích thước cho nút (x, y, width, height)
        b.setBounds(40, 90, 85, 20);

        // Thêm nút vào cửa sổ JFrame
        a.add(b);

        // Đặt kích thước cho cửa sổ (width, height)
        a.setSize(300, 300);

        // Tắt layout manager để có thể đặt vị trí thủ công
        a.setLayout(null);

        // Hiển thị cửa sổ
        a.setVisible(true);
    }

    // 2.Hàm tạo khu vực nhập văn bản textField
    public void taoTextField() {
        // Tạo cửa sổ JFrame với tiêu đề
        JFrame a = new JFrame("Lớp JTextField");

        // Tạo trường văn bản với nội dung mặc định
        JTextField b = new JTextField("Tạo text field để điền vào");

        // Thiết lập vị trí và kích thước cho trường văn bản (x, y, width, height)
        b.setBounds(50, 100, 200, 30);

        // Thêm trường văn bản vào cửa sổ JFrame
        a.add(b);

        // Đặt kích thước cho cửa sổ (width, height)
        a.setSize(300, 300);

        // Tắt layout manager để có thể đặt vị trí thủ công
        a.setLayout(null);

        // Hiển thị cửa sổ
        a.setVisible(true);
    }

    // Hàm tạo thanh cuộn ngang dọc
    public void thanhcuon() {
        // Tạo cửa sổ JFrame với tiêu đề
        JFrame a = new JFrame("Tên chương trình - Thanh cuộn ngang dọc-Lớp lớp JScrollBar");

        // Tạo thanh cuộn với hướng cuộn mặc định (vertical)
        JScrollBar b = new JScrollBar();

        // Thiết lập vị trí và kích thước cho thanh cuộn (x, y, width, height)
        b.setBounds(90, 90, 40, 90);

        // Thêm thanh cuộn vào cửa sổ JFrame
        a.add(b);

        // Đặt kích thước cho cửa sổ (width, height)
        a.setSize(300, 300);

        // Tắt layout manager để có thể đặt vị trí thủ công
        a.setLayout(null);

        // Hiển thị cửa sổ
        a.setVisible(true);
    }

    // 4.Hàm tạo button theo thư viện JPanel
    public void Jpanel() {
        /*
         * Sử dụng JPanel khi bạn cần một container để tổ chức các thành phần giao diện.
         */
        // Tạo JFrame
        JFrame a = new JFrame("Tên chương trình lớp JPanel");
        a.setSize(400, 400);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setLayout(null); // Sử dụng null layout

        // Tạo JPanel
        JPanel p = new JPanel();
        p.setBounds(40, 70, 300, 200);
        p.setLayout(null); // Sử dụng null layout cho JPanel

        // Tạo JButton 1
        JButton button1 = new JButton("Button 1");
        button1.setBounds(20, 20, 100, 40);

        // Tạo JButton 2
        JButton button2 = new JButton("Button 2");
        button2.setBounds(150, 20, 100, 40);

        // Tạo JTextField
        JTextField textField = new JTextField();
        textField.setBounds(20, 80, 230, 30);

        // Thêm các thành phần vào JPanel
        p.add(button1);
        p.add(button2);
        p.add(textField);

        // Thêm JPanel vào JFrame
        a.add(p);

        // Hiển thị JFrame
        a.setVisible(true);
    }

    // 5.Hàm tạo menu
    public void Menu() {

        // Khai báo biến menu kiểu JMenu
        JMenu menu;

        // Khai báo hai biến menu item
        JMenuItem a1, a2;

        // Tạo cửa sổ JFrame với tiêu đề "Menu"
        JFrame a = new JFrame("Menu");

        // Tạo menu với nhãn "options"
        menu = new JMenu("options");

        // Tạo thanh menu bar
        JMenuBar m1 = new JMenuBar();

        // Tạo menu item thứ nhất với nhãn "example"
        a1 = new JMenuItem("example");

        // Tạo menu item thứ hai với nhãn "example1"
        a2 = new JMenuItem("example1");

        // Thêm menu item thứ nhất vào menu
        menu.add(a1);

        // Thêm menu item thứ hai vào menu
        menu.add(a2);

        // Thêm menu vào thanh menu bar
        m1.add(menu);

        // Gán thanh menu bar cho JFrame
        a.setJMenuBar(m1);

        // Đặt kích thước cửa sổ
        a.setSize(400, 400);

        // Tắt layout manager
        a.setLayout(null);

        // Hiển thị cửa sổ
        a.setVisible(true);
    }

    // 6.Hàm tạo list
    public void TaoList() {
        // Tạo cửa sổ JFrame với tiêu đề "example"
        JFrame a = new JFrame("example");

        // Tạo một model danh sách mặc định để chứa các mục
        DefaultListModel<String> l = new DefaultListModel<>();

        // Thêm mục đầu tiên vào danh sách
        l.addElement("first item");

        // Thêm mục thứ hai vào danh sách
        l.addElement("second item");

        // Tạo JList với model đã tạo
        JList<String> b = new JList<>(l);

        // Thiết lập vị trí và kích thước cho danh sách (x, y, width, height)
        b.setBounds(100, 100, 75, 75);

        // Thêm danh sách vào cửa sổ JFrame
        a.add(b);

        // Đặt kích thước cho cửa sổ (width, height)
        a.setSize(400, 400);

        // Hiển thị cửa sổ
        a.setVisible(true);

        // Tắt layout manager để có thể đặt vị trí thủ công
        a.setLayout(null);
    }

    // 7.Hàm đặt văn bản trong vùng chứa
    public void textInVungChua() {
        JFrame a = new JFrame("“example”");

        JLabel b1;

        b1 = new JLabel("“edureka”");

        b1.setBounds(40, 40, 90, 20);

        a.add(b1);

        a.setSize(400, 400);

        a.setLayout(null);

        a.setVisible(true);
    }

    // 8.Hàm tạo menu bật lên
    public void menuBat() {
        JFrame a;
        a = new JFrame("“example”");

        String courses[] = { "“core java”,”advance java”, “java servlet”" };

        JComboBox c = new JComboBox(courses);

        c.setBounds(40, 40, 90, 20);

        a.add(c);

        a.setSize(400, 400);

        a.setLayout(null);

        a.setVisible(true);
    }

    /*
     * Layout Manager – Trình quản lý bố cục
     * Để sắp xếp các thành phần bên trong vùng chứa, chúng ta sử dụng Layout
     * Manager.
     *
     * Có một số bố cục như sau:
     *
     * Border layout – Bố cục đường viền
     *
     * Flow layout – Bố cục luồng
     *
     * GridBag layout – Bố cục dạng khung
     */

    // 9.Ví dụ dạng flow layout
    public void FlowLayoutManagemer(){
        
        // Thiết lập cửa sổ chính
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        // Thiết lập menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("FILE");
        JMenu helpMenu = new JMenu("Help");
        
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveAsItem = new JMenuItem("Save as");
        fileMenu.add(openItem);
        fileMenu.add(saveAsItem);
        
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        
        // Thiết lập giao diện nhập liệu
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter Text"));
        
        JTextField inputField = new JTextField(10);
        JButton sendButton = new JButton("Send");
        JButton resetButton = new JButton("Reset");
        
        inputPanel.add(inputField);
        inputPanel.add(sendButton);
        inputPanel.add(resetButton);
        
        // Thiết lập vùng hiển thị text
        JTextArea textArea = new JTextArea();
        
        // Bố trí các thành phần
        frame.getContentPane().add(BorderLayout.SOUTH, inputPanel);
        frame.getContentPane().add(BorderLayout.NORTH, inputField);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        
        // Hiển thị cửa sổ
        frame.setVisible(true);
    }


}
