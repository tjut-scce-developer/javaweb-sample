package commn;

public class PageMsg {

	//返回的状态码
	private String statu;
	//返回转跳页面
	private String pagePath;
	//返回页面提示消息
	private String pageMessage;
	//返回页面的内容
	private String contain;

	public String getContain() {
		return contain;
	}

	public PageMsg setContain(String contain) {
		this.contain = contain;
		return this;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	public String getPagePath() {
		return pagePath;
	}

	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}

	public String getPageMessage() {
		return pageMessage;
	}

	public void setPageMessage(String pageMessage) {
		this.pageMessage = pageMessage;
	}
}
