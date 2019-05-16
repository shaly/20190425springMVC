package com.syf.study.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
	@ResponseBody//�첽����
	public String uploadFile(@RequestParam("file")MultipartFile file//�ļ��ݴ��ڣ�D://SOFT_STUDY//eclipse//runTime//dmpfile
			,HttpServletRequest req) {

		if(file.isEmpty()) {
			return "file";
		}else {
			/**��ȡ�������ĸ�Ŀ¼/upload;------��Ŀ������ʱ��д�ļ�����洢��λ��
			 * eg:D:/SOFT_STUDY/eclipse/runTime/rumo/class001/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springMVC/upload*/
			String root=req.getServletContext().getRealPath("/upload");
			File f=new File(root);
			if(!f.exists()) f.mkdirs();
			//�ļ�������
			String fileName=UUID.randomUUID().toString();
			//�ļ���׺��
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

	

	@RequestMapping("/toUploadFile2")
	public String toUploadFile2() {
		
		return "upload2";
	}
	
	


	@RequestMapping("/uploadFile2")
	@ResponseBody//�첽����
	public Map<String, Object> uploadFile2(@RequestParam("fileName")MultipartFile file//�ļ��ݴ��ڣ�D://SOFT_STUDY//eclipse//runTime//dmpfile
			,HttpServletRequest req) {
		Map<String ,Object> map=new HashMap<String ,Object>();
		map.put("fileName", file.getName());
		if(file.isEmpty()) {
			return map;
		}else {
			/**��ȡ�������ĸ�Ŀ¼/upload;------��Ŀ������ʱ��д�ļ�����洢��λ��
			 * eg:D:/SOFT_STUDY/eclipse/runTime/rumo/class001/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springMVC/upload*/
			String root=req.getServletContext().getRealPath("/upload");
			File f=new File(root);
			if(!f.exists()) f.mkdirs();
			//�ļ�������
			String fileName=UUID.randomUUID().toString();
			//�ļ���׺��
			String endName=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
			File ff=new File(f,fileName+endName);
			try {
				file.transferTo(ff);
				map.put("fileName", file.getName());
				map.put("size", file.getSize());
				map.put("name", fileName+endName);
				map.put("endName", endName);
				map.put("url", "upload/"+ fileName+endName);
				return map;
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return map;
		}
	}

	
	
}
