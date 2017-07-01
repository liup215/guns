package com.stylefeng.guns.modular.module.controller;

import com.stylefeng.guns.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 财务控制器
 *
 * @author fengshuonan
 * @Date 2017-07-01 09:40:12
 */
@Controller
@RequestMapping("/money")
public class MoneyController extends BaseController {

    private String PREFIX = "/module/money/";

    /**
     * 跳转到财务首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "money.html";
    }

    /**
     * 跳转到添加财务
     */
    @RequestMapping("/money_add")
    public String moneyAdd() {
        return PREFIX + "money_add.html";
    }

    /**
     * 跳转到修改财务
     */
    @RequestMapping("/money_update/{moneyId}")
    public String moneyUpdate(@PathVariable Integer moneyId, Model model) {
        return PREFIX + "money_edit.html";
    }

    /**
     * 获取财务列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return null;
    }

    /**
     * 新增财务
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add() {
        return super.SUCCESS_TIP;
    }

    /**
     * 删除财务
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete() {
        return SUCCESS_TIP;
    }


    /**
     * 修改财务
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update() {
        return super.SUCCESS_TIP;
    }

    /**
     * 财务详情
     */
    @RequestMapping(value = "/detail")
    @ResponseBody
    public Object detail() {
        return null;
    }
}
