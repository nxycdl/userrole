package com.ycfd.userrole.base;



/**
 * Created by nxycd on 2018/12/17.
 * @author dl
 */
public class ResponResult {
    class Head {
        private String ret;
        private String remes;

        public String getRet() {
            return ret;
        }

        public void setRet(String ret) {
            this.ret = ret;
        }

        public String getRemes() {
            return remes;
        }

        public void setRemes(String remes) {
            this.remes = remes;
        }

        public Head() {
        }
    }
    class Msg {
        private Object detail;
        private Object head;

        public Object getDetail() {
            return detail;
        }

        public void setDetail(Object detail) {
            this.detail = detail;
        }

        public Object getHead() {
            return head;
        }

        public void setHead(Object head) {
            this.head = head;
        }

        public Msg() {
        }
    }
    private Head head;
    private Msg msg;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public ResponResult() {
        this.head = new Head();
        this.msg = new Msg();
    }

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    public ResponResult(Integer rtnCode, String msg, Object msgHead, Object msgDetail) {
        this.head = new Head();
        this.msg = new Msg();
        this.head.setRet(rtnCode.toString());
        this.head.setRemes(msg);
        this.msg.setDetail(msgDetail);
        this.msg.setHead(msgHead);

    }

    public static void main(String[] args) {

    }


}
