package com.qf.tools;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class upImgUtils {


    public Object upImg(MultipartFile dropzFile, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        String fileName = dropzFile.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath("/upload");
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(filePath, UUID.randomUUID() + fileSuffix);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            dropzFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.put("fileName", file.getName());
        return "upload/"+file.getName();

    }
}
