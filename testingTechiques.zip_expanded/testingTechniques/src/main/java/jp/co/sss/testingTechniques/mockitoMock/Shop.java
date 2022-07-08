package jp.co.sss.testingTechniques.mockitoMock;

/**
 * ショップクラス
 *
 * @author System Shared
 */
public class Shop {

	/** ショップ名 */
	String shopName;

	/**
	 * ショップ名を設定するメソッド
	 *
	 * @param shopName
	 *            ショップ名
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * ショップ名を取得するメソッド
	 *
	 * @return ショップ名
	 */
	public String getShopName() {
		//DBからデータを取得する処理を入れる予定
		return shopName;
	}

	/**
	 * コンソールにメッセージを出力するメソッド
	 */
	public void message() {
		//メッセージ出力予定
		System.out.println("仮メッセージ");
	}
}
