package zhr.com.baselibrary.data.net

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import zhr.com.baselibrary.common.Constants
import java.util.concurrent.TimeUnit

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-25.
 * PS: Not easy to write code, please indicate.
 */
class RetrofitFactory private constructor(){

    companion object {
        val instance: RetrofitFactory by lazy { RetrofitFactory() }
    }


    private val retrofit : Retrofit
    private val interceptor:Interceptor

    init {
        interceptor = Interceptor {
            chain -> val req = chain.request().newBuilder()
                .addHeader("Content-type","Application/json")
                .addHeader("encode","utf-8")
                .build()

            chain.proceed(req)
        }

        retrofit = Retrofit.Builder()
            .baseUrl(Constants.SERVER_ADDRESS)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(initClient())
            .build()

    }

    private fun initClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(10,TimeUnit.SECONDS)
            .readTimeout(10,TimeUnit.SECONDS)
            .addInterceptor(initLogingInteceptor())
            .addInterceptor(interceptor)
            .build()
    }

    private fun initLogingInteceptor(): Interceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor

    }

    fun <T> create(service:Class<T>):T{
        return retrofit.create(service)
    }
}