package design.android.linksu.com.linksuimglib;

import android.graphics.Bitmap;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/15
 * 描 述：双缓存类，
 * 修订历史：
 * ==========================================
 */

public class DoubleCache implements ImageCache {
    MemoryCache mImageCache = new MemoryCache();
    DiskCache diskCache = new DiskCache();

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mImageCache.get(url);
        if (bitmap == null) {
            return diskCache.get(url);
        }
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url, bitmap);
        diskCache.put(url, bitmap);
    }
}
