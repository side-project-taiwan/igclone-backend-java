package com.yale.social.member.controller.create;


import com.yale.social.member.usecase.create.CreateMemberUseCase;
import com.yale.social.member.usecase.create.CreateMemberUseCaseImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/member")
public class CreateMemberController {
    private final CreateMemberUseCase createMemberUseCase;

    public CreateMemberController(CreateMemberUseCase createMemberUseCase) {
        this.createMemberUseCase = createMemberUseCase;
    }

    @PostMapping("/create-member")
    public CreateMemberResponse createMember(@RequestBody CreateMemberRequest createMemberRequest) {
        return createMemberUseCase.createMember(createMemberRequest);
    }


}
