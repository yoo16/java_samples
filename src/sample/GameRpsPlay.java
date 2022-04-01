package sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameRpsPlay {
	final static String ROCK = "グー";
	final static String SCISSORS = "チョキ";
	final static String PAPER = "パー";
	final static String[] hands = { ROCK, SCISSORS, PAPER };

	JLabel label;
	JLabel resultLabel;
	JFrame frame;
	JPanel labelPanel;
	JPanel buttonoPanel;
	Container contentPane;

	public GameRpsPlay() {
		// ラベル
		label = new JLabel("じゃんけん", JLabel.CENTER);
		resultLabel = new JLabel("", JLabel.CENTER);

		// フレーム
		frame = new JFrame("じゃんけん");
		frame.setBounds(300, 200, 300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ラベルパネル
		labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
		labelPanel.add(label);
		labelPanel.add(resultLabel);

		// ボタンパネル
		buttonoPanel = new JPanel();
		buttonoPanel.setLayout(new BoxLayout(buttonoPanel, BoxLayout.LINE_AXIS));

		// コンテナ
		contentPane = frame.getContentPane();
		contentPane.add(labelPanel, BorderLayout.NORTH);
		contentPane.add(buttonoPanel, BorderLayout.CENTER);

		// イベント登録
		for (int i = 0; i < hands.length; i++) {
			JButton handButton = new JButton(hands[i]);
			handButton.setSize(80, 30);
			buttonoPanel.add(handButton);

			handButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String hand = e.getActionCommand();
					play(hand);
				}
			});
		}

		// フレームの表示
		frame.setVisible(true);
	}

	public void play(String hand) {
		Random rand = new Random();
		int handIndex = rand.nextInt(3);
		String pcHand = hands[handIndex];

		// 結果表示
		label.setText(pcHand);
		if (hand != pcHand) {
			if ((hand == ROCK && pcHand == SCISSORS) || (hand == SCISSORS && pcHand == PAPER)
					|| (hand == PAPER && pcHand == ROCK)) {
				resultLabel.setText("勝ち！");
			} else {
				resultLabel.setText("負け！");
			}
		} else {
			resultLabel.setText("あいこで");
		}
	}

	public static void main(String[] args) {
		new GameRpsPlay();
	}

}
