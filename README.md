# DesignDemo
DesignDemo

![功能效果](https://github.com/jingerlovexiaojie/DesignDemo/blob/master/app/src/main/res/drawable/design.gif)

分几块
ViewPager + TabLayout 联动

       <!--
            app:tabBackground 设置背景色
             app:tabTextColor设置未被选中的颜色
            app:tabIndicatorColor小滑块的颜色
            app:tabSelectedTextColor选中的颜色和小滑块的颜色
            app:tabTextAppearance设置字体的样式
            -->

      <android.support.design.widget.TabLayout
                android:id="@+id/tab"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:tabBackground="@color/colorPrimaryDark"
                app:tabIndicatorColor="@android:color/holo_blue_bright"
                app:tabSelectedTextColor="@android:color/holo_blue_bright"
                app:tabTextAppearance="@android:style/TextAppearance.DeviceDefault.Small"
                app:tabTextColor="@android:color/white" />

            <android.support.v4.view.ViewPager
                android:id="@+id/viewPager"
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1"/>
                
ToolBar
DrawerLayout 侧滑菜单 （盖住Toobar 和不盖住）

ToolBar效果和ActionBar是一样的，用Toolbar代替ActionBar的原因，可以简单的指定它的位置，这样它现在是一个控件了，而不是系统级的东西，比ActionBar更加灵活。

让DrawerLayout和Toolbarl连用

 <android.support.v7.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?actionBarSize"
        android:background="@color/colorPrimary"
        android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar" />

