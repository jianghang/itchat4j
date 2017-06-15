package cn.zhouyafeng.itchat4j.demo.jh;

import cn.zhouyafeng.itchat4j.api.WechatTools;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jianghang on 2017/6/14.
 */
public class MsgHandlerHJ implements IMsgHandlerFace {

    private static Logger logger = LoggerFactory.getLogger(MsgHandlerHJ.class);

    public static Map<String,String> contactMap = new HashMap<String, String>();

    @Override
    public String textMsgHandle(JSONObject msg) {
        logger.info("textMsg: " + msg.toJSONString());
        String content = msg.getString("Content");
        String toUserName = msg.getString("ToUserName");
        String fromUserName = msg.getString("FromUserName");
        String toNickName = contactMap.get(toUserName);
        String fromNickName = contactMap.get(fromUserName);
        logger.info("文字消息: " + fromNickName + " : " + content + " --------> " + toNickName);

        return null;
    }

    @Override
    public String picMsgHandle(JSONObject msg) {
        logger.info("picMsg: " + msg.toJSONString());

        return null;
    }

    @Override
    public String voiceMsgHandle(JSONObject msg) {
        logger.info("voiceMsg: " + msg.toJSONString());

        return null;
    }

    @Override
    public String viedoMsgHandle(JSONObject msg) {
        logger.info("viedoMsg: " + msg.toJSONString());

        return null;
    }

    @Override
    public String nameCardMsgHandle(JSONObject msg) {
        logger.info("nameCardMsg: " + msg.toJSONString());

        return null;
    }
}
