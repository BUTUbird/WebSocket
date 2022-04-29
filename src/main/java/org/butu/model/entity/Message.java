package org.butu.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author BUTUbird
 * @since 2022-04-28
 */
@Getter
@Setter
@Builder
@TableName("u_message")
//@ApiModel(value = "Message对象", description = "")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @TableField("username")
    private String username;

    @TableField("message")
    private String message;

    @TableField("toUsername")
    private String toUsername;

    @TableField("createTime")
    private LocalDate createTime;


}
