package wq.com.tbjexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;


import butterknife.BindView;
import butterknife.ButterKnife;
import wq.com.tbjexample.widget.CommonItem;
import wq.com.tbjexample.widget.TitleBarView;

/**
 *
 * 编辑个人资料
 */
public class UserInfoActivity extends BaseActivity implements OnClickListener {
	private static final String TAG = UserInfoActivity.class.getSimpleName();


	@BindView(R.id.titlebar)
	TitleBarView mTitleBar;
	@BindView(R.id.userinfo_nick)
	CommonItem mNick;
	@BindView(R.id.userinfo_sign)
	CommonItem mSign;
	@BindView(R.id.userinfo_gender)
	CommonItem mGender;
	@BindView(R.id.userinfo_age)
	CommonItem mAge;
	@BindView(R.id.userinfo_tall)
	CommonItem mTall;
	@BindView(R.id.userinfo_weight)
	CommonItem mWeight;
	@BindView(R.id.userinfo_contact)
	CommonItem mContact;


	public static void start(Context context) {
		Intent intent = new Intent(context, UserInfoActivity.class);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_user_info);
		ButterKnife.bind(this);
		super.onCreate(savedInstanceState);
	}

	@Override
	public void initData() {

	}

	@Override
	public void initTitle() {
		mTitleBar.initTitleWithLeftTxtDrawable("编辑个人资料", "返回", R.drawable.btn_back_sel, 5);
		mTitleBar.setOnLeftTxtClickListener(new TitleBarView.OnLeftTxtClickListener() {
			@Override
			public void onClick() {
				finish();
			}
		});
	}

	@Override
	public void initView() {
		setCommonItem(mNick, "昵称", "50% percent pain");
		setCommonItem(mSign, "个性签名", "coding for fun!");
		setCommonItem(mGender, "性别", "男");
		setCommonItem(mAge, "年龄", "27");
		setCommonItem(mTall, "身高", "170 cm");
		setCommonItem(mWeight, "体重", "65.0 kg");
		setCommonItem(mContact, "联系方式", null);
	}

	private void setCommonItem(CommonItem commonItem, String summaryTxt, String detailTxt) {
		commonItem.setType(CommonItem.Type.SummaryTxt_DetailTxtDetailImg);
		commonItem.setSummaryText(summaryTxt);
		commonItem.setDetailText(detailTxt);
		commonItem.setDetailImg(R.mipmap.icon_triangle_arrow);
	}

	@Override
	public void setListener() {
		mNick.setOnClickListener(this);
		mSign.setOnClickListener(this);
		mGender.setOnClickListener(this);
		mAge.setOnClickListener(this);
		mTall.setOnClickListener(this);
		mWeight.setOnClickListener(this);
		mContact.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

	}



}
