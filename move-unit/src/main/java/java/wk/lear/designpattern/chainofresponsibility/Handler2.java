/*
 * cf
 * FileName: Handler2.java
 * Author:   BM
 * Date:     2019-03-11 17:01:41
 * Description: //模块目的、功能描述
 * History: //修改记录 修改人姓名 修改时间 版本号 描述 需求来源
 * BM <2019-03-11 17:01:41> <version> <desc> <source>
 *
 */

package java.wk.lear.designpattern.chainofresponsibility;
//第二个具体处理者，处理>=0但小于10的
public class Handler2 implements Handler {
	private Handler next;
	@Override
	public int handleRequest(int n) {
		if(n<10) return n*n;
		else{
			if(next==null)
				throw new NullPointerException("next 不能为空");
			return next.handleRequest(n);
		}
	}
	@Override
	public void setNextHandler(Handler next) {
		this.next = next;
	}
}
