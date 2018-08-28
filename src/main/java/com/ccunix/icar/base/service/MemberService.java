package com.ccunix.icar.base.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.icar.base.dao.MemberDao;
import com.ccunix.icar.base.domain.Member;
 
@Service
public class MemberService {
      
     @Resource(name="memberDao")
     private MemberDao memberDao;
      
     public void setMemberDao(MemberDao memberDao)
     {
        this.memberDao = memberDao;
     }
       
     public void add(Member member){
         memberDao.add(member);
     }
      
     public void delete(String id){
         memberDao.delete(id);
     }
      
     public Member get(String id)
     {
         return memberDao.get(id);
     }
}