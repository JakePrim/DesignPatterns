package design.android.linksu.com.linksuimglib;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/15
 * 描 述：处理图片缓存
 * 修订历史：
 * ==========================================
 */

public interface ImageCache {
    public void put(String url, Bitmap bitmap);

    public Bitmap get(String url);

}
