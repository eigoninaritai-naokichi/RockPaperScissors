package com.eigoninaritai.naokichi.rockpaperscissors.manager;

import java.util.Random;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.attack.PaperAttack;
import com.eigoninaritai.naokichi.rockpaperscissors.attack.RockAttack;
import com.eigoninaritai.naokichi.rockpaperscissors.attack.ScissorsAttack;

/**
 * じゃんけんの攻撃の選択を行うクラス。
 */
public class AttackSelector {
	/**
	 * じゃんけんの攻撃乱数最大値。
	 */
	private int BOUND_NUMBER = 2;

	/**
	 * じゃんけんの攻撃のリスト。
	 */
	private AttackBase[] attackers = {
		new RockAttack(),
		new PaperAttack(),
		new ScissorsAttack(),
	};

	/**
	 * じゃんけんの攻撃を選択する。
	 * @param attackNumberString 入力された攻撃の数値。
	 * @return 選択されたじゃんけんの攻撃を返す。
	 * @throws NumberFormatException 数値文字列以外がattackNumberStringに渡された場合、エラーが発生する。
	 */
	public AttackBase selectAttack(String attackNumberString) throws NumberFormatException {
		int attackNumber = Integer.parseInt(attackNumberString);
		if (attackNumber > BOUND_NUMBER) throw new NumberFormatException();
		return attackers[attackNumber];
	}

	/**
	 * じゃんけんの攻撃を自動で選択する。
	 * @return 自動で選択されたじゃんけんの攻撃を返す。
	 */
	public AttackBase selectAttack() {
		Random random = new Random();
		int attackNumber = random.nextInt(BOUND_NUMBER);
		return attackers[attackNumber];
	}
}
