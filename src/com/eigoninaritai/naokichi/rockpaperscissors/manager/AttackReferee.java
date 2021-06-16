package com.eigoninaritai.naokichi.rockpaperscissors.manager;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackType;

/**
 * ����񂯂�̍U���𔻒肷��N���X�B
 */
public class AttackReferee {
	/**
	 * ����񂯂�̍U���𔻒茋�ʂ�Ԃ��B
	 * @param userAttackType ���[�U�[�̂���񂯂�̍U���B
	 * @param npcAttackType NPC�̂���񂯂�̍U���B
	 * @return ���[�U�[�̏��s�̌��ʂ�Ԃ��B
	 */
	public AttackResult result(AttackType userAttackType, AttackType npcAttackType) {
		// ����񂯂�Ƀ��[�U�[���������ꍇ�A�����̌��ʂ�Ԃ��B
		if (userAttackType == AttackType.Rock && npcAttackType == AttackType.Scissors) return AttackResult.Win;
		if (userAttackType == AttackType.Paper && npcAttackType == AttackType.Rock) return AttackResult.Win;
		if (userAttackType == AttackType.Scissors && npcAttackType == AttackType.Paper) return AttackResult.Win;

		// ����񂯂�Ƀ��[�U�[���������ꍇ�A�s�k�̌��ʂ�Ԃ��B
		if (userAttackType == AttackType.Rock && npcAttackType == AttackType.Paper) return AttackResult.Loss;
		if (userAttackType == AttackType.Paper && npcAttackType == AttackType.Scissors) return AttackResult.Loss;
		if (userAttackType == AttackType.Scissors && npcAttackType == AttackType.Rock) return AttackResult.Loss;

		// �����������ꍇ�A���������̌��ʂ�Ԃ��B
		return AttackResult.Draw;
	}
}
