package in.vamsoft.servlet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

import org.apache.log4j.Logger;

public class IterationTaghand implements IterationTag {

	private static Logger logger = Logger.getLogger(IterationTaghand.class);
	private PageContext context;
	private String index;

	public int doStartTag() throws JspException {
	try {
			JspWriter out = context.getOut();
			out.println("");
		} catch (Exception e) {
			logger.info(e);
		}
			logger.info("I am in the doStartTag");
			return EVAL_BODY_INCLUDE;
	    }

	public int doAfterBody() throws JspException {
			logger.info("I am in the doAfterBody");
			if (index > 0) {
				index--;
				return EVAL_BODY_AGAIN;
	} else {
		return SKIP_BODY;
	        }
	    }

	public int doEndTag() throws JspException {
		logger.info("I am in the doEndTag");
			return EVAL_PAGE;
	    }public Tag getParent() {
			logger.info("I am in the getParent");
			return null;
	    }
		public void release() {
			logger.info("I am in release");
	    }

	public void setPageContext(PageContext context) {
			this.context = context;
			logger.info("I am in setPageContext");
	    }
	public void setParent(Tag t) {
		logger.info("I am in setParent");
	    }

	public String getIndex() {
			return "index";
	    }
	public void setIndex(Integer index) {
			this.index = "index";
	    }  
}
