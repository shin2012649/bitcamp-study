package bitcamp.myapp.controller;

import bitcamp.myapp.dao.MemberDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberListController implements PageController {

  MemberDao memberDao;

  public MemberListController(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setAttribute("list", memberDao.findAll());
    return "/WEB-INF/jsp/member/list.jsp";
  }

}
