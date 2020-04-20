package com.fuqiang.springbootsharding.model.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fuqiang.basecommons.pojo.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>Title: Author</p>
 * <p>Description: Author</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/10 0010 9:38 Create by Fuqiang
 * </pre>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@TableName("author")
public class Author extends BaseEntity<Author> {

    private String name;
    private String gender;
    private int age;
    private String phone;
    private String longitude;
    private String latitude;
    private String address;
}
