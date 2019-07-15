package com.mmall.permission.param;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class DeptParam {

    private Integer id;

    @NotBlank(message = "部门名称不可以为空")
    @Length(max = 15,min = 2,message = "部门名称长度需要在2-15之间")
    private String name;

    private Integer parentId ;

    @NotNull(message = "展示顺序不可以为空")
    private Integer seq;

    @Length(max = 150,message = "备注的长度需要在150字以内")
    private String remark;
}
