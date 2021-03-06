package com.yxmcute.codelabs.base

import android.os.Bundle
import android.view.View
import com.yxmcute.codelabs.R
import com.yxmcute.codelabs.base.kotlin.Single
import com.yxmcute.codelabs.base.kotlin.SingleWithArgue

/**
 * @author Koma
 * @date 2020/7/7 23:13
 * @filename  TocFragment
 * @description
 */
class TocFragment : BaseFragment(R.layout.fragment_toc) {
  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    SingleWithArgue.getInstance(activity!!)

  }

}