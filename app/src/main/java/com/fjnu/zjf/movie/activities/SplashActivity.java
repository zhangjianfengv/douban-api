package com.fjnu.zjf.movie.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.ThisApp;
import com.fjnu.zjf.movie.beans.Splash;
import com.fjnu.zjf.movie.utils.SharedPreferencesUtil;
import com.google.gson.Gson;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.tv_description_splash)
    TextView tvDescription;
    private Gson gson;
    private RequestQueue queue;
    private String url = "http://lab.zuimeia.com/wallpaper/category/1/?appVersion=2.6.3&channel=wallpaper&imsi=460023600495871&systemVersion=22&resolution=1080x1920&platform=android&req_version_code=2&package_name=com.brixd.wallpager&time=0&lang=zh-cn&openUDID=869545021705888&page_size=1";
    private String url1 = "http://wpstatic.zuimeia.com/images/6e5ab099fcb240f471a18be93828166a_1440x1280.jpg?imageMogr/v2/auto-orient/thumbnail/1512x1344/quality/80";
    private long ONE_DAY = 24 * 3600 * 1000;
    private Callback callback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏状态栏
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        ThisApp app = (ThisApp) getApplication();
        gson = app.gson;
        queue = app.queue;
        callback = new Callback() {
            @Override
            public void onSuccess() {
                SharedPreferences preferences = SharedPreferencesUtil.getSharedPreferences(SplashActivity.this);
                String description = preferences.getString("description", "");
                String pubTime = preferences.getString("pubTime", "");
                tvTime.setText(pubTime);
                tvDescription.setText(description);
            }

            @Override
            public void onError() {

            }
        };
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Splash splash = gson.fromJson(s, Splash.class);
                Splash.DataBean.ImagesBean bean = splash.getData().getImages().get(0);
                String imageUrl = bean.getImage_url();
                String description = bean.getDescription();
                String pubTime = bean.getPub_time();
                url1 = url1.replace("images/6e5ab099fcb240f471a18be93828166a_1440x1280.jpg", imageUrl);
                Calendar c1 = Calendar.getInstance();
                c1.setTime(new Date());
                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
                SharedPreferences.Editor editor = SharedPreferencesUtil.getEditor(SplashActivity.this);
                editor.putString("url", url1);
                editor.putString("description", description);
                editor.putString("pubTime", pubTime);
                editor.putString("time", format.format(c1.getTime()) + "010000").apply();
                Picasso.with(SplashActivity.this).load(url1).resize(1080, 1920).centerCrop().into(iv,callback);
            }
        }, null);
        String localTime = SharedPreferencesUtil.getSharedPreferences(this).getString("time", "");
        try {
            if (System.currentTimeMillis() - new SimpleDateFormat("yyyyMMddHHmmss").parse(localTime).getTime() > ONE_DAY)
                queue.add(request);
            else
                Picasso.with(SplashActivity.this).load(SharedPreferencesUtil.getSharedPreferences(this).getString("url", "")).resize(1080, 1920).centerCrop().into(iv,callback);
        } catch (ParseException e) {
            e.printStackTrace();
            queue.add(request);
        }
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                SplashActivity.this.finish();
            }
        };
        timer.schedule(task, 6000);
    }

    /*private class MyTarget implements Target {
        @Override
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            iv.setImageBitmap(bitmap);
            File dir = new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "summer");
            if (dir.isDirectory()) dir.mkdirs();
            File file = new File(dir.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg");
            try {
                if (!file.isFile()) file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onBitmapFailed(Drawable drawable) {

        }

        @Override
        public void onPrepareLoad(Drawable drawable) {

        }
    }
    */
}
