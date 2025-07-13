//-->Adding libraries:-
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//-->Make login class that inherits JFrame
class Login extends  JFrame implements ActionListener{
    JTextField usernamefield;
    JPasswordField passfield;

    JButton b1,b2;

//    -->Make login constructor:-
    Login(){
        this.setTitle("Comsats University Islamabad");
        JLabel s= new JLabel("CIIT/AA00-BBB-000/SWL ");
        usernamefield = new JTextField();
        JLabel s1= new JLabel("Password ");
        passfield = new JPasswordField();
        b1= new JButton("Login");
        b2= new JButton("Forget");
        JLabel h1=new JLabel("Forget password? Click here!");

//        -->Colour
        s.setForeground(Color.WHITE);
        s1.setForeground(Color.WHITE);
        h1.setForeground(Color.WHITE);

//        -->Images:-
        ImageIcon logo= new ImageIcon("Cuiframe.logo.jpeg");
        this.setIconImage(logo.getImage());
        ImageIcon background=new ImageIcon(Main.class.getResource("background.cui.png"));
        JLabel backgroundLabel1 = new JLabel(background);
        this.setContentPane(backgroundLabel1);
        ImageIcon image=new ImageIcon("cuiimg1.jpeg");
        JLabel logo1= new JLabel(image);

// -->Fonts
        Font f=new Font("Ariel",Font.BOLD,14);
        s.setFont(f);
        s1.setFont(f);

//-->Setbounds
        logo1.setBounds(2,2,500,300);
        s.setBounds(750,300,170,100);
        usernamefield.setBounds(750,370,170,30);
        s1.setBounds(750,380,170,100);
        passfield.setBounds(750,450,170,30);
        b1.setBounds(900,510,70,20);
        b2.setBounds(900,550,80,20);
        h1.setBounds(720,550,200,20);


        this.add(s);
        this.add(usernamefield);
        this.add(s1);
        this.add(passfield);
        this.add(b1);
        this.add(b2);
        this.add(h1);
        this.add(logo1);

        b1.addActionListener(this);



        this.setSize(1400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setVisible(true);


    }
//-->Apply Actionlistner
    @Override
    public void actionPerformed(ActionEvent e) {
        //b1.addActionListener(this);
        String username = usernamefield.getText();
        String password = String.valueOf(passfield.getPassword());
        if (username.equals("86") && password.equals("saad")) {
            JFrame f2 = new JFrame("Comsats University Islamabad");
            JPanel panel = new JPanel();
            ImageIcon logo = new ImageIcon("Cuiframe.logo.jpeg");
            f2.setIconImage(logo.getImage());
            ImageIcon background1 = new ImageIcon(Main.class.getResource("background.cui.png"));
            JLabel backgroundLabel12 = new JLabel(background1);
            f2.setContentPane(backgroundLabel12);
            ImageIcon image1 = new ImageIcon("cuiimg1.jpeg");
            JLabel logo2 = new JLabel(image1);
            panel.setBackground(Color.WHITE);
            panel.setBounds(700, 220, 450, 400);
            logo2.setBounds(2, 2, 500, 300);
            f2.add(panel);
            f2.add(logo2);
            f2.setSize(1400, 700);
            f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            f2.setLocationRelativeTo(null);
            f2.setResizable(true);
            f2.setVisible(true);

            //  this.dispose();  --> for close previous frame
            //Button button = new Button(f2);
            // b1.addActionListener(button);


            JButton b3 = new JButton();
            JLabel b3l = new JLabel("Dashboard");
            JButton b4 = new JButton();
            JLabel b4l = new JLabel("Registration Card");
            JButton b5 = new JButton();
            JLabel b5l = new JLabel("Fee");
            JButton b6 = new JButton();
            JLabel b6l = new JLabel("Result Card");
            JButton b7 = new JButton();
            JLabel b7l = new JLabel("Profile");
            JButton b8 = new JButton();
            JLabel b8l = new JLabel("Logout");

//         --b3
            ImageIcon originalIcon = new ImageIcon("b3.logo1.png");
            // Resize the image to the desired dimensions
            int desiredWidth = 60;
            int desiredHeight = 40;
            Image resizedImage = originalIcon.getImage().getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            // Create a button with the resized icon
            b3 = new JButton(resizedIcon);

//-->b4
            ImageIcon originalIcon2 = new ImageIcon("b4.logo.png");
            // Resize the image to the desired dimensions
            int desiredWidth2 = 60;
            int desiredHeight2 = 40;
            Image resizedImage2 = originalIcon2.getImage().getScaledInstance(desiredWidth2, desiredHeight2, Image.SCALE_SMOOTH);
            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);
            // Create a button with the resized icon
            b4 = new JButton(resizedIcon2);


//            -->b5
            ImageIcon originalIcon3 = new ImageIcon("b5.png");
            // Resize the image to the desired dimensions
            int desiredWidth3 = 60;
            int desiredHeight3 = 40;
            Image resizedImage3 = originalIcon3.getImage().getScaledInstance(desiredWidth3, desiredHeight3, Image.SCALE_SMOOTH);
            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon3 = new ImageIcon(resizedImage3);
            // Create a button with the resized icon
            b5 = new JButton(resizedIcon3);


//            -->b6
            ImageIcon originalIcon4 = new ImageIcon("b6.png");
            // Resize the image to the desired dimensions
            int desiredWidth4 = 40;
            int desiredHeight4 = 40;
            Image resizedImage4 = originalIcon4.getImage().getScaledInstance(desiredWidth4, desiredHeight4, Image.SCALE_SMOOTH);
            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon4 = new ImageIcon(resizedImage4);
            // Create a button with the resized icon
            b6 = new JButton(resizedIcon4);


//-->b7
            ImageIcon originalIcon5 = new ImageIcon("b7.png");
            // Resize the image to the desired dimensions
            int desiredWidth5 = 40;
            int desiredHeight5 = 40;
            Image resizedImage5 = originalIcon5.getImage().getScaledInstance(desiredWidth5, desiredHeight5, Image.SCALE_SMOOTH);
            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon5 = new ImageIcon(resizedImage5);
            // Create a button with the resized icon
            b7 = new JButton(resizedIcon5);


//            -->b8
            ImageIcon originalIcon6 = new ImageIcon("b8.png");
            // Resize the image to the desired dimensions
            int desiredWidth6 = 40;
            int desiredHeight6 = 40;
            Image resizedImage6 = originalIcon6.getImage().getScaledInstance(desiredWidth6, desiredHeight6, Image.SCALE_SMOOTH);
            // Create a new ImageIcon with the resized image
            ImageIcon resizedIcon6 = new ImageIcon(resizedImage6);
            // Create a button with the resized icon
            b8 = new JButton(resizedIcon6);


            b3l.setForeground(Color.BLACK);
            b4l.setForeground(Color.BLACK);
            b5l.setForeground(Color.BLACK);
            b6l.setForeground(Color.BLACK);
            b7l.setForeground(Color.BLACK);
            b8l.setForeground(Color.BLACK);

//            -->Set Fonts:-
            Font f = new Font("Ariel", Font.BOLD, 14);
            b3l.setFont(f);
            b4l.setFont(f);
            b5l.setFont(f);
            b6l.setFont(f);
            b7l.setFont(f);
            b8l.setFont(f);


            ImageIcon image2 = new ImageIcon("comsatsimg.jpg");
            JLabel logo3 = new JLabel(image2);
            b3.setBounds(30, 170, 80, 50);
            b3l.setBounds(30, 220, 100, 30);
            b4.setBounds(170, 170, 80, 50);
            b4l.setBounds(150, 220, 120, 30);
            b5.setBounds(320, 170, 80, 50);
            b5l.setBounds(340, 220, 120, 30);
            b6.setBounds(30, 300, 80, 50);
            b6l.setBounds(30, 350, 120, 30);
            b7.setBounds(170, 300, 80, 50);
            b7l.setBounds(190, 350, 120, 30);
            b8.setBounds(320, 300, 80, 50);
            b8l.setBounds(340, 350, 120, 30);
            logo3.setBounds(0, 5, 450, 130);
            panel.add(logo3);
            panel.add(b3);
            panel.add(b3l);
            panel.add(b4);
            panel.add(b4l);
            panel.add(b5);
            panel.add(b5l);
            panel.add(b6);
            panel.add(b6l);
            panel.add(b7);
            panel.add(b7l);
            panel.add(b8);
            panel.add(b8l);
            panel.setLayout(null);

//-->Button 3 Actionlistner:-
            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dashboard(f2);

                }
            });

//            -->Button 4 Actionlistner:-
            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    registration_card(f2);

                }
            });

//            -->Button 5 Actionlistner:-
            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fee(f2);

                }
            });

//            -->Button 6 Actionlistner:-
            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    result_card(f2);

                }
            });

//            -->Button 7 Actionlistner:-
            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    profile(f2);

                }
            });

//            -->Button 8 Actionlistner:-
            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame d= new JFrame("Logout Account");
                    ImageIcon logo= new ImageIcon("logout.jpeg");
                    d.setIconImage(logo.getImage());


                    JButton yes=new JButton("yes");
                    JButton no =new JButton("No");
                    JLabel s1= new JLabel("Are you sure you want to logout?");
                    s1.setBounds(13,5,200,30);
                    yes.setBounds(70,50,80,30);
                    no.setBounds(70,100,80,30);

                    d.setSize(240, 200);
                    d.setLayout(null);
                    d.add(s1);
                    d.add(yes);
                    d.add(no);
                    d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    d.setLocationRelativeTo(null);
                    d.setVisible(true);
                    yes.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            d.dispose();
                            f2.dispose();
                        }
                    });
                    no.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                          d.dispose();
                        }
                    });

                }
            });




        }


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1=new JFrame("Recover Password");
                ImageIcon logo= new ImageIcon("forget1.png");
                frame1.setIconImage(logo.getImage());
               // JPanel panel1=new JPanel();
                JLabel s=new JLabel("For recovery of Account :-");
                JLabel s1=new JLabel("Or");
                JLabel phonelabel = new JLabel("(+92)");
                JLabel email=new JLabel("Email : ");
                JTextField phoneField = new JTextField();
                JTextField emailField= new JTextField();
                

                s.setBounds(10,10,160,40);
                phonelabel.setBounds(10, 60, 100, 40);
                phoneField.setBounds(60, 60, 100, 40);
                s1.setBounds(80,100,100,40);
                email.setBounds(10,140,100,40);
                emailField.setBounds(60,140,100,40);
                
                frame1.add(s);
                frame1.add(s1);
                frame1.add(phonelabel);
                frame1.add(phoneField);
                frame1.add(email);
                frame1.add(emailField);
                frame1.setLayout(null);
               // panel1.setBackground(Color.WHITE);
                //frame1.add(panel1);
                frame1.setSize(300, 250);
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);

            }
        });

    }


    public void dashboard(JFrame pf3){

        JFrame f3=new JFrame("Comsats University Islamabad");
        JPanel panel2=new JPanel();
        ImageIcon logo= new ImageIcon("Cuiframe.logo.jpeg");
        f3.setIconImage(logo.getImage());

        ImageIcon background3=new ImageIcon(Main.class.getResource("background.cui.png"));
        JLabel backgroundLabel3 = new JLabel(background3);
        f3.setContentPane(backgroundLabel3);

        String  [][]  data= {
                {"MTH104","Calculus","3","Dr.Shahid","BCS 3 B B"},{"MGT101","ITM","3","Suhail Qureshi","BCS 3 B B"},
                {"MTH231","LInear Algebra","3","Dr.Najima","BCS 3 B B"},{"CSC241","Object Oriented Programming","4","Dr.Javaid Farzand","BCS 3 B B"},
                {"CSC291","SEC","3","Usman Nasir","BCS 3 B B"}
        };
        String [] columnname={"Course Number","Course Name","Credits","Teacher","Class"};



        ImageIcon image=new ImageIcon("whatsapp.img.jpg");
        JLabel logo_image= new JLabel(image);
        logo_image.setBounds(1080,140,180,140);
        Image scaledImage = image.getImage().getScaledInstance(
                logo_image.getWidth(), logo_image.getHeight(), Image.SCALE_SMOOTH);
        logo_image.setIcon(new ImageIcon(scaledImage));
        logo_image.setText(null);


        ImageIcon image1=new ImageIcon("cuiimg1.jpeg");
        JLabel logo2= new JLabel(image1);
        logo2.setBounds(2,2,500,300);


        panel2.setBounds(250,400,800,150);
        JTable table= new JTable(data,columnname);
        panel2.add(new JScrollPane(table));
        table.setPreferredScrollableViewportSize(new Dimension(800,130));
        // Create a custom header cell renderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
        headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
        table.getTableHeader().setDefaultRenderer(headerRenderer);

        JPanel panel3=new JPanel();
        JLabel label_panel3=new JLabel("Registered Courses List");
        JLabel label_panel2=new JLabel("CUOnline , Principal Seat © 2018-COMSATS ®");
        JLabel img1=new JLabel("Muhammad Saad Nadeem");
        JLabel img2=new JLabel("SP22-BCS-086 ");


        Font f=new Font("Ariel",Font.BOLD,25);
        label_panel3.setFont(f);
        label_panel3.setBounds(250,5,400,30);
        panel3.setBounds(250,350,800,40);
        label_panel2.setBounds(530,520,400,30);
        img1.setBounds(910,160,180,30);
        img2.setBounds(920,190,180,30);

        panel3.setBackground(Color.BLUE);
        label_panel3.setForeground(Color.white);
        label_panel2.setForeground(Color.BLUE);

        panel3.add(label_panel3);

        panel2.setLayout(new FlowLayout());
        panel3.setLayout(null);
       // panel2.setLayout(null);
        panel2.setBackground(Color.white);
        f3.add(img1);
        f3.add(img2);
        f3.add(logo2);
        f3.add(label_panel2);
        f3.add(logo_image);
        f3.add(panel2) ;
        f3.add(panel3);
        f3.setSize(1400,700);
        f3.setLocationRelativeTo(null);
        f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f3.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f3.setVisible(true);


        // Attach a mouse listener to the table
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the selected row and column
                int row = table.getSelectedRow();
                String course_number = table.getValueAt(row, 0).toString();
                String course_name = table.getValueAt(row, 1).toString();
                String credits = table.getValueAt(row, 2).toString();
                String teacher = table.getValueAt(row, 3).toString();
                String class_sec = table.getValueAt(row, 4).toString();


                // Open a new frame to display the selected data
                JFrame f4 = new JFrame("Comsats University Islamabad");
                ImageIcon logo= new ImageIcon("Cuiframe.logo.jpeg");
                f4.setIconImage(logo.getImage());
                // JPanel panel4=new JPanel();

                f4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ImageIcon background3 = new ImageIcon(Main.class.getResource("background.cui.png"));
                JLabel backgroundLabel3 = new JLabel(background3);
                f4.setContentPane(backgroundLabel3);


                JLabel attendance = new JLabel("Class Attendance Details :");
                attendance.setBounds(0, 5, 120, 20);
                attendance.setForeground(Color.white);
                Font f = new Font("Ariel", Font.BOLD, 22);
                attendance.setFont(f);
                // panel4.setBounds(10,350,630,30);


                JProgressBar progressBar = new JProgressBar();
                progressBar.setStringPainted(true);
                progressBar.setPreferredSize(new Dimension(200, 30));
                if (row == 0) {
                    progressBar.setMinimum(0);
                    progressBar.setMaximum(100);
                    progressBar.setValue(70);
                    //JOptionPane.showMessageDialog(null,"Your Attendace is lower than 75%");
                    progressBar.setForeground(Color.green);
                    progressBar.setBackground(Color.red);

//--->Table 1 :-
                    String[][] data = {
                            {"Quiz 1", "5", "5", "Tuesday, 21 March 2023"}, {"Quiz 2", "5", "5", "Monday, 03 April 2023"},
                            {"Quiz 3", "5", "5", "Thursday, 20 April 2023"}, {"Quiz 4", "5", "5", "Friday, 28 April 2023"},

                    };
                    String[] columnname = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table = new JTable(data, columnname);
                    f4.add(new JScrollPane(table));
                    table.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                    headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table.getTableHeader().setDefaultRenderer(headerRenderer);

//       -->Table 2:-

                    String[][] data2 = {
                            {"Assignment 1", "5", "5", "Tuesday, 21 March 2023"}, {"Assignment 2", "5", "5", "Monday, 03 April 2023"},
                            {"Assignment 3", "5", "5", "Thursday, 20 April 2023"}, {"Assignment 4", "5", "5", "Friday, 28 April 2023"},

                    };
                    String[] columnname2 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table2 = new JTable(data2, columnname2);
                    f4.add(new JScrollPane(table2));
                    table2.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer2 = new DefaultTableCellRenderer();
                    headerRenderer2.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer2.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer2.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table2.getTableHeader().setDefaultRenderer(headerRenderer2);


//                    -->Table3:-
                    String[][] data3 = {
                            {"Mid", "20", "25", "Friday, 05 May 2023"}

                    };
                    String[] columnname3 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table3 = new JTable(data3, columnname3);
                    f4.add(new JScrollPane(table3));
                    table3.setPreferredScrollableViewportSize(new Dimension(550, 30));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer3 = new DefaultTableCellRenderer();
                    headerRenderer3.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer3.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer3.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table3.getTableHeader().setDefaultRenderer(headerRenderer3);


                }
                else if (row == 1) {
                    progressBar.setMinimum(0);
                    progressBar.setMaximum(100);
                    progressBar.setValue(85);
                    progressBar.setForeground(Color.green);
                    progressBar.setBackground(Color.red);



//--->Table 1 :-
                String[][] data = {
                        {"Quiz 1", "3", "5", "Tuesday, 21 March 2023"}, {"Quiz 2", "5", "5", "Monday, 03 April 2023"},
                        {"Quiz 3", "4.5", "5", "Thursday, 20 April 2023"}, {"Quiz 4", "5", "5", "Friday, 28 April 2023"},

                };
                String[] columnname = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                JTable table = new JTable(data, columnname);
                f4.add(new JScrollPane(table));
                table.setPreferredScrollableViewportSize(new Dimension(550, 100));
                // Create a custom header cell renderer
                DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
                headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
                headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                table.getTableHeader().setDefaultRenderer(headerRenderer);

//       -->Table 2:-

                String[][] data2 = {
                        {"Assignment 1", "5", "5", "Tuesday, 21 March 2023"}, {"Assignment 2", "3", "5", "Monday, 03 April 2023"},
                        {"Assignment 3", "4", "5", "Thursday, 20 April 2023"}, {"Assignment 4", "4", "5", "Friday, 28 April 2023"},

                };
                String[] columnname2 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                JTable table2 = new JTable(data2, columnname2);
                f4.add(new JScrollPane(table2));
                table2.setPreferredScrollableViewportSize(new Dimension(550, 100));
                // Create a custom header cell renderer
                DefaultTableCellRenderer headerRenderer2 = new DefaultTableCellRenderer();
                headerRenderer2.setBackground(Color.BLUE); // Set the desired color for column names
                headerRenderer2.setForeground(Color.WHITE); // Set the desired font color for column names
                headerRenderer2.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                table2.getTableHeader().setDefaultRenderer(headerRenderer2);


//                    -->Table3:-
                String[][] data3 = {
                        {"Mid", "19", "25", "Friday, 05 May 2023"}

                };
                String[] columnname3 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                JTable table3 = new JTable(data3, columnname3);
                f4.add(new JScrollPane(table3));
                table3.setPreferredScrollableViewportSize(new Dimension(550, 30));
                // Create a custom header cell renderer
                DefaultTableCellRenderer headerRenderer3 = new DefaultTableCellRenderer();
                headerRenderer3.setBackground(Color.BLUE); // Set the desired color for column names
                headerRenderer3.setForeground(Color.WHITE); // Set the desired font color for column names
                headerRenderer3.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                table3.getTableHeader().setDefaultRenderer(headerRenderer3);

            }



                else if(row==2) {
                    progressBar.setMinimum(0);
                    progressBar.setMaximum(100);
                    progressBar.setValue(80);
                    progressBar.setForeground(Color.green);
                    progressBar.setBackground(Color.red);


//--->Table 1 :-
                    String[][] data = {
                            {"Quiz 1", "6", "6", "Tuesday, 21 March 2023"}, {"Quiz 2", "5", "6", "Monday, 03 April 2023"},
                            {"Quiz 3", "4.5", "6", "Thursday, 20 April 2023"}, {"Quiz 4", "6", "6", "Friday, 28 April 2023"},

                    };
                    String[] columnname = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table = new JTable(data, columnname);
                    f4.add(new JScrollPane(table));
                    table.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                    headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table.getTableHeader().setDefaultRenderer(headerRenderer);

//       -->Table 2:-

                    String[][] data2 = {
                            {"Assignment 1", "5", "5", "Tuesday, 21 March 2023"}, {"Assignment 2", "3", "5", "Monday, 03 April 2023"},
                            {"Assignment 3", "4", "5", "Thursday, 20 April 2023"}, {"Assignment 4", "4", "5", "Friday, 28 April 2023"},

                    };
                    String[] columnname2 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table2 = new JTable(data2, columnname2);
                    f4.add(new JScrollPane(table2));
                    table2.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer2 = new DefaultTableCellRenderer();
                    headerRenderer2.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer2.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer2.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table2.getTableHeader().setDefaultRenderer(headerRenderer2);


//                    -->Table3:-
                    String[][] data3 = {
                            {"Mid", "22", "25", "Friday, 05 May 2023"}

                    };
                    String[] columnname3 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table3 = new JTable(data3, columnname3);
                    f4.add(new JScrollPane(table3));
                    table3.setPreferredScrollableViewportSize(new Dimension(550, 30));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer3 = new DefaultTableCellRenderer();
                    headerRenderer3.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer3.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer3.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table3.getTableHeader().setDefaultRenderer(headerRenderer3);


                }


                else if(row==3){
                    progressBar.setMinimum(0);
                    progressBar.setMaximum(100);
                    progressBar.setValue(90);
                    progressBar.setForeground(Color.green);
                    progressBar.setBackground(Color.red);




//--->Table 1 :-
                    String[][] data = {
                            {"Quiz 1", "10", "10", "Tuesday, 21 March 2023"}, {"Quiz 2", "9", "10", "Monday, 03 April 2023"},
                            {"Quiz 3", "4.5", "5", "Thursday, 20 April 2023"}, {"Quiz 4", "10", "10", "Friday, 28 April 2023"},

                    };
                    String[] columnname = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table = new JTable(data, columnname);
                    f4.add(new JScrollPane(table));
                    table.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                    headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table.getTableHeader().setDefaultRenderer(headerRenderer);

//       -->Table 2:-

                    String[][] data2 = {
                            {"Assignment 1", "5", "5", "Tuesday, 21 March 2023"}, {"Assignment 2", "5", "5", "Monday, 03 April 2023"},
                            {"Assignment 3", "4", "5", "Thursday, 20 April 2023"}, {"Assignment 4", "5", "5", "Friday, 28 April 2023"},

                    };
                    String[] columnname2 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table2 = new JTable(data2, columnname2);
                    f4.add(new JScrollPane(table2));
                    table2.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer2 = new DefaultTableCellRenderer();
                    headerRenderer2.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer2.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer2.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table2.getTableHeader().setDefaultRenderer(headerRenderer2);


//                    -->Table3:-
                    String[][] data3 = {
                            {"Mid", "24", "25", "Friday, 05 May 2023"}

                    };
                    String[] columnname3 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table3 = new JTable(data3, columnname3);
                    f4.add(new JScrollPane(table3));
                    table3.setPreferredScrollableViewportSize(new Dimension(550, 30));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer3 = new DefaultTableCellRenderer();
                    headerRenderer3.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer3.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer3.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table3.getTableHeader().setDefaultRenderer(headerRenderer3);




                }

                else{
                    progressBar.setMinimum(0);
                    progressBar.setMaximum(100);
                    progressBar.setValue(60);
                 //   JOptionPane.showMessageDialog(null,"Your Attendace is lower than 75%");
                    progressBar.setForeground(Color.green);
                    progressBar.setBackground(Color.red);



//--->Table 1 :-
                    String[][] data = {
                            {"Quiz 1", "3.5", "5", "Tuesday, 21 March 2023"}, {"Quiz 2", "5", "5", "Monday, 03 April 2023"},
                            {"Quiz 3", "4.5", "5", "Thursday, 20 April 2023"}, {"Quiz 4", "5", "5", "Friday, 28 April 2023"},

                    };
                    String[] columnname = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table = new JTable(data, columnname);
                    f4.add(new JScrollPane(table));
                    table.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
                    headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table.getTableHeader().setDefaultRenderer(headerRenderer);

//       -->Table 2:-

                    String[][] data2 = {
                            {"Assignment 1", "2", "2", "Tuesday, 21 March 2023"}, {"Assignment 2", "1.75", "2", "Monday, 03 April 2023"},
                            {"Assignment 3", "2", "2", "Thursday, 20 April 2023"}, {"Assignment 4", "1.75", "2", "Friday, 28 April 2023"},

                    };
                    String[] columnname2 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table2 = new JTable(data2, columnname2);
                    f4.add(new JScrollPane(table2));
                    table2.setPreferredScrollableViewportSize(new Dimension(550, 100));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer2 = new DefaultTableCellRenderer();
                    headerRenderer2.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer2.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer2.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table2.getTableHeader().setDefaultRenderer(headerRenderer2);


//                    -->Table3:-
                    String[][] data3 = {
                            {"Mid", "18", "25", "Friday, 05 May 2023"}

                    };
                    String[] columnname3 = {"Title", "Obtain Marks", "Total Marks", "Date & Time"};

                    JTable table3 = new JTable(data3, columnname3);
                    f4.add(new JScrollPane(table3));
                    table3.setPreferredScrollableViewportSize(new Dimension(550, 30));
                    // Create a custom header cell renderer
                    DefaultTableCellRenderer headerRenderer3 = new DefaultTableCellRenderer();
                    headerRenderer3.setBackground(Color.BLUE); // Set the desired color for column names
                    headerRenderer3.setForeground(Color.WHITE); // Set the desired font color for column names
                    headerRenderer3.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
                    table3.getTableHeader().setDefaultRenderer(headerRenderer3);


                }





//panel4.setLayout(null);
                // Add the progress bar to the frame
                f4.add(attendance);
               // f4.add(panel4,BorderLayout.CENTER);
                f4.getContentPane().setLayout(new FlowLayout());
                f4.getContentPane().add(progressBar);
                f4.setSize(700, 450);
                f4.setLocationRelativeTo(null);
                f4.setVisible(true);





            }
        });




    }
    public void registration_card(JFrame registration_f){

        JFrame f3=new JFrame("Comsats University Islamabad");
        JPanel panel2=new JPanel();
        ImageIcon logo= new ImageIcon("Cuiframe.logo.jpeg");
        f3.setIconImage(logo.getImage());

        ImageIcon background3=new ImageIcon(Main.class.getResource("background.cui.png"));
        JLabel backgroundLabel3 = new JLabel(background3);
        f3.setContentPane(backgroundLabel3);

        JPanel panel3=new JPanel();

        JLabel label_panel3=new JLabel("Student Registration Card");
        label_panel3.setBounds(250,5,400,30);



        ImageIcon image=new ImageIcon("whatsapp.img.jpg");
        JLabel logo_image= new JLabel(image);
        JLabel name=new JLabel("Name:	MUHAMMAD SAAD NADEEM");
        JLabel program=new JLabel("Program:\tBCS (Bachelor of Science in Computer Science)");
        JLabel session=new JLabel("Session:\tSP23 (Spring 2023)");
        JLabel reg_no=new JLabel("Reg No:\tCIIT/SP22-BCS-086/SWL");
        JLabel courses=new JLabel("Courses:\t5");
        JLabel campus=new JLabel("Campus:\tSWL");


        name.setBounds(20,140,300,30);
        program.setBounds(20,190,500,30);
        session.setBounds(20,240,300,30);
        reg_no.setBounds(800,140,400,30);
        courses.setBounds(800,190,300,30);
        campus.setBounds(800,240,300,30);
        logo_image.setBounds(1080,140,180,140);
        panel3.setBounds(250,350,800,40);
        panel2.setBounds(250,400,800,150);

        Font f2=new Font("Ariel",Font.BOLD,15);
        name.setFont(f2);
        program.setFont(f2);
        session.setFont(f2);
        courses.setFont(f2);
        campus.setFont(f2);
        reg_no.setFont(f2);


        Image scaledImage = image.getImage().getScaledInstance(
                logo_image.getWidth(), logo_image.getHeight(), Image.SCALE_SMOOTH);
        logo_image.setIcon(new ImageIcon(scaledImage));
        logo_image.setText(null);


        Font f=new Font("Ariel",Font.BOLD,25);
        label_panel3.setFont(f);

        panel3.setBackground(Color.BLUE);
        label_panel3.setForeground(Color.white);


        String  [][]  data= {
                {"1","MTH104","Calculus","3","Dr.Shahid","BCS 3 B B"},{"2","MGT101","ITM","3","Suhail Qureshi","BCS 3 B B"},
                {"3","MTH231","LInear Algebra","3","Dr.Najima","BCS 3 B B"},{"4","CSC241","Object Oriented Programming","4","Dr.Javaid Farzand","BCS 3 B B"},
                {"5","CSC291","SEC","3","Usman Nasir","BCS 3 B B"}
        };
        String [] columnname={"S.No","Course Number","Course Name","Credits","Teacher","Class"};

        JTable table = new JTable(data, columnname);
        panel2.add(new JScrollPane(table));
        table.setPreferredScrollableViewportSize(new Dimension(800, 130));
        // Create a custom header cell renderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
        headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
        table.getTableHeader().setDefaultRenderer(headerRenderer);


        JLabel label_panel2=new JLabel("CUOnline , Principal Seat © 2018-COMSATS ®");
        label_panel2.setBounds(520,550,400,30);
        label_panel2.setForeground(Color.white);


        panel2.setLayout(new FlowLayout());
        panel3.setLayout(null);
        panel2.setBackground(Color.white);
        panel3.add(label_panel3);
       // panel2.add(label_panel2);
        f3.add(name);
        f3.add(program);
        f3.add(session);
        f3.add(courses);
        f3.add(campus);
        f3.add(reg_no);
        f3.add(logo_image);
        f3.add(panel2);
        f3.add(panel3);
        f3.add(label_panel2);


        f3.setSize(1400,700);
        f3.setLocationRelativeTo(null);
        f3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f3.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f3.setVisible(true);

    }


    public void fee(JFrame fee_f){

        JFrame f3=new JFrame("Comsats University Islamabad");
        JPanel panel2=new JPanel();
        ImageIcon logo= new ImageIcon("Cuiframe.logo.jpeg");
        f3.setIconImage(logo.getImage());

        ImageIcon background3=new ImageIcon(Main.class.getResource("background.cui.png"));
        JLabel backgroundLabel3 = new JLabel(background3);
        f3.setContentPane(backgroundLabel3);

        ImageIcon image1=new ImageIcon("cuiimg1.jpeg");
        JLabel logo2= new JLabel(image1);
        logo2.setBounds(2,2,500,300);


        JPanel panel3=new JPanel();

        JLabel label_panel3=new JLabel("Student Semester Fee Details");
        JLabel img1=new JLabel("Muhammad Saad Nadeem");
        JLabel img2=new JLabel("SP22-BCS-086 ");
        img1.setForeground(Color.white);
        img2.setForeground(Color.white);


        img1.setBounds(910,160,180,30);
        img2.setBounds(920,190,180,30);

        label_panel3.setBounds(250,5,400,30);
        panel3.setBounds(250,350,800,40);
        panel2.setBounds(250,400,800,150);




        ImageIcon image=new ImageIcon("whatsapp.img.jpg");
        JLabel logo_image= new JLabel(image);
        logo_image.setBounds(1080,140,180,140);

        Image scaledImage = image.getImage().getScaledInstance(
                logo_image.getWidth(), logo_image.getHeight(), Image.SCALE_SMOOTH);
        logo_image.setIcon(new ImageIcon(scaledImage));
        logo_image.setText(null);


        Font f=new Font("Ariel",Font.BOLD,25);
        label_panel3.setFont(f);

        panel3.setBackground(Color.BLUE);
        label_panel3.setForeground(Color.white);


        String  [][]  data= {
                {"1700751573","Semester Fee","Thursday 10 March 2022","70500.00","N/A","N/A"},
                {"1700757026","Semester Fee","Monday, 22 August 2022","70500.00","N/A","N/A"},
                {"1700770802","Semester Fee","Friday, 03 February 2023","70500.00","N/A","N/A"}
        };
        String [] columnname={"Challan No","Description","Due Date","Amount Due","First Due Date","2nd Due Date"};

        JTable table = new JTable(data, columnname);
        panel2.add(new JScrollPane(table));
        table.setPreferredScrollableViewportSize(new Dimension(800, 130));
        // Create a custom header cell renderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
        headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
        table.getTableHeader().setDefaultRenderer(headerRenderer);


        JLabel label_panel2=new JLabel("CUOnline , Principal Seat © 2018-COMSATS ®");
        label_panel2.setBounds(520,550,400,30);
        label_panel2.setForeground(Color.white);


        panel2.setLayout(new FlowLayout());
        panel3.setLayout(null);
        panel2.setBackground(Color.white);
        panel3.add(label_panel3);
        f3.add(img1);
        f3.add(img2);
        f3.add(logo_image);
        f3.add(panel2);
        f3.add(panel3);
        f3.add(label_panel2);
        f3.add(logo2);


        f3.setSize(1400,700);
        f3.setLocationRelativeTo(null);
        f3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f3.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f3.setVisible(true);

    }

    public void result_card(JFrame result_f){

        JFrame f3=new JFrame("Comsats University Islamabad");
        JPanel panel2=new JPanel();
        ImageIcon logo= new ImageIcon("Cuiframe.logo.jpeg");
        f3.setIconImage(logo.getImage());

        ImageIcon background3=new ImageIcon(Main.class.getResource("background.cui.png"));
        JLabel backgroundLabel3 = new JLabel(background3);
        f3.setContentPane(backgroundLabel3);

        JPanel panel3=new JPanel();

        JLabel label_panel3=new JLabel("Student Result Card");
        label_panel3.setBounds(250,5,400,30);



        ImageIcon image=new ImageIcon("whatsapp.img.jpg");
        JLabel logo_image= new JLabel(image);
        JLabel name=new JLabel("Name:	MUHAMMAD SAAD NADEEM");
        JLabel program=new JLabel("Program:\tBCS (Bachelor of Science in Computer Science)");
        JLabel session=new JLabel("Session:\tSP23 (Spring 2023)");
        JLabel reg_no=new JLabel("Reg No:\tCIIT/SP22-BCS-086/SWL");
        JLabel f_name=new JLabel("Father Name:   Muhammad Nadeem");
        JLabel campus=new JLabel("Campus:\tSWL");
        JLabel gpa=new JLabel("GPA: 3.73");
        JLabel cgpa=new JLabel("CGPA: 3.66");
        JLabel scholarship=new JLabel("Scholastic Status: GAS");


        name.setBounds(20,140,300,30);
        program.setBounds(20,190,500,30);
        session.setBounds(20,240,300,30);
        reg_no.setBounds(800,190,400,30);
        f_name.setBounds(800,140,400,30);
        campus.setBounds(800,240,300,30);
        logo_image.setBounds(1080,140,180,140);
        panel3.setBounds(250,350,800,40);
        panel2.setBounds(250,400,800,150);

        Font f2=new Font("Ariel",Font.BOLD,15);
        name.setFont(f2);
        program.setFont(f2);
        session.setFont(f2);
        f_name.setFont(f2);
        campus.setFont(f2);
        reg_no.setFont(f2);

        Image scaledImage = image.getImage().getScaledInstance(
                logo_image.getWidth(), logo_image.getHeight(), Image.SCALE_SMOOTH);
        logo_image.setIcon(new ImageIcon(scaledImage));
        logo_image.setText(null);



        Font f=new Font("Ariel",Font.BOLD,25);
        label_panel3.setFont(f);

        panel3.setBackground(Color.BLUE);
        label_panel3.setForeground(Color.white);


        String  [][]  data= {
                {"CSC102","Discrete Structures","3","85","A","4"},{"CSC103", "Programming Fundamentals", "4","89","A","4"},
                {"EEE241", "Digital Logic Design", "4","82","A-","3.66"},{"HUM102", "Report Writing Skills","3","75","B+","3.33"},
                {"MGT100","Introduction to Business","3","75","B+","3.33"},{"MTH101","Calculus I","3","85","A","4"}
        };
        String [] columnname={"Course No","Course Title","Credit","Credits","LG","GP"};

        JTable table = new JTable(data, columnname);
        panel2.add(new JScrollPane(table));
        table.setPreferredScrollableViewportSize(new Dimension(800, 130));
        // Create a custom header cell renderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
        headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
        table.getTableHeader().setDefaultRenderer(headerRenderer);


        JLabel label_panel2=new JLabel("CUOnline , Principal Seat © 2018-COMSATS ®");
        label_panel2.setBounds(520,550,400,30);
        gpa.setBounds(260,550,400,30);
        cgpa.setBounds(260,570,400,30);
        scholarship.setBounds(260,590,400,30);
        label_panel2.setForeground(Color.white);
        gpa.setForeground(Color.white);
        cgpa.setForeground(Color.white);
        scholarship.setForeground(Color.white);



        panel2.setLayout(new FlowLayout());
        panel3.setLayout(null);
        panel2.setBackground(Color.white);
        panel3.add(label_panel3);
        // panel2.add(label_panel2);
        f3.add(name);
        f3.add(program);
        f3.add(session);
        f3.add(f_name);
        f3.add(campus);
        f3.add(reg_no);
        f3.add(logo_image);
        f3.add(panel2);
        f3.add(panel3);
        f3.add(label_panel2);
        f3.add(gpa);
        f3.add(cgpa);
        f3.add(scholarship);


        f3.setSize(1400,700);
        f3.setLocationRelativeTo(null);
        f3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f3.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f3.setVisible(true);

    }

    public void profile(JFrame profile_f){

        JFrame f3=new JFrame("Comsats University Islamabad");
        JPanel panel2=new JPanel();
        ImageIcon logo= new ImageIcon("Cuiframe.logo.jpeg");
        f3.setIconImage(logo.getImage());

        ImageIcon background3=new ImageIcon(Main.class.getResource("background.cui.png"));
        JLabel backgroundLabel3 = new JLabel(background3);
        f3.setContentPane(backgroundLabel3);


        JPanel panel3=new JPanel();

        JLabel label_panel3=new JLabel("Student Profile");

        JLabel l1=new JLabel("Dear Student,");
        JLabel l2=new JLabel("CUI has created your account on Office365. You can now use applications like MS Teams, MS Office365 and several others from this account.");
        JLabel l3=new JLabel("Please Login to Office 365");
        JLabel l4=new JLabel("Office 365 Email Address : SP22-BCS-086@STUDENTS.CUISAHIWAL.EDU.PK");
        JLabel l5=new JLabel("Office 365 Password : No Password Available");
        JLabel l6=new JLabel("In case of any query please contact IT Support Team. Good Luck!");
        JLabel l7=new JLabel("Registration Number : CIIT/SP22-BCS-086/SWL");
        JLabel l8=new JLabel("Full Name : MUHAMMAD SAAD NADEEM");
        JLabel l9=new JLabel("Father Name : MUHAMMAD NADEEM");
        JLabel l10=new JLabel("Date of Birth : 27 Jun 2003");

        l1.setBounds(10,20,500,30);
        l2.setBounds(10,55,1000,30);
        l3.setBounds(10,90,500,30);
        l4.setBounds(10,125,500,30);
        l5.setBounds(10,160,500,30);
        l6.setBounds(10,195,500,30);
        l7.setBounds(10,230,500,30);
        l8.setBounds(10,265,500,30);
        l9.setBounds(10,300,500,30);
        l10.setBounds(10,335,500,30);
        Font f2=new Font("Ariel",Font.BOLD,14);
        l1.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l7.setFont(f2);
        l8.setFont(f2);
        l9.setFont(f2);
        l10.setFont(f2);




        label_panel3.setBounds(270,5,400,30);
        panel3.setBounds(250,350,800,40);
        panel2.setBounds(250,400,800,90);





        ImageIcon image=new ImageIcon("whatsapp.img.jpg");
        JLabel logo_image= new JLabel(image);
        logo_image.setBounds(1080,140,180,140);

        Image scaledImage = image.getImage().getScaledInstance(
                logo_image.getWidth(), logo_image.getHeight(), Image.SCALE_SMOOTH);
        logo_image.setIcon(new ImageIcon(scaledImage));
        logo_image.setText(null);


        Font f=new Font("Ariel",Font.BOLD,25);
        label_panel3.setFont(f);

        panel3.setBackground(Color.BLUE);
        label_panel3.setForeground(Color.white);


        String  [][]  data= {
                {"saad.swl786@gmail.com","03174433711","SELF","Edit"},
                {"saad.swl786@gmail.com","           ","Parents","Edit"}
        };
        String [] columnname={"Email Adress","Contact Number","Contact Person/Type","Actions"};

        JTable table = new JTable(data, columnname);
        panel2.add(new JScrollPane(table));
        table.setPreferredScrollableViewportSize(new Dimension(800, 130));
        // Create a custom header cell renderer
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLUE); // Set the desired color for column names
        headerRenderer.setForeground(Color.WHITE); // Set the desired font color for column names
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Align column names to center
        table.getTableHeader().setDefaultRenderer(headerRenderer);


        JLabel label_panel2=new JLabel("CUOnline , Principal Seat © 2018-COMSATS ®");
        label_panel2.setBounds(520,490,400,30);
        label_panel2.setForeground(Color.white);


        panel2.setLayout(new FlowLayout());
        panel3.setLayout(null);
        panel2.setBackground(Color.white);
        panel3.add(label_panel3);
        f3.add(l1);
        f3.add(l2);
        f3.add(l3);
        f3.add(l4);
        f3.add(l5);
        f3.add(l6);
        f3.add(l7);
        f3.add(l8);
        f3.add(l9);
        f3.add(l10);
        f3.add(logo_image);
        f3.add(panel2);
        f3.add(panel3);
        f3.add(label_panel2);

        f3.setSize(1400,700);
        f3.setLocationRelativeTo(null);
        f3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f3.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f3.setVisible(true);

    }
}
//-->Main class:-
public class Main {
    public static void main(String[] args) {

//-->Call Login Constructor:-
        Login login= new Login();

    }
}

