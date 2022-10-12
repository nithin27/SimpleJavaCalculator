import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends Thread implements  ActionListener {
	
	double number1 = 0, number2 = 0,result =0;
	int calculation;
	String value;
	
	
	JFrame frame = new JFrame("Calculator");    
	JLabel label = new JLabel();
	JTextField label1 = new JTextField();
	JTextField textfield = new JTextField();
	
	JRadioButton onButton = new JRadioButton("on");
	JRadioButton offButton = new JRadioButton("off");
	
	JButton zeroButton = new JButton("0");
	JButton oneButton = new JButton("1");
	JButton twoButton = new JButton("2");
	JButton threeButton = new JButton("3");
	JButton fourButton  = new JButton("4");
	JButton fiveButton = new JButton("5");
	JButton sixButton = new JButton("6");
	JButton sevenButton = new JButton("7");
	JButton eightButton = new JButton("8");
	JButton nineButton = new JButton("9");
	JButton dotButton = new JButton(".");
	
	JButton clearButton = new JButton("c");
	JButton deleteButton = new JButton("Del");
	
	JButton addButton = new JButton("+");
	JButton subButton = new JButton("-");
	JButton mulButton = new JButton("x");
	JButton divButton = new JButton("/");
	JButton equalButton = new JButton("=");
	JButton lightButton = new JButton("Col");
	
	Calculator(){     											// Constructor.
		prepareGui();
		addComponets();
		addActionEvent();
	}
	
	public void prepareGui() {   								//  method for frame.
		frame.setSize(300,510);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addComponets() {								// Add components to frame, set size and color to button
																// text fields
		
		
		
		label.setBounds(10,0,280,40);
		frame.add(label);
		label.setForeground(Color.white);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textfield.setBounds(10,35,280,50);
		textfield.setFont(new Font("Arial",Font.BOLD,20));
		textfield.setEditable(false);
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);
		textfield.setForeground(Color.black);
		
		
		label1.setBounds(0,0,0,0);
		label1.setBackground(null);
		label1.setForeground(null);
		label1.setEditable(false);
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		frame.add(label1);
		
		frame.add(textfield);
		
		
		
		onButton.setBounds(10,95,70,20);
		onButton.setSelected(true);
		onButton.setFont(new Font("Arial", Font.BOLD,14));
		onButton.setBackground(Color.black);
		onButton.setForeground(Color.green);
		frame.add(onButton);
		
		
		offButton.setBounds(80,95,70,20);
		offButton.setSelected(false);
		offButton.setFont(new Font("Arial", Font.BOLD,14));
		offButton.setBackground(Color.black);
		offButton.setForeground(Color.red);
		frame.add(offButton);
		
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(onButton);
		btnGroup.add(offButton);
		
		
		
		sevenButton.setBounds(12,130,60,60);
		sevenButton.setFont(new Font("Arial", Font.BOLD,15));
		sevenButton.setForeground(Color.white);
		sevenButton.setBackground(Color.black);
		frame.add(sevenButton);
		
		eightButton.setBounds(84,130,60,60);
		eightButton.setFont(new Font("Arial", Font.BOLD,15));
		eightButton.setForeground(Color.white);
		eightButton.setBackground(Color.black);
		frame.add(eightButton);
		
		nineButton.setBounds(156,130,60,60);
		nineButton.setFont(new Font("Arial", Font.BOLD,15));
		nineButton.setForeground(Color.white);
		nineButton.setBackground(Color.black);
		frame.add(nineButton);
		
		divButton.setBounds(228,130,60,60);
		divButton.setFont(new Font("Arial", Font.BOLD,15));
		divButton.setForeground(Color.black);
		divButton.setBackground(Color.yellow);
		frame.add(divButton);
		
		
		
		fourButton.setBounds(12,202,60,60);
		fourButton.setFont(new Font("Arial", Font.BOLD,15));
		fourButton.setForeground(Color.white);
		fourButton.setBackground(Color.black);
		frame.add(fourButton);
		
		fiveButton.setBounds(84,202,60,60);
		fiveButton.setFont(new Font("Arial", Font.BOLD,15));
		fiveButton.setForeground(Color.white);
		fiveButton.setBackground(Color.black);
		frame.add(fiveButton);
		
		sixButton.setBounds(156,202,60,60);
		sixButton.setFont(new Font("Arial", Font.BOLD,15));
		sixButton.setForeground(Color.white);
		sixButton.setBackground(Color.black);
		frame.add(sixButton);
		
		mulButton.setBounds(228,202,60,60);
		mulButton.setFont(new Font("Arial", Font.BOLD,15));
		mulButton.setForeground(Color.black);
		mulButton.setBackground(Color.yellow);
		frame.add(mulButton);
		
		
		
		oneButton.setBounds(12,274,60,60);
		oneButton.setFont(new Font("Arial", Font.BOLD,15));
		oneButton.setForeground(Color.white);
		oneButton.setBackground(Color.black);
		frame.add(oneButton);
		
		twoButton.setBounds(84,274,60,60);
		twoButton.setFont(new Font("Arial", Font.BOLD,15));
		twoButton.setForeground(Color.white);
		twoButton.setBackground(Color.black);
		frame.add(twoButton);
		
		threeButton.setBounds(156,274,60,60);
		threeButton.setFont(new Font("Arial", Font.BOLD,15));
		threeButton.setForeground(Color.white);
		threeButton.setBackground(Color.black);
		frame.add(threeButton);
		
		subButton.setBounds(228,274,60,60);
		subButton.setFont(new Font("Arial", Font.BOLD,15));
		subButton.setForeground(Color.black);
		subButton.setBackground(Color.yellow);
		frame.add(subButton);
		
		
		
		deleteButton.setBounds(12,346,60,60);
		deleteButton.setFont(new Font("Arial", Font.BOLD,15));
		deleteButton.setForeground(Color.white);
		deleteButton.setBackground(Color.red);
		frame.add(deleteButton);
		
		zeroButton.setBounds(84,346,60,60);
		zeroButton.setFont(new Font("Arial", Font.BOLD,15));
		zeroButton.setForeground(Color.white);
		zeroButton.setBackground(Color.black);
		frame.add(zeroButton);
		
		dotButton.setBounds(156,346,60,60);
		dotButton.setFont(new Font("Arial", Font.BOLD,15));
		dotButton.setForeground(Color.black);
		dotButton.setBackground(Color.yellow);
		frame.add(dotButton);
		
		addButton.setBounds(228,346,60,60);
		addButton.setFont(new Font("Arial", Font.BOLD,15));
		addButton.setForeground(Color.black);
		addButton.setBackground(Color.yellow);
		frame.add(addButton);
		
		
		
		clearButton.setBounds(12,418,60,60);
		clearButton.setFont(new Font("Arial", Font.BOLD,15));
		clearButton.setForeground(Color.white);
		clearButton.setBackground(Color.red);
		frame.add(clearButton);
		
		equalButton.setBounds(84,418,130,60);
		equalButton.setFont(new Font("Arial", Font.BOLD,15));
		equalButton.setForeground(Color.white);
		equalButton.setBackground(Color.black);
		frame.add(equalButton);
		
		lightButton.setBounds(226,418,60,60);
		lightButton.setFont(new Font("Arial",Font.BOLD,15));
		lightButton.setForeground(Color.orange);
		lightButton.setBackground(Color.black);
		frame.add(lightButton);
	}
	
	
	public void addActionEvent() {
		onButton.addActionListener(this);
		offButton.addActionListener(this);
		
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
		dotButton.addActionListener(this);
		
		clearButton.addActionListener(this);
		deleteButton.addActionListener(this);
		
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		equalButton.addActionListener(this);
		lightButton.addActionListener(this);
		
		
	}
	
public void actionPerformed(ActionEvent e) {
		
		Object source =e.getSource();
		
		
		if(source == onButton) {
			
			enabel();
			
		}else if(source == offButton) {
			
			disable();
			
		}else if(source == clearButton) {  
			
			label.setText("");              						// action when click clear button.
			textfield.setText("");
			number1=0;
			number2=0;
			result =0;
			
		}else if(source == deleteButton) {   						// actions when click delete button
			
			int textLength = textfield.getText().length();
			int number = textLength-1;
			
			if(textLength > 0) {
				
				StringBuilder back = new StringBuilder(textfield.getText());
				back.deleteCharAt(number);
				textfield.setText(back.toString());
				
			}if(textfield.getText().endsWith("")) {
				
				label.setText("");
			}
			
		}else if(source == zeroButton) {
			if(textfield.getText().equals("0")) {
				return;
			}else {
				textfield.setText(textfield.getText()+"0");
			}
		}else if(source == oneButton) {
			
				textfield.setText(textfield.getText()+"1");
				
		}else if(source == twoButton) {
			
				textfield.setText(textfield.getText()+"2");
			
		}else if(source == threeButton) {
			
				textfield.setText(textfield.getText()+"3");
			
		}else if(source == fourButton) {
			
				textfield.setText(textfield.getText()+"4");
			
		}else if(source == fiveButton) {
			
				textfield.setText(textfield.getText()+"5");
			
		}else if(source == sixButton) {
			
				textfield.setText(textfield.getText()+"6");
			
		}else if(source == sevenButton) {
			
				textfield.setText(textfield.getText()+"7");
			
		}else if(source == eightButton) {
			
				textfield.setText(textfield.getText()+"8");
			
		}else if(source == nineButton) {
			
				textfield.setText(textfield.getText()+"9");
			
		}else if(source == lightButton) { 								// button to  change color of text field;
			
				label1.setText(label1.getText()+"0");
			
			if(label1.getText().equals("")) {
				textfield.setBackground(Color.white);
			}else if(label1.getText().equals("0")) {
				textfield.setBackground(Color.orange);
			}else if(label1.getText().equals("00")) {
				textfield.setBackground(Color.red);
			}else if(label1.getText().equals("000")) {
				textfield.setBackground(Color.green);
			}else if(label1.getText().equals("0000")) {
				textfield.setBackground(Color.cyan);
			}else {
				label1.setText("");
				textfield.setBackground(Color.white);
			}
		}
		else if(source == dotButton) {
			if(textfield.getText().contains(".")) {
				return;
			}else {
				textfield.setText(textfield.getText()+".");
			}
		}else if(source == addButton) {
			if(textfield.getText().contains("+")) {
				return;
			}else {
				if(textfield.getText().equals("")) {	// if text field is blank it add + icon and remone + symbol..													 
					textfield.setText("+");					// final result is when we click + button with out doing..
					textfield.setText("");					// any operation is shows nothing in text field.

				}else{
					String str = textfield.getText();		// if text field have something adding + symbol to that.. 
					number1 = Double.parseDouble(textfield.getText());		// thing.
					calculation =1;	
					label.setText(str+"+");
					textfield.setText("");
				}	
			}
				
			
			
		}else if(source == subButton) {
			if(textfield.getText().contains("-")) {
				return;
			}else {
				if(textfield.getText().equals("")) {
					textfield.setText("-");
				}else {
					String str = textfield.getText();
					number1 = Double.parseDouble(textfield.getText());
					calculation =2;			
					textfield.setText("");
					label.setText(str+"-");
				}
			}
			
		}else if(source == mulButton) {
			if(textfield.getText().contains("x")) {
				return;
			}else {
				if(textfield.getText().equals("")) {
					textfield.setText("x");
					textfield.setText("");
				}else {
					String str = textfield.getText();
					number1 = Double.parseDouble(textfield.getText());
					calculation =3;		
					textfield.setText("");
					label.setText(str+" x");
				}
			}
			
		}else if(source == divButton) {
			if(textfield.getText().contains("/")) {
				return;
			}else {
				if(textfield.getText().equals("")) {
					textfield.setText("/");
					textfield.setText("");
				}else {
					String str = textfield.getText();
					number1 = Double.parseDouble(textfield.getText());
					calculation =4;
					textfield.setText("");
					label.setText(str+"/");
				}
			}
		}else if(source == equalButton) {
			//if(textfield.getText().contains("")) {
				//textfield.setText("0");  // when click equal button in the with out doing any operation it shows..
										// 0 in the text field.
			//}
			
			number2 = Double.parseDouble(textfield.getText()); // take second value from the text field.
				              
			switch(calculation) {
			case 1:
				result = number1+number2;
				break;
			case 2:
				result = number1-number2;
				break;
			case 3:
				result = number1*number2;
				break;
			case 4:
				result = number1/number2;
				break;
			default :
				number1 = Double.parseDouble(textfield.getText());
				result = number1+0;
			}if(Double.toString(result).endsWith(".0")){   // if we get output as a non floating number remove .0
				textfield.setText(Double.toString(result).replace(".0", ""));
			}else {
				textfield.setText(Double.toString(result));
			}
            
			
        	
			label.setText("");
			number1 = result;
			}
		
	}
	
	public void enabel() {  			// function for on button.
		onButton.setEnabled(false);
		offButton.setEnabled(true);
		
		label.setEnabled(true);
		label.setEnabled(true);
		textfield.setEnabled(true);
		
		oneButton.setEnabled(true);
		twoButton.setEnabled(true);
		threeButton.setEnabled(true);
		fourButton.setEnabled(true);
		fiveButton.setEnabled(true);
		sixButton.setEnabled(true);
		sevenButton.setEnabled(true);
		eightButton.setEnabled(true);
		nineButton.setEnabled(true);
		zeroButton.setEnabled(true);
		
		addButton.setEnabled(true);
		subButton.setEnabled(true);
		divButton.setEnabled(true);
		mulButton.setEnabled(true);
		equalButton.setEnabled(true);
		dotButton.setEnabled(true);
		
		deleteButton.setEnabled(true);
		clearButton.setEnabled(true);
		
		lightButton.setEnabled(true);
		
	}
	
	public void disable() { 			// function for off button.
		label1.setText("");
		label.setText("");
		textfield.setText("");
		onButton.setEnabled(true);
		offButton.setEnabled(false);
		
		label.setEnabled(false);
		textfield.setEnabled(false);
		
		oneButton.setEnabled(false);
		twoButton.setEnabled(false);
		threeButton.setEnabled(false);
		fourButton.setEnabled(false);
		fiveButton.setEnabled(false);
		sixButton.setEnabled(false);
		sevenButton.setEnabled(false);
		eightButton.setEnabled(false);
		nineButton.setEnabled(false);
		zeroButton.setEnabled(false);
		dotButton.setEnabled(false);
		
		addButton.setEnabled(false);
		subButton.setEnabled(false);
		divButton.setEnabled(false);
		mulButton.setEnabled(false);
		equalButton.setEnabled(false);
		
		deleteButton.setEnabled(false);
		clearButton.setEnabled(false);
		
		lightButton.setEnabled(false);
	}
	
	public static void main(String ar[]) {
		new Calculator();					// object created for executing the constructor.
	}

}
