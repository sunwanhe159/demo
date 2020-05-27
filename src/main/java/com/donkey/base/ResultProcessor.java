package com.donkey.base;

import com.donkey.dto.PageResult;

/**
 * Created by sunwh on 2020/5/27.
 */
@FunctionalInterface
public interface ResultProcessor {
    PageResult process();
}
