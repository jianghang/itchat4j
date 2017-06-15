package cn.zhouyafeng.itchat4j.demo.jh;

import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.api.WechatTools;
import cn.zhouyafeng.itchat4j.demo.jh.MsgHandlerHJ;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by jianghang on 2017/6/14.
 */
public class ItChatAction {

    private static Logger logger = LoggerFactory.getLogger(ItChatAction.class);

    public static void main(String[] args){
        String preFilePath = System.getProperty("user.dir");
        String qrPath = preFilePath + "/wechatfile";

        IMsgHandlerFace msgHandlerFace = new MsgHandlerHJ();
        Wechat wechat = new Wechat(msgHandlerFace,qrPath);
        wechat.start();

        List<String> contactList = WechatTools.getContactList();
        logger.info("ContactList: " + JSON.toJSONString(contactList));
        MsgHandlerHJ.contactMap = WechatTools.getContactMap();
        logger.info("ContactMap: " + JSON.toJSONString(MsgHandlerHJ.contactMap));
        WechatTools.setUserInfo();
    }

}
