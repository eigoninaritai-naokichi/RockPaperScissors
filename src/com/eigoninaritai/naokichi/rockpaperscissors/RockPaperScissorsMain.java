package com.eigoninaritai.naokichi.rockpaperscissors;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.character.NPC;
import com.eigoninaritai.naokichi.rockpaperscissors.character.User;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackReferee;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackResult;

/**
 * ����񂯂񃁃C���N���X�B
 */
public class RockPaperScissorsMain {
	/**
	 * ����񂯂񃁃C�������B
	 * @param args �R�}���h���C�������B
	 */
	public static void main(String[] args) {
		System.out.println("����񂯂�J�n�I");
		
		// ���[�U�[��NPC�N���X�𐶐�����B
		User user = new User();
		NPC npc = new NPC();
		while (true) {
			System.out.println("���݂̂��Ȃ���HP:" + String.valueOf(user.getCurrentHP()));
			System.out.println("���݂�NPC��HP:" + String.valueOf(npc.getCurrentHP()));
			System.out.println("����񂯂�E�E�E");
			
			// ���[�U�[��NPC�̍U�������肷��B
			AttackBase userAttack = user.selectAttack();
			AttackBase npcAttack = npc.selectAttack();
			System.out.println("�ۂ�I");
			System.out.println("�����̎�:" + userAttack.getAttackName());
			System.out.println("����̎�:" + npcAttack.getAttackName());
			
			// �U���̌��ʂ��擾���A�������v���C���[��HP�����炷�B
			AttackReferee referee = new AttackReferee();
			AttackResult result = referee.result(userAttack.getAttackType(), npcAttack.getAttackType());
			switch (result) {
				case Win:
					user.attack(npc);
					if (npc.getCurrentHP() <= 0) {
						System.out.println("���Ȃ��̏����ł�");
						return;
					}
					break;
				case Loss:
					npc.attack(user);
					if (user.getCurrentHP() <= 0) {
						System.out.println("���Ȃ��̕����ł�");
						return;
					}
					break;
				default:
					break;
			}
		}
	}
}
