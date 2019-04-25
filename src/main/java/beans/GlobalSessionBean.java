package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "globalSession", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class GlobalSessionBean {
}
