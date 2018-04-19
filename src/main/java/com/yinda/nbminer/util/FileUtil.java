package com.yinda.nbminer.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileUtil {
	
	/**记录日志*/
	//private static Logger LOG=LoggerFactory.getLogger(FileUtil.class);
	
	
	/**获取上传图片路径*/
	public static String getUpLoadPath(String parentPath){
		StringBuffer sb=new StringBuffer();
    	sb.append(parentPath).append(File.separator).append("static")
    	.append(File.separator).append("upload")
    	.append(File.separator).append(DateUtil.getCurDateStr(DateUtil.YYYY_MM_DD).replace("-",""))
    	.append(File.separator).append("img").append(File.separator);
        return sb.toString();
	}
	
	/**根据年月日和随机码生成保存文件路径路径
	 * @param parentPath  request获取项目路径
	 * @param name 文件名称
	 * */
	public static File getFilePath(String parentPath,String name){
		StringBuffer path=new StringBuffer(getUpLoadPath(parentPath));
		path.append(StringUtil.getUUID()).append("_").append(name);
		File file=new File(path.toString());
		if(!file.exists()){
			file.mkdirs();
		}
		return file;
	}
	
	/**文件写到输出流
	 * @throws IOException */
	public static void writeToOutPutStream(InputStream in,OutputStream out) throws IOException{
		byte[] bt=new byte[1024];
		int len=-1;
		while((len=in.read(bt))!=-1){
			out.write(bt, 0, len);
		}
	}
}
