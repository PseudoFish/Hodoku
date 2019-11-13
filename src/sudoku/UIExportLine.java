package sudoku;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UIExportLine extends JFrame implements ActionListener {

	private static final long serialVersionUID = 2164682681182463141L;

	private JLabel label;
	private JTextField textField;
	private JButton copyButton;
	private SudokuPanel sudokuPanel;
	
	public UIExportLine(SudokuPanel sudokuPanel) {
		
		super();
		
		this.sudokuPanel = sudokuPanel;
		
		this.setVisible(false);
		this.setLocation(200, 200);
		this.setLayout(new FlowLayout());
		this.setTitle("Export Line");
		this.setResizable(false);
		
		label = new JLabel("Export Line: ");
		this.add(label, FlowLayout.LEFT);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 32));
		this.add(textField, FlowLayout.CENTER);
		
		copyButton = new JButton("Copy");
		copyButton.addActionListener(this);
		this.add(copyButton, FlowLayout.RIGHT);
		
		this.revalidate();
		this.pack();
		this.repaint();
	}
	
	@Override
	public void setVisible(boolean isVisible) {
		
		super.setVisible(isVisible);
		
		if (isVisible) {
			String line = sudokuPanel.getSudokuString(ClipboardMode.CLUES_ONLY);
			this.textField.setText(line);
			this.textField.selectAll();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == copyButton) {
			
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection stringSelection = new StringSelection(this.textField.getText());
			clipboard.setContents(stringSelection, null);
			
			this.textField.setText("");
			this.setVisible(false);
		}
	}
}