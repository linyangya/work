package com.yinda.nbminer.config;

import java.io.File;
import java.util.Locale;

import org.springframework.web.servlet.view.InternalResourceView;

public class HtmlResourceView extends InternalResourceView {
	  
    @Override
    public boolean checkResource(Locale locale){
        File file=new File(this.getServletContext().getRealPath("/")+getUrl());  
        //判断页面是否存在
        return file.exists();
    }  
}  