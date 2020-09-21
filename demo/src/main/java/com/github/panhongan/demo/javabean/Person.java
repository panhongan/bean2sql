package com.github.panhongan.demo.javabean;

import com.github.panhongan.commons.DbBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author panhongan
 * @since 2020.9.1
 * @version 1.0
 */

@Getter
@Setter
@ToString(callSuper = true)
public class Person extends DbBase {

    private String name;

    private Date birthday;
}