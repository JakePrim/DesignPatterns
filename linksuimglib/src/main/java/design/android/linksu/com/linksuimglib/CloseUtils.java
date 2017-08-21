package design.android.linksu.com.linksuimglib;

import java.io.Closeable;
import java.io.IOException;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/15
 * 描 述：
 * 修订历史：
 * ==========================================
 */

public class CloseUtils {

    public static void closeQuietly(Closeable closeable){
        if (null != closeable){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
