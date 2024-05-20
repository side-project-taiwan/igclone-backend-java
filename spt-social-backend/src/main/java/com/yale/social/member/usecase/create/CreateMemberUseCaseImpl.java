package com.yale.social.member.usecase.create;


import com.yale.social.member.controller.create.CreateMemberRequest;
import com.yale.social.member.controller.create.CreateMemberResponse;
import com.yale.social.member.repository.MemberDataService;
import com.yale.social.member.repository.MemberEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateMemberUseCaseImpl implements CreateMemberUseCase {

    private final MemberDataService memberDataService;

    public CreateMemberUseCaseImpl(MemberDataService memberDataService) {
        this.memberDataService = memberDataService;
    }

    @Override
    public CreateMemberResponse createMember(CreateMemberRequest createMemberRequest) {

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setEmail(createMemberRequest.email());
        memberEntity.setName(createMemberRequest.name());
        memberEntity.setPassword(createMemberRequest.password());
        memberEntity.setEnable(false);
        memberDataService.create(memberEntity);

        return new CreateMemberResponse();
    }
}
