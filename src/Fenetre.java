import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Fenetre extends JFrame {
	private static final long serialVersionUID = 1L;
	private static Font font = new Font("Arial",Font.BOLD,32);
	private Calcul calcul;
	
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnAdition;
	private JButton btnSoustraction;
	private JButton btnMultiplication;
	private JButton btnDivision;
	private JButton btnEgale;
	
	JLabel afficheur;


	public Fenetre(){
		super("Calculatrice");
		calcul = new Calcul(new ArrayList<>(Arrays.asList("+","-","*","/")));
		initialisationDeLaFenetre();
		initialisationDesBouton();
	}


	private void initialisationDeLaFenetre(){
		ImageIcon img = new ImageIcon("./img/pipou_happy.png");
	    this.setIconImage(img.getImage());
	    this.setVisible(true);
	    
		this.setSize(415,540);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		

	}
	private void initialisationDesBouton(){
		this.setLayout(null);
		
		afficheur = new JLabel("Calculatrice allumé", SwingConstants.RIGHT);
		afficheur.setBounds(5,5, 390, 90);
		afficheur.setOpaque(true);
		afficheur.setForeground(Color.white); 
		afficheur.setBackground(Color.black);
		afficheur.setBorder(new EmptyBorder(10,10,10,10));
		afficheur.setFont(font);
		this.add(afficheur);
		
		btn1 = new JButton("1");
		configBtn(btn1, 5,305);
		btn1.addActionListener(this::btn1Listner);
		btn2 = new JButton("2");
		configBtn(btn2, 105,305);
		btn2.addActionListener(this::btn2Listner);
		btn3 = new JButton("3");
		configBtn(btn3, 205,305);
		btn3.addActionListener(this::btn3Listner);
		btn4 = new JButton("4");
		configBtn(btn4, 5,205);
		btn4.addActionListener(this::btn4Listner);
		btn5 = new JButton("5");
		configBtn(btn5, 105,205);
		btn5.addActionListener(this::btn5Listner);
		btn6 = new JButton("6");
		configBtn(btn6, 205,205);
		btn6.addActionListener(this::btn6Listner);
		btn7 = new JButton("7");
		configBtn(btn7, 5,105);
		btn7.addActionListener(this::btn7Listner);
		btn8 = new JButton("8");
		configBtn(btn8, 105,105);
		btn8.addActionListener(this::btn8Listner);
		btn9 = new JButton("9");
		configBtn(btn9, 205,105);
		btn9.addActionListener(this::btn9Listner);
		btn0 = new JButton("0");
		configBtn(btn0, 5,405);
		btn0.addActionListener(this::btn0Listner);
		
		btnAdition = new JButton("+");
		configBtn(btnAdition, 305,405);
		btnAdition.addActionListener(this::btnAditionListner);
		btnSoustraction = new JButton("-");
		configBtn(btnSoustraction, 305,305);
		btnSoustraction.addActionListener(this::btnSoustractionListner);
		btnMultiplication = new JButton("*");
		configBtn(btnMultiplication, 305,205);
		btnMultiplication.addActionListener(this::btnMultiplicationListner);
		btnDivision = new JButton("/");
		configBtn(btnDivision, 305,105);
		btnDivision.addActionListener(this::btnDivisionListner);
		
		btnEgale = new JButton("=");
		btnEgale.setBounds(105,405, 190, 90);
		btnEgale.setBackground(Color.white); 
		btnEgale.setFont(font);
		this.add(btnEgale);
		btnEgale.addActionListener(this::btnEgalListner);
	}
	
	private void configBtn(JButton btn, int x, int y) {
		btn.setBounds(x,y, 90, 90);
		btn.setBackground(Color.white);
		btn.setFont(font);
		this.add(btn);
	}
	 private void btn1Listner(ActionEvent event) {
		 System.out.println("BTN1 cliked");
		 try {
			 calcul.ajouterNombres(1);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn2Listner(ActionEvent event) {
		 System.out.println("BTN2 cliked");
		 try {
			 calcul.ajouterNombres(2);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn3Listner(ActionEvent event) {
		 System.out.println("BTN3 cliked");
		 try {
			 calcul.ajouterNombres(3);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn4Listner(ActionEvent event) {
		 System.out.println("BTN4 cliked");
		 try {
			 calcul.ajouterNombres(4);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn5Listner(ActionEvent event) {
		 System.out.println("BTN5 cliked");
		 try {
			 calcul.ajouterNombres(5);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn6Listner(ActionEvent event) {
		 System.out.println("BTN6 cliked");
		 try {
			 calcul.ajouterNombres(6);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn7Listner(ActionEvent event) {
		 System.out.println("BTN7 cliked");
		 try {
			 calcul.ajouterNombres(7);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn8Listner(ActionEvent event) {
		 System.out.println("BTN8 cliked");
		 try {
			 calcul.ajouterNombres(8);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn9Listner(ActionEvent event) {
		 System.out.println("BTN9 cliked");
		 try {
			 calcul.ajouterNombres(9);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btn0Listner(ActionEvent event) {
		 System.out.println("BTN0 cliked");
		 try {
			 calcul.ajouterNombres(0);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btnAditionListner(ActionEvent event) {
		 System.out.println("BTN Adition cliked");
		 try {
			 calcul.ajouterOperateur("+");
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btnSoustractionListner(ActionEvent event) {
		 System.out.println("BTN Soustraction cliked");
		 try {
			 calcul.ajouterOperateur("-");
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btnMultiplicationListner(ActionEvent event) {
		 System.out.println("BTN Multiplication cliked");
		 try {
			 calcul.ajouterOperateur("*");
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btnDivisionListner(ActionEvent event) {
		 System.out.println("BTN9 Division cliked");
		 try {
			 calcul.ajouterOperateur("/");
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 afficheur.setText(calcul.toString());
	 }
	 private void btnEgalListner(ActionEvent event) {
		 System.out.println("BTN Egal cliked");
		 try {
			 afficheur.setText( calcul.calcul());
		 }catch(Exception e){
			 System.out.println(e);
			 afficheur.setText(e.toString());
		 }
		 calcul.reinitialisation();
	 }
}