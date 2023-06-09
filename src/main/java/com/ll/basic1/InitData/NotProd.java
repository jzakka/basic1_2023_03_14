package com.ll.basic1.InitData;

import com.ll.basic1.boundedcontext.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev", "test"})
public class NotProd {

    @Bean
    CommandLineRunner initData(MemberService memberService) {
        return args -> {
           memberService.join("user1","1234");
           memberService.join("abc","12345");
           memberService.join("test","12346");
           memberService.join("love","12347");
           memberService.join("like","12348");
           memberService.join("giving","12349");
           memberService.join("thanks","123410");
           memberService.join("hello","123411");
           memberService.join("good","123412");
           memberService.join("peace","123413");
        };
    }
}
