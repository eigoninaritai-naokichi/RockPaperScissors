package com.eigoninaritai.naokichi.rockpaperscissors.character;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackSelector;

/**
 * ����񂯂��NPC�̃N���X�B
 */
public class NPC extends CharacterBase {
	/**
	 * ����񂯂�̍U����I������B
	 * @return �I����������񂯂�̍U����Ԃ��B
	 */
	@Override
	public AttackBase selectAttack() {
		AttackSelector attackSelector = new AttackSelector();
		return attackSelector.selectAttack();
	}
}
