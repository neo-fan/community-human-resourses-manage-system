package com.cprms.web.listenner;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AListennet
 *
 */
@WebListener
public class AListennet implements ServletRequestAttributeListener, ServletRequestListener, AsyncListener {

    public AListennet() {
    }

    public void onComplete(AsyncEvent arg0) throws java.io.IOException { 
    }

    public void requestDestroyed(ServletRequestEvent arg0)  { 
    }

    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
    }


    public void onError(AsyncEvent arg0) throws java.io.IOException { 
    }


    public void onStartAsync(AsyncEvent arg0) throws java.io.IOException { 
    }

    public void requestInitialized(ServletRequestEvent arg0)  { 
    }

    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
    }
    public void onTimeout(AsyncEvent arg0) throws java.io.IOException { 
    }
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    }
	
}
