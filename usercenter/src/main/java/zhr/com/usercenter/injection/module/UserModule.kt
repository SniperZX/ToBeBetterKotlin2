package zhr.com.usercenter.injection.module

import dagger.Module
import dagger.Provides
import zhr.com.usercenter.service.UserService
import zhr.com.usercenter.service.impl.UserServiceImpl

/**
 * Author by zhaohongru
 * Email 764117736@qq.com
 * Date on 2019-06-26.
 * PS: Not easy to write code, please indicate.
 */
@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl):UserService{
        return service
    }

}