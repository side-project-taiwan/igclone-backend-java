package com.yale.social.member.repository;

import org.springframework.stereotype.Service;

@Service
public class MemberDataServiceImpl implements MemberDataService {

    private final MemberRepository memberRepository;

    public MemberDataServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public MemberEntity create(MemberEntity memberEntity) {
        return memberRepository.save(memberEntity);
    }
}
