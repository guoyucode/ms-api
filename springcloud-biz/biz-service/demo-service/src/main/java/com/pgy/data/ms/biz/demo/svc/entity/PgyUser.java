package com.pgy.data.ms.biz.demo.svc.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author ginko
 * @since 2018-12-08
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class PgyUser extends Model<PgyUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户名-手机号-脱敏
     */
    private String userName;
    /**
     * 用户名-手机号密文无解，用于匹配
     */
    private String userNameMd5;
    /**
     * 用户名-手机号密文可解
     */
    private String userNameEncrypt;
    /**
     * 姓名-脱敏
     */
    private String realName;
    /**
     * 姓名密文无解，用于匹配
     */
    private String realNameMd5;
    /**
     * 姓名密文可解
     */
    private String realNameEncrypt;
    /**
     * 身份证翻拍照身份证号-脱敏
     */
    private String idcard;
    /**
     * 身份证翻拍照身份证号密文无解，用于匹配
     */
    private String idcardMd5;
    /**
     * 身份证翻拍照身份证号密文可解
     */
    private String idcardEncrypt;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 密码的盐值
     */
    private String salt;
    /**
     * 邀请人userid
     */
    private Long recommendId;
    /**
     * 邀请码
     */
    private String recommendCode;
    /**
     * 渠道id
     */
    private Integer channelId;
    private Date addTime;
    private Date modifyTime;
    /**
     * 删除标志，0有效，其他值表示已删除
     */
    private Long isDelete;
    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;
    /**
     * 第一次登录时间
     */
    private Date firstLoginTime;
    /**
     * 最后一次登录客户端系统
     */
    private String lastLoginSys;
    /**
     * 最后一次登录客户端版本
     */
    private String lastLoginEdition;
    /**
     * 最后一次登录手机型号
     */
    private String lastLoginModel;


    public static final String ID = "id";

    public static final String USER_NAME = "user_name";

    public static final String USER_NAME_MD5 = "user_name_md5";

    public static final String USER_NAME_ENCRYPT = "user_name_encrypt";

    public static final String REAL_NAME = "real_name";

    public static final String REAL_NAME_MD5 = "real_name_md5";

    public static final String REAL_NAME_ENCRYPT = "real_name_encrypt";

    public static final String IDCARD = "idcard";

    public static final String IDCARD_MD5 = "idcard_md5";

    public static final String IDCARD_ENCRYPT = "idcard_encrypt";

    public static final String PWD = "pwd";

    public static final String SALT = "salt";

    public static final String RECOMMEND_ID = "recommend_id";

    public static final String RECOMMEND_CODE = "recommend_code";

    public static final String CHANNEL_ID = "channel_id";

    public static final String ADD_TIME = "add_time";

    public static final String MODIFY_TIME = "modify_time";

    public static final String IS_DELETE = "is_delete";

    public static final String LAST_LOGIN_TIME = "last_login_time";

    public static final String FIRST_LOGIN_TIME = "first_login_time";

    public static final String LAST_LOGIN_SYS = "last_login_sys";

    public static final String LAST_LOGIN_EDITION = "last_login_edition";

    public static final String LAST_LOGIN_MODEL = "last_login_model";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
