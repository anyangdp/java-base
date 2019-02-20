package com.design.review.观察者模式.使用jdk中Observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author anyang
 * @CreateTime 2019/2/20
 * @Des
 */
@Setter
@Getter
@AllArgsConstructor
public class WechatNotice {
    private String publisher;
    private String articleName;
}
