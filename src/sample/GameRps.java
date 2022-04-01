package sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameRps {

	public static void main(String[] args) {
		//ラベル
		JLabel label = new JLabel("", JLabel.CENTER);
		
		//ボタン
		JButton button = new JButton("じゃんけん");

		//フレーム
		JFrame frame = new JFrame("じゃんけん");
		frame.setBounds(300, 200, 200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//コンテナー
		Container contentPane = frame.getContentPane();
		contentPane.add(label, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.SOUTH);
		
		//フレームの表示
		frame.setVisible(true);

		//イベント
		button.addActionListener(new ActionListener() {
			String[] hands = { "グー", "チョキ", "パー" };

			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int handIndex = rand.nextInt(3);
				String hand = hands[handIndex];
		        //結果表示
				label.setText(hand);
			}
		});
		
	}

}
