package com.wangqiankun.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.wangqiankun.domian.Student;
import com.wangqiankun.exception.MyException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
@RequestMapping("/studentController")
public class StudentController {

    @RequestMapping("saveStu")
    public String getStuAndCard(Student student){
        System.out.println("封装的对象："+student);
        return "success";
    }

    @RequestMapping("ajax")
    public @ResponseBody Student testAjax(@RequestBody Student student){
        student.setBirthday(new Date());
        System.out.println(student);
        return student;
    }

    @RequestMapping("fileupload")
    public String fileUpLoad1(HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()){
//            创建文件夹
            file.mkdir();
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> fileItems = null;
        try {
            fileItems = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        System.out.println(fileItems);
        for (FileItem item:fileItems) {
            if(item.isFormField()){
                System.out.println("普通文件项");
            }else {
                String filename = item.getName();
                try {
                    item.write(new File(path,filename));
                    item.delete();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return "success";
    }
    @RequestMapping("fileuploadByMVC")
    public String fileuploadByMVC(HttpServletRequest request, MultipartFile upload){
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        String filename = upload.getOriginalFilename();
        try {
            upload.transferTo(new File(path,filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
    @RequestMapping("fileupload3")
    public String fileupload(HttpServletRequest request,MultipartFile upload){
        String path = "http://localhost:9090/uploads/";
        String filename = upload.getOriginalFilename();
        Client client = Client.create();
        WebResource resource = client.resource(path + filename);
        try {
            resource.put(upload.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("errorMethod")
    public void errorMethod() throws MyException {
        int i=1/0;
    }

    @RequestMapping("interceptor")
    public String interceptor(){
        System.out.println("控制器中的方法执行");
        return "interceptorResult";
    }
}
