package com.eigoninaritai.naokichi.rockpaperscissors.attack;

/**
 * ����񂯂�̃p�[�̃N���X�B
 */
public class PaperAttack extends AttackBase {
	/**
	 * ����񂯂�̃p�[�̍U���̎�ނ��擾����B
	 * @return ����񂯂�̃p�[�̍U���̎�ނ�Ԃ��B
	 */
	@Override
	public AttackType getAttackType() {
		return AttackType.Paper;
	}
	
	/**
	 * ����񂯂�̃p�[�̕�������擾����B
	 * @return ����񂯂�̃p�[�̕������Ԃ��B
	 */
	@Override
	public String getAttackName() {
		return "�p�[";
	}
}
