#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_pocket_launcher_MainActivity_stringFromJNI(JNIEnv* env, jobject) {
    return env->NewStringUTF("Engine Bedrock Ativa - 32 bits");
}
