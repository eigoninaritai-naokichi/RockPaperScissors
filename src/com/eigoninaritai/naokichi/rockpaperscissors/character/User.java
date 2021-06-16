package com.eigoninaritai.naokichi.rockpaperscissors.character;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.input.KeyboardReader;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackSelector;

/**
 * じゃんけんのユーザークラス。
 */
public class User extends CharacterBase {
	/**
	 * じゃんけんの攻撃を選択する。
	 * @return 選択したじゃんけんの攻撃を返す。
	 */
	@Override
	public AttackBase selectAttack() {
		try {
			System.out.println("次に出す手を選んでください。");
			System.out.println("0:グー、1:パー、2:チョキ");
			KeyboardReader keyboardReader = new KeyboardReader();
			String attackTypeNumber = keyboardReader.readLine();
			AttackSelector attackSelector = new AttackSelector();
			return attackSelector.selectAttack(attackTypeNumber);
		} catch (NumberFormatException e) {
			System.out.println("以下のいずれかの値のみを入力してください。");
			return selectAttack();
		}
	}
}
