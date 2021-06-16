package com.eigoninaritai.naokichi.rockpaperscissors.character;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackSelector;

/**
 * じゃんけんのNPCのクラス。
 */
public class NPC extends CharacterBase {
	/**
	 * じゃんけんの攻撃を選択する。
	 * @return 選択したじゃんけんの攻撃を返す。
	 */
	@Override
	public AttackBase selectAttack() {
		AttackSelector attackSelector = new AttackSelector();
		return attackSelector.selectAttack();
	}
}
