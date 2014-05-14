package org.jenkinsci.plugins.demo;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;

/**
 * @author zjl
 *
 * 本例子来源:https://github.com/jenkinsci/beer-plugin
 * 注意:必须使用注解,否则Jenkins不会识别.
 *
 */

@Extension
public class Test implements UnprotectedRootAction {

//  get Icon  注意路径,Jenkins默认路径到JENKINS_HOME,所以只需要拼接后面的路径.demo1代表插件的名字(也就是artifactId)
    public String getIconFileName(){
        return "/plugin/demo1/images/icon.png";
    }
//  the Display name
    public String getDisplayName(){
        return "SVN Merge";
    }
//  Url
    public String getUrlName(){

        return "svnmerge";
    }

}