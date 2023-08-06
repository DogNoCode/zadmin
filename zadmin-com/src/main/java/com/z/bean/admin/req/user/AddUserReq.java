package com.z.bean.admin.req.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @program:zadmin
 * @author: Zzz
 * @Time: 2023/8/6  11:58
 */
@Data
public class AddUserReq {

    /**
     * 用户昵称
     */
    @NotBlank(message = "用户昵称不能为空！")
    private String nickname;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空！")
    private String userName;

    /**
     * 所在组织id
     */
    @NotBlank(message = "所属组织id不能为空！")
    private Long orgId;

    /**
     * 账号状态 0-正常 1-封禁
     */
    private Integer userStatus;

    /**
     * 所属角色id集合
     */
    @NotBlank(message = "所属组织id不能为空！")
    private List<Long> roleIds;
}
