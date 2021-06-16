package com.eigoninaritai.naokichi.rockpaperscissors.manager;

import java.util.Random;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.attack.PaperAttack;
import com.eigoninaritai.naokichi.rockpaperscissors.attack.RockAttack;
import com.eigoninaritai.naokichi.rockpaperscissors.attack.ScissorsAttack;

/**
 * ����񂯂�̍U���̑I�����s���N���X�B
 */
public class AttackSelector {
	/**
	 * ����񂯂�̍U�������ő�l�B
	 */
	private int BOUND_NUMBER = 2;

	/**
	 * ����񂯂�̍U���̃��X�g�B
	 */
	private AttackBase[] attackers = {
		new RockAttack(),
		new PaperAttack(),
		new ScissorsAttack(),
	};

	/**
	 * ����񂯂�̍U����I������B
	 * @param attackNumberString ���͂��ꂽ�U���̐��l�B
	 * @return �I�����ꂽ����񂯂�̍U����Ԃ��B
	 * @throws NumberFormatException ���l������ȊO��attackNumberString�ɓn���ꂽ�ꍇ�A�G���[����������B
	 */
	public AttackBase selectAttack(String attackNumberString) throws NumberFormatException {
		int attackNumber = Integer.parseInt(attackNumberString);
		if (attackNumber > BOUND_NUMBER) throw new NumberFormatException();
		return attackers[attackNumber];
	}

	/**
	 * ����񂯂�̍U���������őI������B
	 * @return �����őI�����ꂽ����񂯂�̍U����Ԃ��B
	 */
	public AttackBase selectAttack() {
		Random random = new Random();
		int attackNumber = random.nextInt(BOUND_NUMBER);
		return attackers[attackNumber];
	}
}
