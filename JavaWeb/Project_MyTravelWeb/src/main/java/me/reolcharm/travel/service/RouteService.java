/**
 * @Project: HeimaTravelWeb
 * @Author: Reolcharm
 * @CreatedTime: 2018-10-14 20:31
 * @Description:
 **/
package me.reolcharm.travel.service;

import me.reolcharm.travel.domain.PageBean;
import me.reolcharm.travel.domain.Route;

public interface RouteService {

    PageBean<Route> getPageBean(int cid, int currentPage);

}