package design.android.linksu.com.linksuimglib;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.util.LruCache;
import android.widget.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.HttpsURLConnection;

import static android.content.ContentValues.TAG;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/15
 * 描 述：图片加载类
 * 修订历史：v1.0 面向对象的六大原则 单一职责原则
 * ==========================================
 */

public class Links {
    private static Links mLink;
    //图片缓存
//    LruCache<String, Bitmap> mImageCache;
    ImageCache mImageCache = new MemoryCache();
    //线程池，线程数量为cpu的数量
    ExecutorService mExecutor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


    public static Links getLink() {
        if (mLink == null) {
            synchronized (Links.class) {
                if (mLink == null) {
                    mLink = new Links();
                }
            }
        }
        return mLink;
    }

    private Links() {
        defultImageCache();
    }

    /**
     * 默认图片缓存
     */
    private void defultImageCache() {
//        //获取最大可使用内存
//        int maxMemory = (int) Runtime.getRuntime().maxMemory();
//        //取四分之一可用的内存为缓存
//        int memoryCacheSize = maxMemory / 4;
//        //默认情况下，缓存大小以条目数量来衡量。覆盖sizeOf（K，V）以使缓存的大小不同。例如，这个缓存限于4MiB的位图：
//        mImageCache = new LruCache<String, Bitmap>(memoryCacheSize) {
//            @Override
//            protected int sizeOf(String key, Bitmap value) {
//                return value.getRowBytes() * value.getHeight() / 1024;
//            }
//        };
    }

    public void setImageCache(ImageCache mImageCache) {
        this.mImageCache = mImageCache;
    }

    /**
     * 开始加载并显示图片
     *
     * @param url
     * @param imageView
     */
    public void intoImage(final String url, final ImageView imageView) {
        Bitmap bitmap = mImageCache.get(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        submitLoadRequest(imageView, url);
    }

    private void submitLoadRequest(final ImageView imageView, final String url) {
        imageView.setTag(url);
        mExecutor.submit(new Runnable() { // 没有缓存的在线程池中加载图片
            @Override
            public void run() {
                Bitmap bitmap = defultDownloadImage(url);
                if (bitmap == null) {
                    return;
                }
                if (imageView.getTag().equals(url)) {
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(url, bitmap);
            }
        });
    }

    /**
     * 默认使用HttpUrlConnection 加载图片
     *
     * @param url
     * @return
     */
    private Bitmap defultDownloadImage(String url) {
        Log.e(TAG, "defultDownloadImage: url:" + url);
        Bitmap bitmap = null;
        try {
            URL imgurl = new URL(url);
            HttpsURLConnection connection = (HttpsURLConnection) imgurl.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
