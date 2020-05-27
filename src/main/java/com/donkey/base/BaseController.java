package com.donkey.base;

import com.donkey.dto.PageResult;
import com.donkey.exception.ServiceProcessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sunwh on 2020/5/27.
 */
public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected PageResult restProcessor(ResultProcessor processor){
        PageResult result = null;
        try{
            result = processor.process();
        }
        catch (ServiceProcessException e1){
            logger.error("ServiceProcess Error Log :"+e1.getLocalizedMessage(),e1);
            result = PageResult.error(e1.getMessage());
        }
        catch (Exception e){
            logger.error("Error Log :"+e.getLocalizedMessage(),e);
            result = PageResult.error("服务器出现异常");
        }

        return result;
    }

}
