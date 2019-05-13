package com.syf.study.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/toUploadFile")
	public String toUploadFile() {
		
		return "upload";
	}
	

	@RequestMapping("/uploadFile")
	@ResponseBody//异步处理
	public String uploadFile(@RequestParam("file")MultipartFile file//文件暂存于：D://SOFT_STUDY//eclipse//runTime//dmpfile
			,HttpServletRequest req) {
		if(file.isEmpty()) {
			return "file";
		}else {
			/**获取服务器的根目录/upload;------项目开发的时候写文件具体存储的位置
			 * eg:D:/SOFT_STUDY/eclipse/runTime/rumo/class001/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springMVC/upload*/
			String root=req.getServletContext().getRealPath("/upload");
			File f=new File(root);
			if(!f.exists()) f.mkdirs();
			//文件重命名
			String fileName=UUID.randomUUID().toString();
			//文件后缀名
			String endName=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
			File ff=new File(f,fileName+endName);
			try {
				file.transferTo(ff);
				return "success";
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "file";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "file";
			}
		}
	}

}
