package wq.com.tbjexample;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import wq.com.tbjexample.BaseActivity;
import wq.com.tbjexample.R;
import wq.com.tbjexample.UserInfoActivity;
import wq.com.tbjexample.widget.CommonItem;



public class MoreActivity extends BaseActivity implements OnClickListener {
    private static final String TAG = UserInfoActivity.class.getSimpleName();


    private static final String TONG_BAN_JIE_PACKAGE_NAME = "com.tongbanjie.android";
    @BindView(R.id.more_invest_mode)
    CommonItem mInvestMode;
    @BindView(R.id.more_help_and_feedback)
    CommonItem mHelpAndFeedback;
    @BindView(R.id.more_score)
    CommonItem mScore;
    @BindView(R.id.more_setting)
    CommonItem mSetting;
    @BindView(R.id.more_about)
    CommonItem mAbout;
    @BindView(R.id.rl_vip_member)
    RelativeLayout mVipMember;
    @BindView(R.id.rl_task_center)
    RelativeLayout mTaskCenter;
    @BindView(R.id.tv_full_name)
    TextView tvFullName;
    @BindView(R.id.tv_user_name)
    TextView tvUserName;
    @BindView(R.id.iv_level_icon)
    ImageView ivLevelIcon;
    @BindView(R.id.tv_level_tip)
    TextView tvLevelTip;
    @BindView(R.id.ll_level_des)
    LinearLayout llLevelDes;
    @BindView(R.id.rl_user_info)
    RelativeLayout rlUserInfo;
    @BindView(R.id.tv_vip_member)
    TextView tvVipMember;
    @BindView(R.id.tv_task_center)
    TextView tvTaskCenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_more);
        ButterKnife.bind(this);
        super.onCreate(savedInstanceState);
    }


    @Override
    public void initData() {

    }

    @Override
    public void initTitle() {

    }

    @Override
    public void initView() {
        mInvestMode.setType(CommonItem.Type.All);
        mInvestMode.setSummaryImg(R.drawable.icon_riskstyle);
        mInvestMode.setSummaryText("投资风格");
        mInvestMode.setDetailText("未测评");
        mInvestMode.setDetailImg(R.mipmap.icon_triangle_arrow);

        mHelpAndFeedback.setType(CommonItem.Type.SummaryImgSummaryTxt_DetailImg);
        mHelpAndFeedback.setSummaryImg(R.drawable.icon_service);
        mHelpAndFeedback.setSummaryText("帮助与反馈");
        mHelpAndFeedback.setDetailImg(R.mipmap.icon_triangle_arrow);

        mScore.setType(CommonItem.Type.SummaryImgSummaryTxt_DetailImg);
        mScore.setSummaryImg(R.drawable.icon_evaluate);
        mScore.setSummaryText("评价一下");
        mScore.setDetailImg(R.mipmap.icon_triangle_arrow);

        mSetting.setType(CommonItem.Type.All);
        mSetting.setSummaryImg(R.drawable.icon_more_settings);
        mSetting.setSummaryText("设置");
        mSetting.getDetailTextView().setText("");
        setIndicatorSize(mSetting.getDetailTextView());
        mSetting.getDetailTextView().setBackgroundResource(R.drawable.bg_indicator);
        mSetting.setDetailImg(R.mipmap.icon_triangle_arrow);

        mAbout.setType(CommonItem.Type.SummaryImgSummaryTxt_DetailImg);
        mAbout.setSummaryImg(R.drawable.icon_about_tbj);
        mAbout.setSummaryText("了解我们");
        mAbout.setDetailImg(R.mipmap.icon_triangle_arrow);
    }

    private void setIndicatorSize(TextView textView) {
        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        lp.width = (int) this.getResources().getDimension(R.dimen.indicator_width);
        lp.height = (int) this.getResources().getDimension(R.dimen.indicator_width);
        textView.setLayoutParams(lp);
    }

    @Override
    public void setListener() {
        tvFullName.setOnClickListener(this);
        mVipMember.setOnClickListener(this);
        mTaskCenter.setOnClickListener(this);
        mInvestMode.setOnClickListener(this);
        mHelpAndFeedback.setOnClickListener(this);
        mScore.setOnClickListener(this);
        mSetting.setOnClickListener(this);
        mAbout.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {

    }
}
