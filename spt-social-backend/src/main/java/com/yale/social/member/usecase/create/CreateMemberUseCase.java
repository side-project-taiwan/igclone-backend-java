package com.yale.social.member.usecase.create;

import com.yale.social.member.controller.create.CreateMemberRequest;
import com.yale.social.member.controller.create.CreateMemberResponse;

public interface CreateMemberUseCase {

    public CreateMemberResponse createMember(CreateMemberRequest createMemberRequest);
}
