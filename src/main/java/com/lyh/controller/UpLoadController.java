package com.lyh.controller;

import com.lyh.bean.Info;
import com.lyh.dao.InfoDao;
import com.lyh.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author :liangyuhang1
 * @className :UpLoadController
 * @date :2023/6/19/0:25
 */
@RestController
@RequestMapping("/load/avatar")
public class UpLoadController {
    @Autowired
    private InfoService infoService;
    @Autowired
    private InfoDao infoDao;

    @PostMapping("/{loginUserId}")
    public String add(MultipartFile file, @PathVariable int loginUserId) {
        System.out.println("loginUserId: " + loginUserId);
        //获取图片名称
        String Filename = file.getOriginalFilename();
        System.out.println("Filename: " + Filename);
        try {
            //设置输出流
            BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(Paths.get("D:\\" +
                    "xxx-management system\\management system-frontend\\public\\image\\avatar\\" + Filename)));
            //获取输入流
            InputStream inputStream = file.getInputStream();
            byte[] bys = new byte[2048];
            int len;
            //利用循环输出
            while ((len = inputStream.read(bys)) != -1) {
                os.write(bys, 0, len);
            }
            //关闭流
            os.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 修改用户信息的头像路径
        Info byUserId = infoDao.getByUserId(loginUserId);
        byUserId.setAvatar("/public/image/avatar/" + Filename);
        infoDao.updateById(byUserId);

        return Filename;
    }
}
