package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * ����񂯂�̃`���L�̃N���X�B
 */
public class ScissorsAttack extends AttackBase {
	/**
	 * ����񂯂�̃`���L�̍U���̎�ނ��s���B
	 * @return ����񂯂�̃`���L�̎�ނ�Ԃ��B
	 */
	@Override
	public AttackType getAttackType() {
		return AttackType.Scissors;
	}
	
	/**
	 * ����񂯂�̃`���L�̕�������擾����B
	 * @return ����񂯂�̃`���L�̕������Ԃ��B
	 */
	@Override
	public String getAttackName() {
		return "�`���L";
	}
}
