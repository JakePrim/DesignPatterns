package design.android.linksu.com.linksuimglib;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/15
 * 描 述：内存缓存
 * 修订历史：
 * ==========================================
 */

public class MemoryCache implements ImageCache {
    LruCache<String, Bitmap> mImageCache;

    public MemoryCache() {
        initCache();
    }

    // 初始化缓存
    private void initCache() {
        //获取最大可使用内存
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        //取四分之一可用的内存为缓存
        int memoryCacheSize = maxMemory / 4;
        //默认情况下，缓存大小以条目数量来衡量。覆盖sizeOf（K，V）以使缓存的大小不同。例如，这个缓存限于4MiB的位图：
        mImageCache = new LruCache<String, Bitmap>(memoryCacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        return mImageCache.get(url);
    }
}
