package com.fjnu.zjf.movie;


import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fjnu.zjf.movie.activities.MainActivity;
import com.fjnu.zjf.movie.activities.PhotoActivity;
import com.fjnu.zjf.movie.widgets.ImageControl;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoPagerFragment extends BaseFragment {


    @BindView(R.id.iv_movieImage)
    ImageControl ivMovieImage;
    @BindView(android.R.id.progress)
    ProgressBar progress;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo_pager, container, false);
        ButterKnife.bind(this, view);
        RequestQueue queue= ThisApp.queue;
        ImageRequest request=new ImageRequest(getArguments().getString("url"), new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap bitmap) {
                progress.setVisibility(View.GONE);
                Rect frame = new Rect();
                ((PhotoActivity)mActivity).registerMyTouchListener(mTouchListener);
                mActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
                int statusBarHeight = frame.top;
                int screenW = mActivity.getWindowManager().getDefaultDisplay().getWidth();
                int screenH = mActivity.getWindowManager().getDefaultDisplay().getHeight()
                        - statusBarHeight;
                ivMovieImage.imageInit(bitmap, screenW, screenH, statusBarHeight,
                        null);
            }
        },1080,1920, Bitmap.Config.RGB_565,null);
        queue.add(request);
        return view;
    }
    private PhotoActivity.MyTouchListener mTouchListener=new PhotoActivity.MyTouchListener() {
        @Override
        public void onTouchEvent(MotionEvent event) {
            switch (event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    ivMovieImage.mouseDown(event);
                    break;
                //非第一个点按下
                  case MotionEvent.ACTION_POINTER_DOWN:
                    ivMovieImage.mousePointDown(event);
                    break;
                case MotionEvent.ACTION_MOVE:
                    ivMovieImage.mouseMove(event);

                    break;
                case MotionEvent.ACTION_UP:
                    ivMovieImage.mouseUp();
                    break;
            }
        }
    };
    @Override
    public void onDestroy() {
        super.onDestroy();
        ((PhotoActivity)mActivity).unRegisterMyTouchListener(mTouchListener);
    }

}
