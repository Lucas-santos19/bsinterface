package Form;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class interface1 implements ActionListener {

    JFrame frame;
    JPanel panel;

    public void screen(){

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucas\\IdeaProjects\\interface_bsi\\src\\assets\\cadastro.png");
        frame = new JFrame();
        frame.setIconImage(icon);

        frame.setTitle("Registro de dados");
        frame.setBounds(820,300,300,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setVisible(true);


        frame.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);

        frame.add(panel);

        controles();
        textos();
        radios();
    }

    public void radios(){
        JRadioButton   rm1 =   new JRadioButton("Masculino");
        JRadioButton   rf2 =   new JRadioButton("Feminino");
        JRadioButton   rnb3 =  new JRadioButton("Não Binário");
        ButtonGroup    Rgp =   new ButtonGroup();

        rm1.setBounds(10,240,100,30);
        rm1.setBackground(Color.darkGray);
        rm1.setForeground(Color.white);

        rf2.setBounds(10,260,100,30);
        rf2.setBackground(Color.darkGray);
        rf2.setForeground(Color.white);

        rnb3.setBounds(10,280,100,30);
        rnb3.setBackground(Color.darkGray);
        rnb3.setForeground(Color.white);


        Rgp.add(rm1);
        Rgp.add(rf2);
        Rgp.add(rnb3);


        panel.add(rm1);
        panel.add(rf2);
        panel.add(rnb3);
    }

    public void textos()  {
        MaskFormatter data = null;

        JTextField nome = new JTextField();
        JTextField faculdade = new JTextField();;
        JTextField ra = new JTextField();;
        JTextField nascimento = new JFormattedTextField(data);

        JLabel tnome = new JLabel();;
        JLabel tfacul = new JLabel();;
        JLabel tra = new JLabel();;
        JLabel tnas = new JLabel();;


        try{
            data = new MaskFormatter("##/##/####");
            data.setPlaceholderCharacter('_');
        } catch (ParseException e){
            e.printStackTrace();
        }

        Dimension size = nome.getPreferredSize();

        nome.setBounds(10,50,200,25);
        nascimento.setBounds(10,200,200,25);
        faculdade.setBounds(10,100 ,200,25);
        ra.setBounds(10,150,200,25);

        tnome.setText("Seu Nome");
        tnome.setBounds(10,30,200,20);
        tnome.setForeground(Color.white);

        tfacul.setText("Seu Curso");
        tfacul.setBounds(10,80,200,20);
        tfacul.setForeground(Color.white);

        tra.setText("Seu RA");
        tra.setBounds(10,130,200,20);
        tra.setForeground(Color.white);

        tnas.setText("Data de nascimento");
        tnas.setBounds(10,180,200,20);
        tnas.setForeground(Color.white);

        panel.add(tnas);
        panel.add(nascimento);

        panel.add(tnome);
        panel.add(nome);

        panel.add(tfacul);
        panel.add(faculdade);

        panel.add(tra);
        panel.add(ra);
    }

    public void controles(){
        JButton limpar =  new JButton();;
        JButton enviar =  new JButton();;

        enviar.setText("Enviar");
        enviar.setBounds(10,430,90,20);

        limpar.setText("Limpar");
        limpar.setBounds(115,430,90,20);

        panel.add(enviar);
        panel.add(limpar);
    }

    public interface1(){
        screen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
