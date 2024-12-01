package swingProject.messageBoxAndTextFields;

import javax.swing.*;

public class MessageBoxesEx {
	public static void main(String[] args) {
		// showMessageDialogs();
		// yesNoCancelQuestion();
		// inputQuestion();
		String[] responses = {"Yuvarlanıp gidiyoz",  "Sen nabıyon beya", "Nolsun işte", "Aynı beya"};
		ImageIcon icon = new ImageIcon("src/main/resources/images/sevenx.png");
		JOptionPane.showOptionDialog(null, "naber beya", "Your Name", JOptionPane.YES_NO_CANCEL_OPTION,
		                             JOptionPane.INFORMATION_MESSAGE, icon, responses, 1);
	}
	
	public static void showMessageDialogs(){
		JOptionPane.showMessageDialog(null, "naber dünya", "Selam", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Dünya'nın size selamı var", "Selam", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Selam vermek istediğinizden emin misiniz", "Selam",
		                              JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Selam vermek sistem kaynaklarını tüketebilir", "Selam",
		                              JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Sistem kaynakları tükendi", "Selam", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void yesNoCancelQuestion(){
		int response = JOptionPane.showConfirmDialog(null, "Do you like applepies?", "importanté",
		                                             JOptionPane.YES_NO_CANCEL_OPTION);
		
		System.out.println("verilen yanıt: " + response); // yes 0, no 1, cancel 2, X -1
	}
	
	public static void inputQuestion(){
		String name = JOptionPane.showInputDialog("Bugün erken kalktığına değdi mi asker?");
		JOptionPane.showMessageDialog(null, "Cevabınız kaydedildi:\n" + name, "cevap alındı", JOptionPane.INFORMATION_MESSAGE);
	}
}