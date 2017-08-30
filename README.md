# AndroidResource

## res_colors_base
```xml
    <color name="black">#000000</color>
    <color name="white">#FFFFFF</color>
    <color name="gray">#888888</color>
    <color name="red">#FF0000</color>
    <color name="orange">#FFA500</color>
    <color name="yellow">#FFFF00</color>
    <color name="green">#00FF00</color>
    <color name="blue">#0000FF</color>
    <!-- 透明 -->
    <color name="transparent">#00000000</color>
```

## res_colors
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

## res_dimens
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
