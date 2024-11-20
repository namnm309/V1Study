/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ngoc Lan
 */
public class c1 {

    public void tech1() {
        System.out.println("Syntax :");
        System.out.println("//Khai báo mảng cần chứa các chuỗi sau : \n"
                + "       String[] strTest = { \"\",\"1602\",\"1998\",\"NMD98\",\"1998d\",\"nmdse\"};\n"
                + "       // Kiểm tra xem chuỗi có chứa các chữ cái hay không\n"
                + "       for(String str: strTest){\n"
                + "           System.out.println(\"Chuỗi \" + str + \" có chứa các chữ cái:\"+str.matches(\".*[a-zA-Z].*\"));\n"
                + "       }\n"
                + "       System.out.println(\"____________\");\n"
                + "       // kiểm tra xem chuỗi có chứa các chữ số hay không\n"
                + "       for(String str: strTest){\n"
                + "           System.out.println(\"Chuỗi \" + str + \" có chứa các chữ số: \"+str.matches(\".*[0-9].*\"));");
        System.out.println("--------------------------");
        System.out.println("Kết quả :");
        //Khai báo mảng cần chứa các chuỗi sau : 
        String[] strTest = {"", "1602", "1998", "NMD98", "1998d", "nmdse"};
        // Kiểm tra xem chuỗi có chứa các chữ cái hay không
        for (String str : strTest) {
            System.out.println("Chuỗi " + str + " có chứa các chữ cái:" + str.matches(".*[a-zA-Z].*"));
        }
        System.out.println("____________");
        // kiểm tra xem chuỗi có chứa các chữ số hay không
        for (String str : strTest) {
            System.out.println("Chuỗi " + str + " có chứa các chữ số: " + str.matches(".*[0-9].*"));
        }

        /*
      Chú thích thêm cách sử dụng vòng for nâng cao :       
        for (type var : collection) {

          // khối_lệnh

        }       
         */
    }
    //Sử dụng Patter và Matcher 

    public void tech2() {
        System.out.println("Syntax : ");
        System.out.println("String strTest = \"Regex 15-05-2020, Nguyen Minh Duc 16/02/1998. Deadline 18_02_2020\";\n"
                + "        Pattern patternDate = Pattern.compile(\"\\\\d{2}[-|/]\\\\d{2}[-|/]\\\\d{4}\");  //Nhớ import thư viện (import java.util.regex.Pattern;)\n"
                + "        Matcher matcher = patternDate.matcher(strTest);                         //Nhớ import thư viện : (import java.util.regex.Matcher;)\n"
                + "         \n"
                + "        System.out.println(\"Ngày tháng năm trong chuỗi đầu vào: \" + strTest +\" là:\");\n"
                + "        while(matcher.find()) {\n"
                + "            System.out.println(strTest.substring(matcher.start(), matcher.end()));\n"
                + "        }         \n"
                + "        String strTest2 = \"15/05/2020\";\n"
                + "        String strTest3 = \"16/02/mdse\";\n"
                + "        patternDate = Pattern.compile(\"^\\\\d{2}[-|/]\\\\d{2}[-|/]\\\\d{4}$\");\n"
                + "        System.out.println(\"Chuỗi \" + strTest2 + \" có định dạng ngày tháng: \"\n"
                + "                + patternDate.matcher(strTest2).matches());\n"
                + "         \n"
                + "        System.out.println(\"Chuỗi \" + strTest3 + \" có định dạng ngày tháng: \"\n"
                + "                + patternDate.matcher(strTest3).matches());");
        System.out.println("-----------------------------");
        System.out.println("Kết quả :");
        String strTest = "Regex 15-05-2020, Nguyen Minh Duc 16/02/1998. Deadline 18_02_2020";
        Pattern patternDate = Pattern.compile("\\d{2}[-|/]\\d{2}[-|/]\\d{4}");  //Nhớ import thư viện (import java.util.regex.Pattern;)
        Matcher matcher = patternDate.matcher(strTest);                         //Nhớ import thư viện : (import java.util.regex.Matcher;)

        System.out.println("Ngày tháng năm trong chuỗi đầu vào: " + strTest + " là:");
        while (matcher.find()) {
            System.out.println(strTest.substring(matcher.start(), matcher.end()));
        }
        String strTest2 = "15/05/2020";
        String strTest3 = "16/02/mdse";
        patternDate = Pattern.compile("^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$");
        System.out.println("Chuỗi " + strTest2 + " có định dạng ngày tháng: "
                + patternDate.matcher(strTest2).matches());

        System.out.println("Chuỗi " + strTest3 + " có định dạng ngày tháng: "
                + patternDate.matcher(strTest3).matches());
    }

}
