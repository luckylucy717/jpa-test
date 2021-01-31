package com.playground.shopping.member.controller;

import com.playground.shopping.member.model.request.MemberRequest;
import com.playground.shopping.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public String addMember(@RequestBody MemberRequest memberRequest) {
        return memberService.addMember(memberRequest.getUserName(), memberRequest.getAge());
    }
}
