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
import wq.com.tbjexample.dialog.CommonDialog;
import wq.com.tbjexample.dialog.EvaluateDialog;
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



//    @Override
//    public void onClick(View v) {
//
//    }





    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.more_invest_mode:
//				CheckPhoneActivity.start(getActivity(), true, "");
              //  EvaluateRiskActivity.start(getActivity());
                break;
            case R.id.rl_vip_member:
                break;
            case R.id.rl_task_center:
                break;
            case R.id.tv_full_name:
                new CommonDialog(this).builder()
                        .setTitle("提示").setContentMsg("您尚未认证身份信息\n请添加银行卡进行身份认证")
                        .setNegativeBtn("取消", new CommonDialog.OnNegativeListener() {
                            @Override
                            public void onNegative(View view) {
//                                ToastUtils.showShort("取消");
                            }
                        })
                        .setPositiveBtn("添加银行卡", new CommonDialog.OnPositiveListener() {
                            @Override
                            public void onPositive(View view) {
//                                BankCardAddActivity.start(getActivity());
                            }
                        })
                        .show();
                break;
            case R.id.more_help_and_feedback:
//                HelpAndFeedbackActivity.start(getActivity());
                break;
            case R.id.more_score:
                final EvaluateDialog evaluateDialog = new EvaluateDialog(this, R.style.EvaluateDialog);
                evaluateDialog.setOnCancelListener(new EvaluateDialog.OnCancelListener() {
                    @Override
                    public void onCancel(View v) {
                    }
                });
                evaluateDialog.setOnStoreListener(new EvaluateDialog.OnStoreListener() {
                    @Override
                    public void onStore(View v) {
//                        MarketUtils.searchAppByPkgName(getActivity(), TONG_BAN_JIE_PACKAGE_NAME);
                    }
                });
                evaluateDialog.setOnFeedbackListener(new EvaluateDialog.OnFeedbackListener() {
                    @Override
                    public void onFeedback(View v) {
//                        FeedbackActivity.start(getActivity());
                    }
                });
                evaluateDialog.show();
                break;
            case R.id.more_setting:
//                SettingActivity.start(getActivity());
                break;
            case R.id.more_about:
                break;
            default:
                break;
        }
    }

}
