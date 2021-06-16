package com.eigoninaritai.naokichi.rockpaperscissors;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackBase;
import com.eigoninaritai.naokichi.rockpaperscissors.character.NPC;
import com.eigoninaritai.naokichi.rockpaperscissors.character.User;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackReferee;
import com.eigoninaritai.naokichi.rockpaperscissors.manager.AttackResult;

/**
 * じゃんけんメインクラス。
 */
public class RockPaperScissorsMain {
	/**
	 * じゃんけんメイン処理。
	 * @param args コマンドライン引数。
	 */
	public static void main(String[] args) {
		System.out.println("じゃんけん開始！");
		
		// ユーザーとNPCクラスを生成する。
		User user = new User();
		NPC npc = new NPC();
		while (true) {
			System.out.println("現在のあなたのHP:" + String.valueOf(user.getCurrentHP()));
			System.out.println("現在のNPCのHP:" + String.valueOf(npc.getCurrentHP()));
			System.out.println("じゃんけん・・・");
			
			// ユーザーとNPCの攻撃を決定する。
			AttackBase userAttack = user.selectAttack();
			AttackBase npcAttack = npc.selectAttack();
			System.out.println("ぽん！");
			System.out.println("自分の手:" + userAttack.getAttackName());
			System.out.println("相手の手:" + npcAttack.getAttackName());
			
			// 攻撃の結果を取得し、負けたプレイヤーのHPを減らす。
			AttackReferee referee = new AttackReferee();
			AttackResult result = referee.result(userAttack.getAttackType(), npcAttack.getAttackType());
			switch (result) {
				case Win:
					user.attack(npc);
					if (npc.getCurrentHP() <= 0) {
						System.out.println("あなたの勝ちです");
						return;
					}
					break;
				case Loss:
					npc.attack(user);
					if (user.getCurrentHP() <= 0) {
						System.out.println("あなたの負けです");
						return;
					}
					break;
				default:
					break;
			}
		}
	}
}
