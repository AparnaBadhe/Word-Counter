package cscorner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.*;  
import java.awt.event.*;  


public class DemoFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 423);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word Counter System");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(240, 10, 367, 45);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrEnterWord = new JTextArea();
		txtrEnterWord.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrEnterWord.setBackground(new Color(255, 255, 224));
		txtrEnterWord.setBounds(182, 118, 425, 59);
		contentPane.add(txtrEnterWord);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textArea_1.setBounds(507, 298, 149, 59);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("Count :");
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(435, 300, 85, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter :");
		lblNewLabel_2.setBackground(new Color(0, 0, 139));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(96, 118, 99, 59);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Count");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtrEnterWord.getText();
				int count = countWords(text);
                textArea_1.setText(String.valueOf(count));
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(340, 202, 99, 38);
		contentPane.add(btnNewButton);			
		}
	private int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        
        String[] words = text.split("\\s+");
        return words.length;
	}
}

