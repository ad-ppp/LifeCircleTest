# Activity 回调异同
简单记录 Theme 对 Activity 生命周期的影响

当 Theme 为透明背景当时候， Activity 生命周期回调是有区别的，如下：
以 A->B 为例子
1. 半透明 Theme
2019-05-08 19:13:50.631 25708-25708/com.example.lifecircletest D/TransparentActivity: onStart 228742206
2019-05-08 19:13:50.633 25708-25708/com.example.lifecircletest D/TransparentActivity: onResume 228742206
2019-05-08 19:13:59.565 25708-25708/com.example.lifecircletest D/TransparentActivity: onPause 228742206
2019-05-08 19:13:59.599 25708-25708/com.example.lifecircletest D/TransparentActivity: onStart 143715848
2019-05-08 19:13:59.601 25708-25708/com.example.lifecircletest D/TransparentActivity: onResume 143715848
2019-05-08 19:14:10.352 25708-25708/com.example.lifecircletest D/TransparentActivity: onPause 143715848
2019-05-08 19:14:10.394 25708-25708/com.example.lifecircletest D/TransparentActivity: onResume 228742206
2019-05-08 19:14:10.405 25708-25708/com.example.lifecircletest D/TransparentActivity: onStop 143715848
可以发现：
    启动B页面A页面的 onStop 没有回调
    B 页面finish 时，A 页面的 onStart 也没有回调