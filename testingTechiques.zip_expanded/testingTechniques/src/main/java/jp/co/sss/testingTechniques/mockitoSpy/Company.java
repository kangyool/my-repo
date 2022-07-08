package jp.co.sss.testingTechniques.mockitoSpy;

/**
 * 会社クラス
 *
 * @author System Shared
 */

public class Company {

	/** 所持している店舗 */
	Shop shop;

	/** 初期値を設定する */
	public Company(Shop shop) {
		this.shop = shop;

	}

	/** メッセージの出力とショップ名を取得する */
	public String showName() {
		shop.message();
		return shop.getShopName();
	}

}
