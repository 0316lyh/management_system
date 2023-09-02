package com.lyh.controller;

import com.aliyun.oss.*;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.lyh.bean.Info;
import com.lyh.controller.result.Code;
import com.lyh.controller.result.Result;
import com.lyh.dao.InfoDao;
import com.lyh.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
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


    /**
     * 上传头像到本地
     * @param file
     * @param loginUserId
     * @return
     * @throws com.aliyuncs.exceptions.ClientException
     * @throws IOException
     */
/*    @PostMapping("/{loginUserId}")
    public String add0(MultipartFile file, @PathVariable int loginUserId) {
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
    }*/

    /**
     * 上传头像到阿里云
     * @param file
     * @param loginUserId
     * @return
     * @throws com.aliyuncs.exceptions.ClientException
     * @throws IOException
     */
    @PostMapping("/{loginUserId}")
    public Result add(MultipartFile file, @PathVariable int loginUserId) throws com.aliyuncs.exceptions.ClientException, IOException {
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-guangzhou.aliyuncs.com";
        // 强烈建议不要把访问凭证保存到工程代码里，否则可能导致访问凭证泄露，威胁您账号下所有资源的安全。本代码示例以从环境变量中获取访问凭证为例。运行本代码示例之前，请先配置环境变量。
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "lyh01";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        // String objectName = "avatar/" + loginUserId + "_avatar.jpg";
        String fileName = file.getOriginalFilename();
        String objectName = "avatar/" + fileName;

        String accessKeyId = "xxxxxxxxxxxxx";
        String secretAccessKey = "xxxxxxxxxxxxxxxxx";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, secretAccessKey);

        try {
            InputStream inputStream = file.getInputStream();
            // 创建PutObjectRequest对象。
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, inputStream);
            // 创建PutObject请求。
            PutObjectResult result = ossClient.putObject(putObjectRequest);
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        // 修改用户信息的头像路径
        Info byUserId = infoDao.getByUserId(loginUserId);
        byUserId.setAvatar("https://lyh01.oss-cn-guangzhou.aliyuncs.com/avatar/" + fileName);
        //https://lyh01.oss-cn-guangzhou.aliyuncs.com/avatar/1_avatar.jpg
        infoDao.updateById(byUserId);

        return new Result(200);
    }
}
