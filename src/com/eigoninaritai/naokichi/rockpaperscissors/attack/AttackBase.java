package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * ����񂯂�̍U���x�[�X�N���X�B
 */
public abstract class AttackBase {
	/**
	 * ����񂯂�̍U���̎�ނ��擾����B
	 * @return ����񂯂�̍U���̎�ނ�Ԃ��B
	 */
	public abstract AttackType getAttackType();
	
	/**
	 * ����񂯂�̍U���̕�������擾����B
	 * @return ����񂯂�̍U���̕������Ԃ��B
	 */
	public abstract String getAttackName();
}
