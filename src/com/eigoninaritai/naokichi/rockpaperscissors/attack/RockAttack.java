package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * ����񂯂�̃O�[�̃N���X�B
 */
public class RockAttack extends AttackBase {
	/**
	 * ����񂯂�̃O�[�̍U���̎�ނ��s���B
	 * @return ����񂯂�̃O�[�̍U���̎�ނ�Ԃ��B
	 */
	@Override
	public AttackType getAttackType() {
		return AttackType.Rock;
	}
	
	/**
	 * ����񂯂�̃O�[�̕�������擾����B
	 * @return ����񂯂�̃O�[�̕������Ԃ��B
	 */
	@Override
	public String getAttackName() {
		return "�O�[";
	}
}
