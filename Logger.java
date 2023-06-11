
import android.util.Log;

 public interface Logger {

     static void logv(boolean isLog,String tag, Object message){
        if (isLog && BuildConfig.DEBUG) {
            Log.v(tag, message.toString());
        }
    }

     static void logd(boolean isLog,String tag, Object message){
        if (isLog && BuildConfig.DEBUG) {
            Log.d(tag, message.toString());
        }
    }

     static void logi(boolean isLog,String tag, Object message){
        if (isLog && BuildConfig.DEBUG) {
            Log.i(tag, message.toString());
        }
    }

     static void loge(boolean isLog,String tag, Object message){
        if (isLog && BuildConfig.DEBUG) {
            Log.e(tag, message.toString());
        }
    }

     static void logw(boolean isLog,String tag, Object message){
        if (isLog && BuildConfig.DEBUG) {
            Log.w(tag, message.toString());
        }
    }

     default void logv(String tag, Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.v(tag, message.toString());
         }
     }

     default void logd(String tag, Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.d(tag, message.toString());
         }
     }

     default void logi(String tag, Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.i(tag, message.toString());
         }
     }

     default void loge(String tag, Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.e(tag, message.toString());
         }
     }

     default void logw(String tag, Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.w(tag, message.toString());
         }
     }

     default void logv(Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.v(TAG(), message.toString());
         }
     }

     default void logd( Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.d(TAG(), message.toString());
         }
     }

     default void logi( Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.i(TAG(), message.toString());
         }
     }

     default void loge( Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.e(TAG(), message.toString());
         }
     }

     default void logw( Object message){
         if (isLog() && BuildConfig.DEBUG) {
             Log.w(TAG(), message.toString());
         }
     }

     boolean isLog();

     String TAG();





}
