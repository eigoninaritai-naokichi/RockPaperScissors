package com.eigoninaritai.naokichi.rockpaperscissors.manager;

import com.eigoninaritai.naokichi.rockpaperscissors.attack.AttackType;

/**
 * じゃんけんの攻撃を判定するクラス。
 */
public class AttackReferee {
	/**
	 * じゃんけんの攻撃を判定結果を返す。
	 * @param userAttackType ユーザーのじゃんけんの攻撃。
	 * @param npcAttackType NPCのじゃんけんの攻撃。
	 * @return ユーザーの勝敗の結果を返す。
	 */
	public AttackResult result(AttackType userAttackType, AttackType npcAttackType) {
		// じゃんけんにユーザーが勝った場合、勝利の結果を返す。
		if (userAttackType == AttackType.Rock && npcAttackType == AttackType.Scissors) return AttackResult.Win;
		if (userAttackType == AttackType.Paper && npcAttackType == AttackType.Rock) return AttackResult.Win;
		if (userAttackType == AttackType.Scissors && npcAttackType == AttackType.Paper) return AttackResult.Win;

		// じゃんけんにユーザーが負けた場合、敗北の結果を返す。
		if (userAttackType == AttackType.Rock && npcAttackType == AttackType.Paper) return AttackResult.Loss;
		if (userAttackType == AttackType.Paper && npcAttackType == AttackType.Scissors) return AttackResult.Loss;
		if (userAttackType == AttackType.Scissors && npcAttackType == AttackType.Rock) return AttackResult.Loss;

		// 引き分けた場合、引き分けの結果を返す。
		return AttackResult.Draw;
	}
}
