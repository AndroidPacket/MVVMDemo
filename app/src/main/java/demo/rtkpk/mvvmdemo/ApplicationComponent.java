package demo.rtkpk.mvvmdemo;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules  ={
                ApplicationModule.class,

}
)
public class ApplicationComponent {
}
