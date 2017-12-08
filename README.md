## Gradle
[![](https://jitpack.io/v/zj565061763/res.svg)](https://jitpack.io/#zj565061763/res)

## Detail
[res_color_base](https://github.com/zj565061763/res/blob/master/lib/src/main/res/values/res_color_base.xml)

## res_colors.xml
```xml
    <!-- 主题颜色 -->
    <color name="res_main_color">#FB6F08</color>
    <!-- 主题颜色按下颜色 -->
    <color name="res_main_color_press">#ffcc66</color>

    <!-- 副主题色 -->
    <color name="res_second_color">#fee203</color>
    <color name="res_second_color_press">@color/res_second_color</color>

    <!-- activity背景颜色 -->
    <color name="res_bg_activity">#f7f7f7</color>
    <!-- 标题栏颜色 -->
    <color name="res_bg_title_bar">@color/res_main_color</color>
    <!-- 标题栏按下颜色 -->
    <color name="res_bg_title_bar_pressed">@color/res_main_color_press</color>

    <!-- 标题栏文字颜色 -->
    <color name="res_text_title_bar">@color/white</color>

    <!-- 灰色文字（深） -->
    <color name="res_text_gray_l">#333333</color>
    <!-- 灰色文字（中） -->
    <color name="res_text_gray_m">#666666</color>
    <!-- 灰色文字（浅） -->
    <color name="res_text_gray_s">#999999</color>

    <!-- 黑色模糊（中） -->
    <color name="res_blur_m">#70000000</color>

    <!-- 输入框hint颜色 -->
    <color name="res_text_hint">#cbcbcb</color>

    <!-- 分割线颜色 -->
    <color name="res_stroke">#e7e7f1</color>
    <!-- 分割线颜色 深 -->
    <color name="res_stroke_deep">#e5e5e5</color>

    <!-- 灰色按下颜色 -->
    <color name="res_gray_press">#e5e5e5</color>
    <!-- 文字阴影颜色 -->
    <color name="res_text_shadow_color">#333333</color>
```

## res_dimens.xml
```xml
    <!-- 标题栏高度 -->
    <dimen name="res_height_title_bar">45dp</dimen>

    <!-- 边框宽度 -->
    <dimen name="res_stroke_s">1px</dimen>
    <dimen name="res_stroke_m">1dp</dimen>

    <!-- 圆角半径 -->
    <dimen name="res_corner_s">5dp</dimen>
    <dimen name="res_corner_m">10dp</dimen>
    <dimen name="res_corner_l">30dp</dimen>

    <!-- 标题栏文字大小 -->
    <dimen name="res_text_title_bar">18sp</dimen>
    <!-- 标题栏较小的文字大小 -->
    <dimen name="res_text_sub_title_bar">16sp</dimen>
    <!-- 标题栏item的最小宽度 -->
    <dimen name="res_width_title_item">40dp</dimen>
    <!-- 标题栏icon图标的宽度 -->
    <dimen name="res_width_title_item_image">20dp</dimen>
    <!-- 标题栏icon图标的高度 -->
    <dimen name="res_height_title_item_image">20dp</dimen>

    <!-- 标题文字（大） -->
    <dimen name="res_text_l">16sp</dimen>
    <!-- 内容文字（中） -->
    <dimen name="res_text_m">14sp</dimen>
    <!-- 内容文字（小） -->
    <dimen name="res_text_s">12sp</dimen>

    <!-- 输入框高度 -->
    <dimen name="res_height_edit">40dp</dimen>
    <!-- 按钮高度 -->
    <dimen name="res_height_button">40dp</dimen>

    <!-- dialog的item高度 -->
    <dimen name="res_height_dialog_item">40dp</dimen>
    <!-- dialog的按钮字体大小 -->
    <dimen name="res_text_dialog_button">14sp</dimen>
    <!-- dialog的标题字体大小 -->
    <dimen name="res_text_dialog_title">16sp</dimen>
```

## res_strings.xml
```xml
    <string name="res_loading">加载中</string>
```

## res_styles.xml
```xml
    <style name="res.Theme.Base" parent="Theme.AppCompat.Light.DarkActionBar">
    </style>

    <style name="res.Theme.App" parent="res.Theme.Base">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>

        <item name="colorPrimary">@color/res_main_color</item>
        <item name="colorAccent">@color/res_main_color</item>
    </style>
```

## res_styles_anim.xml
```xml
    <style name="res.Anim.SlidingBottomBottom" parent="android:Animation">
        <item name="@android:windowEnterAnimation">@anim/res_dialog_enter_sliding_from_bottom</item>
        <item name="@android:windowExitAnimation">@anim/res_dialog_exit_sliding_to_bottom</item>
    </style>

    <style name="res.Anim.SlidingTopTop" parent="android:Animation">
        <item name="@android:windowEnterAnimation">@anim/res_dialog_enter_sliding_from_top</item>
        <item name="@android:windowExitAnimation">@anim/res_dialog_exit_sliding_to_top</item>
    </style>
```

## res_styles_button.xml
```xml
    <style name="res.Button.Base">
    </style>

    <style name="res.Button" parent="res.Button.Base">
        <item name="android:gravity">center</item>
        <item name="android:textSize">@dimen/res_text_m</item>
        <item name="android:ellipsize">end</item>
        <item name="android:minHeight">@dimen/res_height_button</item>
    </style>
```

## res_styles_edit.xml
```xml
    <style name="res.Edit.Base">
    </style>

    <style name="res.Edit" parent="res.Edit.Base">
        <item name="android:textColor">@color/res_text_gray_m</item>
        <item name="android:textSize">@dimen/res_text_m</item>
        <item name="android:ellipsize">end</item>
        <item name="android:paddingLeft">5dp</item>
        <item name="android:paddingRight">5dp</item>
        <item name="android:paddingBottom">5dp</item>
        <item name="android:paddingTop">5dp</item>
        <item name="android:minHeight">@dimen/res_height_edit</item>
        <item name="android:textColorHint">@color/res_text_hint</item>
        <item name="android:gravity">center_vertical</item>
        <item name="android:imeOptions">actionNext</item>
    </style>
```

## res_styles_text.xml
```xml
    <style name="res.Text.Base">
    </style>

    <style name="res.Text" parent="res.Text.Base">
        <item name="android:text">@string/res_loading</item>
        <item name="android:textColor">@color/res_text_gray_m</item>
        <item name="android:textSize">@dimen/res_text_m</item>
        <item name="android:ellipsize">end</item>
    </style>

    <style name="res.Text.Shadow" parent="res.Text">
        <item name="android:shadowColor">@color/res_text_shadow_color</item>
        <item name="android:shadowRadius">1</item>
        <item name="android:shadowDy">2</item>
        <item name="android:shadowDx">2</item>
    </style>
```
